package dataAccess;

import java.util.List;

import entities.Category;

public interface CategoryDao {
	void add(Category category);

	List<Category> fetchCategories();
}
