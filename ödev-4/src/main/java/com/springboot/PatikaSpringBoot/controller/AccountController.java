package com.springboot.PatikaSpringBoot.controller;

import com.springboot.PatikaSpringBoot.entity.Account;
import com.springboot.PatikaSpringBoot.service.entityservice.AccountEntityService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/accounts")
public class AccountController {
    private AccountEntityService accountEntityService;

    public AccountController(AccountEntityService accountEntityService) {
        this.accountEntityService = accountEntityService;
    }

    @PostMapping()
    public Account saveAccount(@RequestBody Account account) {
        return accountEntityService.saveAccount(account);
    }
    @DeleteMapping()
    public void deleteAccount(@RequestBody Account account) {
         accountEntityService.deleteAccount(account);
    }
    @GetMapping("/findAllAccountsByCustomerId/{customerId}")
    public void findAllAccountsByCustomerId(@PathVariable Long customerId) {
        accountEntityService.findAllAccountsByAccountId(customerId);
    }
    public void WithdrawMoney() {

    }
    public void DepositMoney() {

    }
}
