package com.e_commerce.Inventory.Management.System.Services;

import com.e_commerce.Inventory.Management.System.Dto.CategoryDto;
import com.e_commerce.Inventory.Management.System.Entity.Category;
import com.e_commerce.Inventory.Management.System.Mapper.CategoryMapper;
import com.e_commerce.Inventory.Management.System.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category createCategory(CategoryDto categoryDto) {
        Category category = CategoryMapper.INSTANCE.categoryDtoToCategory(categoryDto);
        return categoryRepository.save(category);
    }

    public CategoryRepository getCategoryRepository() {
        return categoryRepository;
    }

    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getALlCategories() {
        return categoryRepository.findAll();
    }
}