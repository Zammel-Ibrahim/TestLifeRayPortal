<#macro common>
	<#assign portlet=JspTaglibs["http://java.sun.com/portlet"]> 
	<#assign aui=JspTaglibs["http://liferay.com/tld/aui"]>
	<@portlet.defineObjects />
	<h2>${user.greeting}</h2>
</#macro>