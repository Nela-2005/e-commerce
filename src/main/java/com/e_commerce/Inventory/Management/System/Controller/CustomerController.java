package com.e_commerce.Inventory.Management.System.Controller;
import com.e_commerce.Inventory.Management.System.Dto.CustomerDto;
import com.e_commerce.Inventory.Management.System.Entity.Customer;
import com.e_commerce.Inventory.Management.System.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/register")
    public Customer createCustomer (@RequestBody CustomerDto customerDto){
        return customerService.createCustomer(customerDto);
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id){
        return customerService.getCustomerById(id);
    }

    @GetMapping
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @DeleteMapping("/{id}")
    public void deletebyId(@PathVariable Long id){
        customerService.delete(id);
    }
}