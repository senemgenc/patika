package com.springboot.PatikaSpringBoot.service.entityservice;

import com.springboot.PatikaSpringBoot.Repository.CustomerRepository;
import com.springboot.PatikaSpringBoot.entity.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerEntityService {
    private CustomerRepository customerRepository;

    public CustomerEntityService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
    public void deleteCustomer(Customer customer) {
         customerRepository.delete(customer);
    }
    public Customer findById(Long id) {
       Optional<Customer> customer =customerRepository.findById(id);
       return customer.get();
    }
    public List<Customer> findByIdentityNo(String identityNo) {
        List<Customer>  customer =customerRepository.findByIdentityNo(identityNo);
        return customer;
    }

    public List<Customer> findByEmail(String email){
        List<Customer> customer =customerRepository.findByEmail(email);
        return customer;
    }
}
