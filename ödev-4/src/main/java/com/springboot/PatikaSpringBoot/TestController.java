package com.springboot.PatikaSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("testGet")
    public String test(){
        return "Test Başarılı";
    }
}
