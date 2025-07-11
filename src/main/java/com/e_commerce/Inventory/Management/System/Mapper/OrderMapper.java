package com.e_commerce.Inventory.Management.System.Mapper;


import com.e_commerce.Inventory.Management.System.Dto.OrderDto;
import com.e_commerce.Inventory.Management.System.Dto.ProductDto;
import com.e_commerce.Inventory.Management.System.Entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper( OrderMapper.class );

    Order orderItemsDto(OrderDto orderDto);

    Order map(Long id);
}



