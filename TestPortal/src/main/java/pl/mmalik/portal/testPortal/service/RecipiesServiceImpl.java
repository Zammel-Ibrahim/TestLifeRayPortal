package pl.mmalik.portal.testPortal.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;

import pl.mmalik.portal.testPortal.domain.Recipies;

@Component
public class RecipiesServiceImpl implements RecipiesService {

	@Override
	public List<Recipies> setRecipies() {
		return Lists.newArrayList(new Recipies("Jabłecznik", 60, 1),
				new Recipies("Lasagna ze szpinakiem", 120, 3), 
				new Recipies("Aaas", 150, 4));
	}
}
