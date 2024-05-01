// CategoryService.java
package com.nimap.service;

import com.nimap.entity.Category;
import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();

    Category createCategory(Category category);

    Category getCategoryById(int id);

    Category updateCategory(int id, Category categoryDetails);

    void deleteCategory(int id);
}
