package com.challenge.demo.service;

import com.challenge.demo.Interface.IGeneroService;
import com.challenge.demo.entity.Genero;
import com.challenge.demo.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneroService implements IGeneroService{
    
    @Autowired
    public GeneroRepository repository;

    @Override
    public Genero crearGenero(Genero genero) {
        return repository.save(genero);
    }
    
}
