package com.proyects.sistema_biblioteca.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class MainController {

    @GetMapping("/home")
    public String GetHome(){
        return "hola";
    }
    
}
