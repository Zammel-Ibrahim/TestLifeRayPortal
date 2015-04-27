package pl.mmalik.portlet.recipies.service;

import java.util.List;

import pl.mmalik.portlet.recipies.domain.Recipie;

public interface RecipeBo {
	public int addNewRecipe(Recipie newRecipe);
	public int deleteRecipe(int recipieId);
	public int updateRecipe(int recipeId, Recipie recipe);
	public List<Recipie> getList();
}
