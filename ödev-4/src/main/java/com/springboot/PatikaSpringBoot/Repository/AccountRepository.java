package com.springboot.PatikaSpringBoot.Repository;

import com.springboot.PatikaSpringBoot.entity.Account;
import com.springboot.PatikaSpringBoot.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account,Long> {
    @Query("select a from Account a where a.ibanNo=: ibanNo")
    List<Account> findByIbanNo(String ibanNo) ;
    List<Account> findAllByCustomerId(Long customerId) ;

}
