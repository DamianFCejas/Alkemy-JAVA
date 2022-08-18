package com.challenge.demo.entity;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;


@Getter @Setter
@Entity
public class Pelicula {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idpelicula;
    
    @Basic
    private String imagen;
    private String titulo;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date fechaCreacion;
    //@Min(value = 1,message = "La calificacion debe ser mayor que 1 y menor que 5")
    //@Max(value = 5,message = "La calificacion debe ser mayor que 1 y menor que 5")
    private Integer calificacion;
    
    @OneToMany
    private Personaje personaje;
    
    
}
