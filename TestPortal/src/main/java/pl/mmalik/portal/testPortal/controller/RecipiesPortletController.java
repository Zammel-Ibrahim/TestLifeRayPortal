package pl.mmalik.portal.testPortal.controller;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import pl.mmalik.portal.testPortal.service.RecipiesService;

/**
 * Portlet implementation class RecipiesPortlet
 */
@Controller("recipiesPortletController")
@RequestMapping("VIEW")
public class RecipiesPortletController {
	private final static String VIEW_URL = "recipies/view";

	@Autowired
	@Qualifier("recipiesService")
	private RecipiesService service;

	@RenderMapping
	public String showAllRecipies(Model model, RenderRequest request,
			RenderResponse response) {
		model.addAttribute("recipies", service.setRecipies());
		return VIEW_URL;
	}

	@ActionMapping(params = "action=special")
	public String listExtraRecipies(Model model, ActionRequest request, ActionResponse response) {
		model.addAttribute("recipies", service.listSpecialRecipies());
		return VIEW_URL;
	}
	
	@ActionMapping(params = "action=render")
	public String showSpecialSinge(ActionRequest request, ActionResponse response) {
		return VIEW_URL;
	}
}
