package com.springboot.PatikaSpringBoot.service.entityservice;


import com.springboot.PatikaSpringBoot.Repository.AccountRepository;
import com.springboot.PatikaSpringBoot.entity.Account;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AccountEntityService {
    private AccountRepository accountRepository;

    public AccountEntityService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }
    public void deleteAccount(Account account) {
        accountRepository.delete(account);
    }
    public List<Account> findAllAccountsByAccountId(Long customerId) {
        List<Account> account =accountRepository.findAllByCustomerId(customerId);
        return account;
    }
}
