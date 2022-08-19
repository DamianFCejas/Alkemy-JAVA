package com.challenge.demo.service;

import com.challenge.demo.Interface.IPersonajeService;
import com.challenge.demo.entity.Personaje;
import com.challenge.demo.repository.PersonajeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonajeService implements IPersonajeService{
    
    @Autowired
    public PersonajeRepository repository;

    @Override
    public List<Personaje> obtenerPersonaje() {
        return repository.findAll();
    }

    @Override
    public Personaje crearPersonaje(Personaje personaje) {
        return repository.save(personaje);
    }

    @Override
    public void borrarPersonaje(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Personaje obtenerPersonaje(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void modificarPersonaje(Personaje personaje) {
        repository.save(personaje);
    }
    
}
