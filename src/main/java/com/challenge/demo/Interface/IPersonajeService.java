package com.challenge.demo.Interface;

import com.challenge.demo.entity.Personaje;
import java.util.List;

public interface IPersonajeService {
    
    public List<Personaje> obtenerPersonaje();
    public Personaje crearPersonaje (Personaje personaje);
    public void borrarPersonaje (Integer id);
    public Personaje obtenerPersonaje (Integer id);
    public void modificarPersonaje (Personaje personaje);
    
    
}
