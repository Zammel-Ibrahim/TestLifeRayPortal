package pl.mmalik.portal.testPortal.controller;


import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import pl.mmalik.portal.testPortal.service.RecipiesService;


/**
 * Portlet implementation class RecipiesPortlet
 */
@Controller("recipiesPortletController")
@RequestMapping(value = "VIEW")
public class RecipiesPortletController {
	private final static String VIEW_URL = "recipies/view";
	
	@Autowired
	private RecipiesService service;
	
	@RenderMapping
	public String showAllRecipies( Model model, RenderRequest request, RenderResponse response){
		model.addAttribute("recipies", service.setRecipies());
		return VIEW_URL;
	}
    
	
//	@RenderMapping(params="action=render")
//	public String showSpecialSinge(@ModelAttribute Model model,RenderRequest request, RenderResponse response){
//		return VIEW_URL;
//	}
}
