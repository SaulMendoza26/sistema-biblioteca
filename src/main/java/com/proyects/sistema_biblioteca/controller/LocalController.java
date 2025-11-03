package com.proyects.sistema_biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.proyects.sistema_biblioteca.entity.Local;
import com.proyects.sistema_biblioteca.service.LocalService;

@RestController
@RequestMapping("/public")
public class LocalController {
    @Autowired
    private LocalService localService;
   
    @GetMapping("/findAllLocals")
    public List<Local> findAllLocal(){
        return localService.findAllLocals();
    }
    @PostMapping("/saveLocal")
    public Local saveLocal(@RequestBody Local local){
        return localService.saveLocal(local);
    }
    //@PathVariable me permite agregar la ruta del id exacta
    @PutMapping("/updateLocal")
    public Local updateLocal(@PathVariable Long id,@RequestBody Local local){
        return localService.updateLocal(id, local);
    }
}
