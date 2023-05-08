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
public class AdoptarPerrroEnt {
    private String nombrePerros;
    private String razaPerros;
    private Integer edadPerros;
    private String tamañoPerros;

    public AdoptarPerrroEnt() {
    }

    public AdoptarPerrroEnt(String nombrePerros, String razaPerros, Integer edadPerros, String tamañoPerros) {
        this.nombrePerros = nombrePerros;
        this.razaPerros = razaPerros;
        this.edadPerros = edadPerros;
        this.tamañoPerros = tamañoPerros;
    }

    public String getNombrePerros() {
        return nombrePerros;
    }

    public void setNombrePerros(String nombrePerros) {
        this.nombrePerros = nombrePerros;
    }

    public String getRazaPerros() {
        return razaPerros;
    }

    public void setRazaPerros(String razaPerros) {
        this.razaPerros = razaPerros;
    }

    public Integer getEdadPerros() {
        return edadPerros;
    }

    public void setEdadPerros(Integer edadPerros) {
        this.edadPerros = edadPerros;
    }

    public String getTamañoPerros() {
        return tamañoPerros;
    }

    public void setTamañoPerros(String tamañoPerros) {
        this.tamañoPerros = tamañoPerros;
    }
    

    @Override
    public String toString() {
        return "AdoptarPerrroEnt{" + "nombrePerros=" + nombrePerros + ", razaPerros=" + razaPerros + ", edadPerros=" + edadPerros + ", tama\u00f1oPerros=" + tamañoPerros + '}';
    }
    
    
}
