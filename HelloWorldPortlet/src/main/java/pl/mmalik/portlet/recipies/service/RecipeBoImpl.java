package pl.mmalik.portlet.recipies.service;

import java.util.List;

import org.springframework.stereotype.Service;

import pl.mmalik.portlet.recipies.domain.Recipie;

import com.google.common.collect.Lists;

@Service
public class RecipeBoImpl implements RecipeBo{
	private List<Recipie> recipies = Lists.newArrayList();
	
	public RecipeBoImpl(){
		recipies = Lists.newArrayList(
				new Recipie.Builder()
					.setName("Lasagne")
					.setDescription("Orginal Itailan Lasagne")
					.setReadyIn(120)
					.setCategory("Pasta")
					.build(),
				new Recipie.Builder()
					.setName("Chilli Concarna")
					.setDescription("Mexican spicy dish")
					.setReadyIn(80)
					.setCategory("Spicy")
					.build(),
				new Recipie.Builder()
					.setName("Kotlet schabowy")
					.setDescription("Orginal Polish dish, most common around polish students")
					.setReadyIn(120)
					.setCategory("Polish")
					.build());
				
		
	}
	public int addNewRecipe(Recipie newRecipe){
		recipies.add(newRecipe);
		return recipies.size();
	}
	
	public int deleteRecipe(int recipieId){
		if(recipies.get(recipieId) != null){
			recipies.remove(recipieId);
		}		
		return recipies.size();
	}
	
	public int updateRecipe(int recipeId, Recipie recipe){
		if(recipies.get(recipeId) != null){
			recipies.set(recipeId, recipe);
		}
		
		return recipies.size();
	}
	
	public List<Recipie> getList(){
		return recipies;
	}
}
