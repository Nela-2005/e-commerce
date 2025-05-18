package com.e_commerce.Inventory.Management.System.Mapper;

import com.e_commerce.Inventory.Management.System.Dto.ProductDto;
import com.e_commerce.Inventory.Management.System.Entity.Category;
import com.e_commerce.Inventory.Management.System.Entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper( ProductMapper.class );

    @Mapping(source = "categoryId", target = "category")
    Product productDtoToProduct(ProductDto productDto);

    Category map(Long id);
}
