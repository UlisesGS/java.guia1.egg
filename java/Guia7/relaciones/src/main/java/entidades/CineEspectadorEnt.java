/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Ulises
 */
public class CineEspectadorEnt {
    
    private String nombre;
    private int edad;
    private double plata;

    public CineEspectadorEnt() {
    }

    public CineEspectadorEnt(String nombre, int edad, double plata) {
        this.nombre = nombre;
        this.edad = edad;
        this.plata = plata;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    @Override
    public String toString() {
        return "CineEspectadorEnt{" + "nombre=" + nombre + ", edad=" + edad + ", plata=" + plata + '}';
    }
    
    
    
}
