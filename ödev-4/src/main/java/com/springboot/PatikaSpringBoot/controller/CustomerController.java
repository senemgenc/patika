package com.springboot.PatikaSpringBoot.controller;

import com.springboot.PatikaSpringBoot.Repository.CustomerRepository;
import com.springboot.PatikaSpringBoot.entity.Customer;
import com.springboot.PatikaSpringBoot.service.entityservice.CustomerEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.commons.security.AccessTokenContextRelay;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/V1/customers")
public class CustomerController {

    private CustomerEntityService customerEntityService;

    public CustomerController(CustomerEntityService customerEntityService) {
        this.customerEntityService = customerEntityService;
    }

    @PostMapping()
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerEntityService.saveCustomer(customer);
    }

    @DeleteMapping()
    public void deleteCustomer(@RequestBody Customer customer) {
        customerEntityService.deleteCustomer(customer);
    }
    @GetMapping("/findById/{id}")
    public Customer findById(@PathVariable Long id)
    {
        return customerEntityService.findById(id);
    }

    @GetMapping("/findByIdentityNo/{identity}")
    public List<Customer> findByIdentityNo(@PathVariable String identity)
    {
        return customerEntityService.findByIdentityNo(identity);
    }
}
