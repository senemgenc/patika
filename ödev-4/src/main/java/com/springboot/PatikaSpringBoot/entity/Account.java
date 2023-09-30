package com.springboot.PatikaSpringBoot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name ="Account")
public class Account {
    @Id
    @GeneratedValue
    public int Id;

    @Column(name="customerId")
    public Long customerId;

    @Column(name="ibanNo")
    public String ibanNo;

    @Column(name="currentBalance")
    public double currentBalance;

    @Column(name="currenType")
    public CurrenType currenType ;

    @Column(name="accountType")
    public AccountType accountType;

}
