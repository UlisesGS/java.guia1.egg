/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Ulises
 */
public class CinePeliculaEnt {
    
    private String titulo;
    private int duracion;
    private int minEdad;
    private String director;

    public CinePeliculaEnt() {
    }

    public CinePeliculaEnt(String titulo, int duracion, int minEdad, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.minEdad = minEdad;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getMinEdad() {
        return minEdad;
    }

    public void setMinEdad(int minEdad) {
        this.minEdad = minEdad;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula = " + titulo + " / duracion = " + duracion + " / minEdad = " + minEdad + " / director = " + director + "\n";
    }
    
    
    
}
