package com.example.PracticaN3.Services;

import com.example.PracticaN3.Metodo.ConstructorPelicula;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PeliculaService {
    List<ConstructorPelicula> peliculas = new ArrayList<>();
    public PeliculaService () {
    }
    public List<ConstructorPelicula> obtenerPeliculas () {
        return peliculas;
    }
    public ConstructorPelicula obtenerPelicula (String nombre){
        return peliculas.stream()
                .filter(Cons -> Cons.getNombre().equals(nombre))
                .findFirst()
                .orElse(null);
    }
    public ConstructorPelicula insertarPelicula (ConstructorPelicula peliculaNuevo) {
        peliculas.add(peliculaNuevo);
        return peliculaNuevo;
    }
    public ConstructorPelicula editarPelicula (String nombre, ConstructorPelicula peliculaEditada){
        ConstructorPelicula temporal = obtenerPelicula(nombre);

        if (temporal == null) {
            throw new RuntimeException("Pelicula no encontrada.");
        }

        if (peliculaEditada.getNombre() != null) {temporal.setNombre(peliculaEditada.getNombre());}
        if (peliculaEditada.getGenero() != null) {temporal.setGenero(peliculaEditada.getGenero());}
        if (peliculaEditada.getAnio() != 0) {temporal.setAnio(peliculaEditada.getAnio());}
        if (peliculaEditada.getAutor() != null) {temporal.setAutor(peliculaEditada.getAutor());}
        return temporal;
    }
    public ConstructorPelicula eliminarPelicula (String nombre) {
        ConstructorPelicula temporal = obtenerPelicula(nombre);
        if (temporal == null){
            throw new RuntimeException("Pelicula no encontrada");
        }
        peliculas.remove(temporal);
        return temporal;
    }
}