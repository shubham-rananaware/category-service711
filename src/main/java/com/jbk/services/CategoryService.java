package com.jbk.services;

import com.jbk.models.CategoryModel;

public interface CategoryService {

	
	public boolean addCategory(CategoryModel categoryModel);
//	public CategoryModel getCategoryByName(String categoryName);
	public CategoryModel getCategoryById(long categoryId);
	public boolean updateCategory(CategoryModel categoryModel);
}
