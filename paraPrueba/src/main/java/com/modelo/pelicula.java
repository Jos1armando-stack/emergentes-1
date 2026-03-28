package com.modelo;

public class pelicula {
    private String titulo;
    private int duracion;
    private String sinopsis;
    private String genero;
    private int anio;

    public pelicula(String titulo, int duracion, String sinopsis, String genero, int anio) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.sinopsis = sinopsis;
        this.genero = genero;
        this.anio = anio;
    }

    public String getTitulo() { return titulo; }
    public String getSinopsis() { return sinopsis; }
    public int getDuracion() { return duracion; }
    public String getGenero() { return genero; }
    public int getAnio() { return anio; }
}
