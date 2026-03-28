package com.controller;
import org.springframework.web.bind.annotation.*;
import com.controller.pelicula_controller;
import com.modelo.pelicula;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/peliculas")
public class pelicula_controller {
        // 🔹 Lista base
    public List<pelicula> obtenerPeliculas() {

        List<pelicula> lista = new ArrayList<>();

        lista.add(new pelicula("Avatar", 162,
                "Un exmarine es enviado a Pandora",
                "Ciencia Ficcion", 2009));

        lista.add(new pelicula("Titanic", 195,
                "Historia de amor en el Titanic",
                "Romance", 1997));

        lista.add(new pelicula("Moana", 107,
                "Una joven navega el oceano",
                "Animacion", 2016));

        lista.add(new pelicula("El Conjuro", 112,
                "Investigadores paranormales ayudan a una familia",
                "Terror", 2013));

        lista.add(new pelicula("2012", 158,
                "Catastrofes destruyen el mundo",
                "Accion", 2009));

        lista.add(new pelicula("Zootopia", 108,
                "Coneja policia resuelve un caso",
                "Animacion", 2016));

        lista.add(new pelicula("Avengers: Endgame", 181,
                "Heroes luchan contra Thanos",
                "Accion", 2019));

        lista.add(new pelicula("Spider-Man: No Way Home", 148,
                "Multiverso y enemigos",
                "Accion", 2021));

        lista.add(new pelicula("Frozen", 102,
                "Hermanas con poderes magicos",
                "Animacion", 2013));

        lista.add(new pelicula("Jurassic Park", 127,
                "Dinosaurios fuera de control",
                "Aventura", 1993));

        return lista;
    }

    // 🔹 1. LISTAR TODAS
    @GetMapping
    public List<pelicula> listar() {
        return obtenerPeliculas();
    }

    // 🔹 2. BUSCAR POR TITULO
    @GetMapping("/titulo/{titulo}")
    public Object buscarPorTitulo(@PathVariable String titulo) {

        for (pelicula p : obtenerPeliculas()) {
            if (p.getTitulo().equalsIgnoreCase(titulo)) {
                return p;
            }
        }
        return "Pelicula no encontrada";
    }

    // 🔹 3. BUSCAR POR DURACION
    @GetMapping("/duracion/{duracion}")
    public Object buscarPorDuracion(@PathVariable int duracion) {

        List<pelicula> resultado = new ArrayList<>();

        for (pelicula p : obtenerPeliculas()) {
            if (p.getDuracion() == duracion) {
                resultado.add(p);
            }
        }

        return resultado.isEmpty() ? "No hay peliculas con esa duracion" : resultado;
    }

    // 🔹 4. BUSCAR POR SINOPSIS
    @GetMapping("/sinopsis/{texto}")
    public Object buscarPorSinopsis(@PathVariable String texto) {

        List<pelicula> resultado = new ArrayList<>();

        for (pelicula p : obtenerPeliculas()) {
            if (p.getSinopsis().toLowerCase().contains(texto.toLowerCase())) {
                resultado.add(p);
            }
        }

        return resultado.isEmpty() ? "No hay coincidencias en la sinopsis" : resultado;
    }

    // 🔹 5. BUSCAR POR GENERO
    @GetMapping("/genero/{genero}")
    public Object buscarPorGenero(@PathVariable String genero) {

        List<pelicula> resultado = new ArrayList<>();

        for (pelicula p : obtenerPeliculas()) {
            if (p.getGenero().equalsIgnoreCase(genero)) {
                resultado.add(p);
            }
        }

        return resultado.isEmpty() ? "No hay peliculas de ese genero" : resultado;
    }

    // 🔹 6. BUSCAR POR AÑO
    @GetMapping("/anio/{anio}")
    public Object buscarPorAnio(@PathVariable int anio) {

        List<pelicula> resultado = new ArrayList<>();

        for (pelicula p : obtenerPeliculas()) {
            if (p.getAnio() == anio) {
                resultado.add(p);
            }
        }

        return resultado.isEmpty() ? "No hay peliculas para ese año" : resultado;
    }
    
}
