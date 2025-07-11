package com.e_commerce.Inventory.Management.System.Services;

import com.e_commerce.Inventory.Management.System.Dto.OrderDto;
import com.e_commerce.Inventory.Management.System.Dto.OrderItemDto;
import com.e_commerce.Inventory.Management.System.Entity.Category;
import com.e_commerce.Inventory.Management.System.Entity.Order;
import com.e_commerce.Inventory.Management.System.Entity.OrderItem;
import com.e_commerce.Inventory.Management.System.Entity.Product;
import com.e_commerce.Inventory.Management.System.Enums.OrderStatus;
import com.e_commerce.Inventory.Management.System.Mapper.CategoryMapper;
import com.e_commerce.Inventory.Management.System.Mapper.OrderMapper;
import com.e_commerce.Inventory.Management.System.Repository.OrderItemsRepository;
import com.e_commerce.Inventory.Management.System.Repository.OrderRepository;
import com.e_commerce.Inventory.Management.System.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemsRepository orderItemsRepository;

    @Autowired
    private ProductRepository productRepository;

    public Order create(OrderDto orderDto){
        Order order = OrderMapper.INSTANCE.orderItemsDto(orderDto);
        Order order1 = orderRepository.save(order);
        Double totalAmount = 0.0;
        List<Long> ids = orderDto.getOrderItemDtoList().stream().map(orderItemDto -> orderItemDto.getProductId()).collect(Collectors.toList());
        List<Product> productList = productRepository.findByIdIn(ids);
        Map<Long, Double> mapPrice = new HashMap<>();

        for (Product product : productList){
            mapPrice.put(product.getId(), product.getPrice());
        }

        List <OrderItem> permOrder = new ArrayList<>();
        for (OrderItemDto orderItemDto: orderDto.getOrderItemDtoList()){
            OrderItem orderItem = new OrderItem();
            orderItem.setOrder(order1);
            orderItem.setPrice(mapPrice.get(orderItemDto.getProductId()));
            orderItem.setQuantity(orderItemDto.getQuantity());
            orderItem.setProduct(new Product(orderItemDto.getProductId()));
            orderItem.setSubTotal(orderItem.getPrice() * orderItem.getQuantity());
            permOrder.add(orderItem);
            totalAmount+=orderItem.getSubTotal();

        }
        orderItemsRepository.saveAll(permOrder);

        order1.setOrderDate(LocalDateTime.now());
        order1.setTotalAmount(totalAmount);
        order1.setOrderStatus(OrderStatus.NEW);
        orderRepository.save(order1);
        return order;
    }

    public OrderItemsRepository getOrderItemsRepository() {
        return orderItemsRepository;
    }

    public void setOrderItemsRepository(OrderItemsRepository orderItemsRepository) {
        this.orderItemsRepository = orderItemsRepository;
    }

    public OrderRepository getOrderRepository() {
        return orderRepository;
    }

    public void setOrderRepository(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public ProductRepository getProductRepository() {
        return productRepository;
    }

    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
