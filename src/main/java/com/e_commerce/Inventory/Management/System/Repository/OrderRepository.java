package com.e_commerce.Inventory.Management.System.Repository;

import com.e_commerce.Inventory.Management.System.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

    List<Order> findByIdIn(List<Long> idList);
}