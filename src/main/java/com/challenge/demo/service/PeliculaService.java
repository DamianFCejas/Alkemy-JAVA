package com.challenge.demo.service;

import com.challenge.demo.Interface.IPeliculaService;
import com.challenge.demo.entity.Pelicula;
import com.challenge.demo.repository.PeliculaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PeliculaService implements IPeliculaService {
    
    @Autowired
    public PeliculaRepository repository;

    @Override
    public List<Pelicula> obtenerPelicula() {
        return repository.findAll();
    }

    @Override
    public Pelicula crearPelicula(Pelicula pelicula) {
        return repository.save(pelicula);
    }

    @Override
    public void borrarPelicula(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Pelicula obtenerPelicula(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void modificarPelicula(Pelicula pelicula) {
        repository.save(pelicula);
    }
    
    
}
