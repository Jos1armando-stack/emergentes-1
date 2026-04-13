package com.example.PracticaN3.Controller;


import com.example.PracticaN3.Metodo.ConstructorPelicula;
import com.example.PracticaN3.Services.PeliculaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping ("/api")
@Tag(
        name = "PELICULAAAA--APIIII",
        description = "Se Buscan, Agregan, Editan y Eliminan las peliculas"
)
public class Peliculacontroller {
    private final PeliculaService peliculaService;

    public Peliculacontroller(PeliculaService peliculaService) {
        this.peliculaService = peliculaService;
    }
    @Operation(summary = "Ver todas las películas")
    @GetMapping("/peliculas")
    public List<ConstructorPelicula> getPeliculas() {
        return peliculaService.obtenerPeliculas();
    }
    @Operation(summary = "Buscar película por el nombre")
    @GetMapping ("/pelicula/{nombre}")
    public ConstructorPelicula getPeliculaPorNombre (@PathVariable String nombre){
        return peliculaService.obtenerPelicula(nombre);
    }
    @Operation(summary = "Agregar película...")
    @PostMapping("/pelicula")
    public ConstructorPelicula postPelicula(@RequestBody ConstructorPelicula nuevaPelicula) {
        return peliculaService.insertarPelicula(nuevaPelicula);
    }
    @Operation(summary = "Actualizar película...")
    @PutMapping("/pelicula/{nombre}")
    public ConstructorPelicula putPelicula (@PathVariable String nombre, @RequestBody ConstructorPelicula editado){
        return peliculaService.editarPelicula(nombre, editado);
    }
    @Operation(summary = "Eliminar película...")
    @DeleteMapping ("/pelicula/{nombre}")
    public ConstructorPelicula deletePelicula(@PathVariable String nombre){
        return peliculaService.eliminarPelicula(nombre);
    }
}

