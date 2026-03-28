package emergentes.tareaN1.emergentes.model;
public class Pelicula {

    private String titulo;
    private String director;
    private int año;
    private int duracion; // en minutos
    private String genero;
    private String sinopsis;

    public Pelicula(String titulo, String director, int año, int duracion, String genero, String sinopsis) {
        this.titulo = titulo;
        this.director = director;
        this.año = año;
        this.duracion = duracion;
        this.genero = genero;
        this.sinopsis = sinopsis;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public int getAño() {
        return año;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getGenero() {
        return genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }
}