package com.example.stocksrin;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello-world")
    public void HelloWorld() throws InterruptedException {
        WebDriverBase base=new WebDriverBase();
        base.init();
        //return "Hello World";
    }
}