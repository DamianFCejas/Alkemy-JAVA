package com.challenge.demo.repository;

import com.challenge.demo.entity.Pelicula;
//import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, Integer>{
    //List<Pelicula> findByTitulo(String titulo);
    
}
