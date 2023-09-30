package com.springboot.PatikaSpringBoot.Repository;

import com.springboot.PatikaSpringBoot.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    @Query("select a from Customer a where a.email=: email")
    List<Customer> findByEmail(String email) ;
    List<Customer> findByIdentityNo(String identityNo) ;
}
