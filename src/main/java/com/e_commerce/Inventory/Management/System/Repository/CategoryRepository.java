package com.e_commerce.Inventory.Management.System.Repository;

import com.e_commerce.Inventory.Management.System.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
}