package com.e_commerce.Inventory.Management.System.Mapper;

import com.e_commerce.Inventory.Management.System.Dto.CategoryDto;
import com.e_commerce.Inventory.Management.System.Dto.ProductDto;
import com.e_commerce.Inventory.Management.System.Entity.Category;
import com.e_commerce.Inventory.Management.System.Entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper( CategoryMapper.class );

    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "name", ignore = true)
    Category categoryDtoToCategory(CategoryDto categoryDto);
}
