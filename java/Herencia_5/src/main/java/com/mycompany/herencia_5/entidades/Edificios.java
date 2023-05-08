/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia_5.entidades;

/**
 *
 * @author Ulises
 */
public abstract class Edificios {
    
    public double ancho;
    public double alto;
    public double largo;

    public Edificios() {
    }
    
    
    
    public Edificios(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }
    
    
    
    public abstract void calcularSuperficie();
    
    public abstract void calcularVolumen();
    
}
