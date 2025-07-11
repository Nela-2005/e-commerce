package com.e_commerce.Inventory.Management.System.Services;

import com.e_commerce.Inventory.Management.System.Dto.CustomerDto;
import com.e_commerce.Inventory.Management.System.Entity.Customer;
import com.e_commerce.Inventory.Management.System.Repository.CustomerRepository;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final ModelMapper modelMapper = new ModelMapper();
    @Autowired
    private CustomerRepository customerRepository;
    public Customer createCustomer(CustomerDto customerDto){
        Customer customer= modelMapper.map(customerDto, Customer.class);
        return customerRepository.save(customer);
    }
    public  Customer getCustomerById(Long id){
        return customerRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("Customer not found"));
    }
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    public Customer updateCustomer(CustomerDto customerDto, Long id){
        Customer existing = customerRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("Customer not found!"));
        modelMapper.getConfiguration().setSkipNullEnabled(true);
        modelMapper.map(customerDto,existing);
        return customerRepository.save(existing);
    }

    public void delete(Long id) {
//        return customerRepository.delete(id);
    }

    public CustomerRepository getCustomerRepository() {
        return customerRepository;
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public ModelMapper getModelMapper() {
        return modelMapper;
    }
}
