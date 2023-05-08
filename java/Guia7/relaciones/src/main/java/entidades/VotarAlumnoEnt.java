/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Ulises
 */
public class VotarAlumnoEnt {
    
    private String nombre;
    private String apellido;
    private Integer dni;
    private Integer cantidadV;

    public VotarAlumnoEnt(String nombre, String apellido, Integer dni, Integer cantidadV) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cantidadV = cantidadV;
    }

    public VotarAlumnoEnt() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getCantidadV() {
        return cantidadV;
    }

    public void setCantidadV(Integer cantidadV) {
        this.cantidadV = cantidadV;
    }

    

//    @Override
//    public String toString() {
//        return "nombre=" + nombre + "// apellido=" + apellido + "// dni=" + dni + "// cantidadV=" + cantidadV +"\n"+ '}';
//    }

    @Override
    public String toString() {
        return "VotarAlumnoEnt{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", cantidadV=" + cantidadV +"\n"+ '}';
    }

    
    
    
    
}
