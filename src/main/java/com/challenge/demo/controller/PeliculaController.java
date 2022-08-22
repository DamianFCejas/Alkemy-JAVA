package com.challenge.demo.controller;

import com.challenge.demo.entity.Pelicula;
import com.challenge.demo.service.PeliculaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeliculaController {
    
    @Autowired
    public PeliculaService service;
    
    
    @GetMapping("/movies")
    @ResponseBody
    public List<Pelicula> obtenerPelicula() {
        return service.obtenerPelicula();
    }


    
    @PostMapping("/movies/create")
    @ResponseBody
    public Pelicula crearPelicula (@RequestBody Pelicula pelicula) {
        return service.crearPelicula(pelicula);
    }
    
    @DeleteMapping("/movies/{id}")
    public void borrarPelicula(@PathVariable Integer id) {
        service.borrarPelicula(id);
    }
    
    @PutMapping("/movies/update")
    public void modificarPelicula(@RequestBody Pelicula pelicula) {
        service.modificarPelicula(pelicula);
    }
    
    /*
    @GetMapping("/movies")
    @ResponseBody
    public Pelicula obtenerPeliculaPorNombre (@RequestParam String name){
        return (Pelicula) service.repository.findByTitulo(name);
    
    }
*/
        
    
    
    
}
