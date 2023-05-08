/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Ulises
 */
public class obraAnimalEnt {
    protected String animal;
    protected String alimento;
    protected String edad;
    protected String raza;

    public obraAnimalEnt() {
    }

    public obraAnimalEnt(String animal, String alimento, String edad, String raza) {
        this.animal = animal;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
    
    
    
    
    
    public void alimentar(){
    
        System.out.println("el animal "+ animal+" se alimenta de "+ alimento);
        
       
    
    }
    
    

    
    
    
}
