package com.challenge.demo.controller;

import com.challenge.demo.entity.Genero;
import com.challenge.demo.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneroController {
    
    @Autowired
    public GeneroService service;
    
    @PostMapping("/genero/create")
    @ResponseBody
    public Genero crearGenero(@RequestBody Genero genero) {
        return service.crearGenero(genero);
    }
    
}
