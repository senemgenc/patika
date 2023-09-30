package com.springboot.PatikaSpringBoot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter@Entity
@Table(name ="Customer")
public class Customer {
    @Id
    @GeneratedValue
    public Long Id;

    @Column(name="name")
    public String name;

    @Column(name="surName")
    public String surName;

    @Column(name="identityNo")
    public String identityNo;

    @Column(name="password")
    public String password;

    @Column(name="email")
    public String email;

    @Column(name="phoneNumber")
    public String phoneNumber;

}
