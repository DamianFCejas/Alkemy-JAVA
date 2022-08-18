package com.challenge.demo.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;


@Getter @Setter
@ToString
@Entity (name = "peliculas")
public class Pelicula {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pel_id")    
    private Integer idpelicula;
    
    @Basic
    @Column(name = "pel_imagen")    
    private String imagen;
    
    @NotNull(message = "El título es obligatorio")
    @Column(name = "pel_titulo")    
    private String titulo;
    
    @NotNull(message = "La fecha de creación es obligatioria")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Column(name = "pel_fechaCreacion")    
    private Date fechaCreacion;
    
    @NotNull(message = "La calificación es obligatoria")
    @Min(value = 1,message = "La calificacion admite valores del 1 al 5")
    @Max(value = 5,message = "La calificacion admite valores del 1 al 5")
    @Column(name = "pel_calificacion")    
    private Integer calificacion;
    
    @OneToMany (mappedBy = "personaje")
    List <Personaje> personajeList;
    
    @ManyToOne
    @JoinColumn (name = "pel_genero")
    private Genero genero;

    public Pelicula() {
    }

    public Pelicula(Integer idpelicula, String imagen, String titulo, Date fechaCreacion, Integer calificacion, List<Personaje> personajeList, Genero genero) {
        this.idpelicula = idpelicula;
        this.imagen = imagen;
        this.titulo = titulo;
        this.fechaCreacion = fechaCreacion;
        this.calificacion = calificacion;
        this.personajeList = personajeList;
        this.genero = genero;
    }
    
    
    
    
}
