package com.example.interceptor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
        @GetMapping(path = "/product/getProduct")
    String getProduct(){
        return "Here is the get product";
    }

    @GetMapping(path = "/product/getProductById/{id}")
    String getProductById(@PathVariable int id){
        return "Here is the get product by getProductById "+id;
    }

        @GetMapping(path = "/product/getException")
    String getException(){
            try {
                int x = 100/0;
            }catch (Exception e){
               throw new RuntimeException("Runtime exception happened in product controllers "+e.getMessage());
            }
        return "Here is the get product by getException";
    }

    @GetMapping(path = "/product/excludeFromInterceptor")
    String excludeFromInterceptor(){
        return "return excludeFromInterceptor";
    }

}
