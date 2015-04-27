package pl.mmalik.portlet.recipies.command;

import java.util.List;

import pl.mmalik.portlet.recipies.domain.Recipie;

import com.google.common.collect.Lists;

public class RecipieCommand {
	private Recipie newRecipie;
	private List<Recipie> recipies = Lists.newArrayList();

	public Recipie getNewRecipie() {
		return newRecipie;
	}

	public void setNewRecipie(Recipie newRecipie) {
		this.newRecipie = newRecipie;
	}

	public List<Recipie> getRecipies() {
		return recipies;
	}

	public void setRecipies(List<Recipie> recipies) {
		this.recipies = recipies;
	}

}
