package com.example.interceptor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @GetMapping(path = "/order/getOrder")
    String getOrder(){
        return "Here is the get getOrder";
    }
    @GetMapping(path = "/order/getOrderById/{id}")
    String getOrderById(@PathVariable int id){
        return "Here is the get order by getOrderById "+id;
    }

    @GetMapping(path = "/order/getException")
    String getException(){
        try {
            int x = 100/0;
        }catch (Exception e){
           throw new RuntimeException("Runtime exception happened in order controller "+e.getMessage());
        }
        return "Here is the get order by getException";
    }

    @GetMapping(path = "/order/excludeFromInterceptor")
    String excludeFromInterceptor(){
        return "return excludeFromInterceptor";
    }


}
