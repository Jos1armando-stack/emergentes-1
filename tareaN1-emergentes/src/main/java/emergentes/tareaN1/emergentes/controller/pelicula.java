package emergentes.tareaN1.emergentes.controller;

import emergentes.tareaN1.emergentes.model.Pelicula;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class pelicula {

    private List<Pelicula> listaPeliculas = new ArrayList<>();

    public pelicula() {

        listaPeliculas.add(new Pelicula(
                "Inception",
                "Christopher Nolan",
                2010,
                148,
                "Ciencia Ficción",
                "Un ladrón roba secretos a través de sueños."
        ));

        listaPeliculas.add(new Pelicula(
                "Titanic",
                "James Cameron",
                1997,
                195,
                "Romance",
                "Historia de amor en el Titanic."
        ));

        listaPeliculas.add(new Pelicula(
                "Gladiator",
                "Ridley Scott",
                2000,
                155,
                "Acción",
                "Un general busca venganza en Roma."
        ));

        listaPeliculas.add(new Pelicula(
                "Interstellar",
                "Christopher Nolan",
                2014,
                169,
                "Ciencia Ficción",
                "Viaje espacial para salvar la humanidad."
        ));

        listaPeliculas.add(new Pelicula(
                "Joker",
                "Todd Phillips",
                2019,
                122,
                "Drama",
                "Origen del villano Joker."
        ));
    }

    @GetMapping("/peliculas2")
    public List<Pelicula> obtenerPeliculas() {
        return listaPeliculas;
    }
}