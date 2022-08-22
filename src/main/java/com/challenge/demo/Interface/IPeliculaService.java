package com.challenge.demo.Interface;

import com.challenge.demo.entity.Pelicula;
import java.util.List;

public interface IPeliculaService {
    
    public List<Pelicula> obtenerPelicula();
    public Pelicula crearPelicula (Pelicula pelicula);
    public void borrarPelicula (Integer id);
    public Pelicula obtenerPelicula (Integer id);
    public void modificarPelicula (Pelicula pelicula);
    //public Pelicula obtenerPeliculaPorNombre (String titulo);
}
