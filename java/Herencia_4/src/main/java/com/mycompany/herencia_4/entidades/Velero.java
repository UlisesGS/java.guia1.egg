/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia_4.entidades;

/**
 *
 * @author Ulises
 */
public class Velero extends Barco{
     private int cantMastiles;
    public Velero(){
        crearVelero();
    }
    public Velero(String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
    }

    public int getCantMastiles() {
        return cantMastiles;
    }
    public void setCantMastiles(int cantMastiles) {
        this.cantMastiles = cantMastiles;
    }
    
    public final void crearVelero(){
        super.crearBarco();
        System.out.print("Cantidad de mastiles: ");
        cantMastiles = leer.nextInt();
    }
    
    @Override
    public int modulo(){
        return 10*eslora + cantMastiles;
    }
}