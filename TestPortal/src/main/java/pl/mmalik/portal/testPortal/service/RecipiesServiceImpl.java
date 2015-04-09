package pl.mmalik.portal.testPortal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import pl.mmalik.portal.testPortal.domain.Recipies;

import com.google.common.collect.Lists;

@Service("recipiesService")
public class RecipiesServiceImpl implements RecipiesService {

	@Override
	public List<Recipies> setRecipies() {
		return Lists.newArrayList(new Recipies("Jabłecznik", 60, 1),
				new Recipies("Lasagna ze szpinakiem", 120, 3), 
				new Recipies("Aaas", 150, 4));
	}

	@Override
	public List<Recipies> listSpecialRecipies() {
		return Lists.newArrayList(
				new Recipies("Zupa - EinTop", 30, 2),
				new Recipies("Kurczak z gruszką w sosie winnym z Gorgonzoli", 120, 5), 
				new Recipies("RaGuu", 160, 5));
	}
}
