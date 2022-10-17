package business;

import java.util.List;

import dataAccess.CategoryDao;
import entities.Category;
import logging.BaseLogger;

public class CategoryManager {
	private CategoryDao categoryDao;
	private BaseLogger[] loggers;
	private List<Category> categories;

	public CategoryManager(CategoryDao categoryDao, BaseLogger[] loggers) {
		this.categoryDao=categoryDao;
		this.loggers=loggers;
		categories=categoryDao.fetchCategories();
	}
	
	public void add(Category category) throws Exception {
		if(categories.stream().anyMatch(c -> c.getName().equalsIgnoreCase(category.getName()))) {
			throw new Exception("Category name can't be same.");
		}
		
		categoryDao.add(category);
		
		for(BaseLogger logger : loggers) {
			logger.log(category.getName());
		}
	}
	
	
}
