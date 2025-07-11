package com.e_commerce.Inventory.Management.System.Repository;

import com.e_commerce.Inventory.Management.System.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
