package com.proyects.sistema_biblioteca.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyects.sistema_biblioteca.entity.Greeting;

@RestController

public class MainController {
    private static final String template = "hello, %s";
    private final AtomicLong counter = new AtomicLong();
    //Con requestParam sabemos que haremo un queryParameter
    @GetMapping("/greeting")
    public Greeting GetHome(@RequestParam(value="name",defaultValue = "World")String name) {
        
        return new Greeting(counter.incrementAndGet(),String.format(template, name));
    }

}
