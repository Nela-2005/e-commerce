package com.e_commerce.Inventory.Management.System.Controller;
//import com.e_commerce.Services.CategoryService;
import com.e_commerce.Inventory.Management.System.Dto.CategoryDto;
import com.e_commerce.Inventory.Management.System.Entity.Category;
import com.e_commerce.Inventory.Management.System.Services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public ResponseEntity<Category> create(@RequestBody CategoryDto categoryDto) {
        Category category = categoryService.createCategory(categoryDto);
        return new ResponseEntity<>(category, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Category>> getAllCategories() {
        List<Category> categories = this.categoryService.getALlCategories();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }
}