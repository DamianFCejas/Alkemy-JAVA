package com.challenge.demo.entity;

import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity (name = "generos")
@Getter @Setter
@ToString
public class Genero {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "gen_id")
    private Integer idgenero;
    
    @Basic
    @Column(name = "gen_imagen")
    private String imagen;

    @Column(name = "gen_nombre")
    @NotNull(message = "El nombre es obligatorio")
    private String nombre;
    
    @OneToMany (mappedBy = "genero")
    List <Pelicula> peliculaList;

    public Genero() {
    }

    public Genero(Integer idgenero, String imagen, String nombre, List<Pelicula> peliculaList) {
        this.idgenero = idgenero;
        this.imagen = imagen;
        this.nombre = nombre;
        this.peliculaList = peliculaList;
    }
    
    
    
}
