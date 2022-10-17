package dataAccess;

import java.util.ArrayList;
import java.util.List;

import entities.Category;

public class HibernateCategoryDao implements CategoryDao {
	@Override
	public void add(Category category) {
		System.out.println("Category " + category.getName() + " added to database using Hibernate");
	}

	@Override
	public List<Category> fetchCategories() {
		ArrayList<Category> categories = new ArrayList<Category>();
		categories.add(new Category(1, "Junior"));
		return categories;
	}
}
