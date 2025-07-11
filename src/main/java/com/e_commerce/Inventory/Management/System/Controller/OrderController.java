package com.e_commerce.Inventory.Management.System.Controller;
import com.e_commerce.Inventory.Management.System.Dto.OrderDto;
import com.e_commerce.Inventory.Management.System.Entity.Order;
import com.e_commerce.Inventory.Management.System.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")

public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping
    public ResponseEntity<Order> create(@RequestBody OrderDto orderDto) {
        Order createdOrder = orderService.create(orderDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdOrder);
    }

}