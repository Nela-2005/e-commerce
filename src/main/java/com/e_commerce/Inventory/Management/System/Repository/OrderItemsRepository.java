package com.e_commerce.Inventory.Management.System.Repository;

import com.e_commerce.Inventory.Management.System.Entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemsRepository extends JpaRepository<OrderItem, Long> {
}
