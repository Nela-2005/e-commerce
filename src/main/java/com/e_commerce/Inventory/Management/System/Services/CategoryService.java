package com.e_commerce.Inventory.Management.System.Services;

import com.e_commerce.Inventory.Management.System.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;
}