/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Ulises
 */
public class obraPerroEnt extends obraAnimalEnt{
    
    
    public obraPerroEnt() {
    }

    public obraPerroEnt(String animal, String alimento, String edad, String raza) {
        super(animal, alimento, edad, raza);
    }

    @Override
    public void alimentar() {
        super.alimentar(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("holaaaaa");
    }

    

    

    
    
    
    

    

    
}
