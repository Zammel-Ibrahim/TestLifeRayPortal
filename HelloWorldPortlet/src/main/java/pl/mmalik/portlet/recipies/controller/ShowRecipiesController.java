package pl.mmalik.portlet.recipies.controller;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import pl.mmalik.portlet.recipies.command.RecipieCommand;
import pl.mmalik.portlet.recipies.domain.Recipie;
import pl.mmalik.portlet.recipies.service.RecipeBo;

@Controller
@RequestMapping("VIEW")
public class ShowRecipiesController {
	private static final String COMMAND_NAME = "command";
	private static final String SHOW_ALL_VIEW = "recipies/showAll";
	private static final String SHOW_ADD_VIEW = "recipies/addNew";
	
	@Autowired
	private RecipeBo recipeBo;

	@RenderMapping
	public String showAllRecipies(@ModelAttribute(COMMAND_NAME) RecipieCommand command, 
			RenderRequest request, RenderResponse response){
		command.setRecipies(recipeBo.getList());
		return SHOW_ALL_VIEW;
	}

	@RenderMapping(params = "action=addNewView") 
	String addNewView(@ModelAttribute(COMMAND_NAME) Recipie command,
			RenderRequest request, RenderResponse response){
		return SHOW_ADD_VIEW;
	}
	
	@ActionMapping(params = "action=addRecipie")
	public void addRecipie(@ModelAttribute("recipe") Recipie recipe,
			ActionRequest request, ActionResponse response) {
		System.out.println("New Recipient " + recipe);
		
		recipeBo.addNewRecipe(recipe);
		
	}
}
