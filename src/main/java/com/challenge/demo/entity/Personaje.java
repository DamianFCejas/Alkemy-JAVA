package com.challenge.demo.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter @Setter
public class Personaje {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idpersonaje;
    
    @Basic
    private String imagen;
    private String nombre;
    private String edad;
    private Integer peso;
    private String historia;
    @ManyToOne
    private Pelicula pelicula;

    public Personaje() {
    }

    public Personaje(Integer idpersonaje, String imagen, String nombre, String edad, Integer peso, String historia, Pelicula pelicula) {
        this.idpersonaje = idpersonaje;
        this.imagen = imagen;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.historia = historia;
        this.pelicula = pelicula;
    }

    
    
    
    
}
