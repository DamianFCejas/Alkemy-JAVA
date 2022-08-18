package com.challenge.demo.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity (name = "personajes")
@Getter @Setter
@ToString
public class Personaje {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "per_id")
    private Integer idpersonaje;
    
    @Basic
    @Column(name = "per_imagen")
    private String imagen;

    @Column(name = "per_nombre")
    @NotNull(message = "El nombre es obligatorio")
    private String nombre;

    @Column(name = "per_edad")
    @NotNull(message = "La edad es obligatoria")
    private Integer edad;
    
    @Column(name = "per_peso")
    @NotNull(message = "El peso es obligatorio")
    private Integer peso;
    
    @Column(name = "per_historia")
    @NotNull(message = "La historia es obligatoria")
    private String historia;
    
    @ManyToOne
    @JoinColumn(name = "per_pelicula")
    private Pelicula pelicula;

    public Personaje() {
    }

    public Personaje(Integer idpersonaje, String imagen, String nombre, Integer edad, Integer peso, String historia, Pelicula pelicula) {
        this.idpersonaje = idpersonaje;
        this.imagen = imagen;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.historia = historia;
        this.pelicula = pelicula;
    }

    

    
    
    
    
}
