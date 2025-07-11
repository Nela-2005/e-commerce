package com.e_commerce.Inventory.Management.System.Repository;
import com.e_commerce.Inventory.Management.System.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findByStockQuantityLessThan(Integer limit);
    List<Product> findByStockQuantityGreaterThan(Integer limit);
    List<Product> findByIdIn(List<Long> ids);
}