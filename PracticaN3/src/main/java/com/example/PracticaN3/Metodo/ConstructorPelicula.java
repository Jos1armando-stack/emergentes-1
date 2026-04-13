package com.example.PracticaN3.Metodo;

public class ConstructorPelicula {
    private String nombre;
    private String genero;
    private int anio;
    private String autor;

    //Constructor
    public ConstructorPelicula () {}
    public ConstructorPelicula (String nombre, String genero, int anio, String autor){
        this.nombre = nombre;
        this.genero = genero;
        this.anio = anio;
        this.autor = autor;
    }

    //Encapsulacion//
    //getters
    public String getNombre() {return this.nombre;}
    public String getGenero() {return this.genero;}
    public int getAnio() {return this.anio;}
    public String getAutor() {return this.autor;}
    //setters
    public void setNombre(String nombre) {this.nombre=nombre;}
    public void setGenero(String genero) {this.genero=genero;}
    public void setAnio (int anio) {this.anio=anio;}
    public void setAutor (String autor) {this.autor=autor;}
}
