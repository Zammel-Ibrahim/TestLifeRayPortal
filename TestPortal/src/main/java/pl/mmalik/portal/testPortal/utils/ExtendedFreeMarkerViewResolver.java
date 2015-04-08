package pl.mmalik.portal.testPortal.utils;

import java.lang.reflect.Method;

import javax.portlet.PortletContext;
import javax.servlet.ServletContext;

import org.springframework.web.portlet.context.PortletContextAware;
import org.springframework.web.servlet.view.AbstractUrlBasedView;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerView;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

public class ExtendedFreeMarkerViewResolver extends FreeMarkerViewResolver implements PortletContextAware {
    private FreeMarkerConfigurer freemarkerConfigurer;
    
    @Override
    protected AbstractUrlBasedView buildView(String viewName) throws Exception {
            FreeMarkerView freemarkerView = (FreeMarkerView) super.buildView(viewName);

            freemarkerView.setConfiguration(freemarkerConfigurer.getConfiguration());
            freemarkerView.setServletContext(getServletContext());

            return freemarkerView;
    }

    public void setFreemarkerConfigurer(FreeMarkerConfigurer freemarkerConfigurer) {
            this.freemarkerConfigurer = freemarkerConfigurer;
    }

    @Override
    public void setPortletContext(PortletContext context) {
            try {
                    Method meth = context.getClass().getDeclaredMethod("getServletContext");
                    setServletContext((ServletContext)meth.invoke(context));
            } catch (Exception e) {
                    throw new UnsupportedOperationException("Could not get servletcontext", e);
            }
    }

}
