package com.challenge.demo.controller;

import com.challenge.demo.entity.Personaje;
import com.challenge.demo.service.PersonajeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonajeController {
    
    @Autowired
    public PersonajeService service;
    
    @GetMapping("/characters")
    @ResponseBody
    public List<Personaje> obtenerPersonaje() {
        return service.obtenerPersonaje();
    }
    
    @PostMapping("/characters/create")
    @ResponseBody
    public Personaje crearPersonaje (@RequestBody Personaje personaje) {
        return service.crearPersonaje(personaje);
    }
    
    @DeleteMapping("/characters/{id}")
    public void borrarPersonaje(@PathVariable Integer id) {
        service.borrarPersonaje(id);
    }
    
    @PutMapping("/characters/update")
    public void modificarPersonaje(@RequestBody Personaje personaje) {
        service.modificarPersonaje(personaje);
    }
    
}
