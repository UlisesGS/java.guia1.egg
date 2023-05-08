/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona
 * @author Ulises
 */
public class AdoptarPersonaEnt {
    private String nombrePersona;
    private String apellidoPersona;
    private Integer edadPersona;
    private Integer documnetoPersona;
    private AdoptarPerrroEnt mascota;

    public AdoptarPersonaEnt() {
    }

    public AdoptarPersonaEnt(String nombrePersona, String apellidoPersona, Integer edadPersona, Integer documnetoPersona, AdoptarPerrroEnt mascota) {
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.edadPersona = edadPersona;
        this.documnetoPersona = documnetoPersona;
        this.mascota = mascota;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public Integer getEdadPersona() {
        return edadPersona;
    }

    public void setEdadPersona(Integer edadPersona) {
        this.edadPersona = edadPersona;
    }

    public Integer getDocumnetoPersona() {
        return documnetoPersona;
    }

    public void setDocumnetoPersona(Integer documnetoPersona) {
        this.documnetoPersona = documnetoPersona;
    }

    public AdoptarPerrroEnt getMascota() {
        return mascota;
    }

    public void setMascota(AdoptarPerrroEnt mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "AdoptarPersonaEnt{" + "nombrePersona=" + nombrePersona + ", apellidoPersona=" + apellidoPersona + ", edadPersona=" + edadPersona + ", documnetoPersona=" + documnetoPersona + ", mascota=" + mascota + '}';
    }
    
   
    
    
}
