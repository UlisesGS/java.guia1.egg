/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia_5.entidades;

/**
 *
 * @author Ulises
 */
public class Polideportivo extends Edificios{
    
    public String nombre;
    public boolean techado;

    public Polideportivo() {
    }
    
    public Polideportivo(double ancho, double alto, double largo, String nombre, boolean techado) {
        super(ancho, alto, largo);
        this.nombre=nombre;
        this.techado=techado;
    }
    
    

    @Override
    public void calcularSuperficie() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void calcularVolumen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
