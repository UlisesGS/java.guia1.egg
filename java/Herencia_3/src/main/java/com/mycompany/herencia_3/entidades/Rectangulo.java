/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia_3.entidades;

import com.mycompany.herencia_3.interfaz.Interfaz;

/**
 *
 * @author Ulises
 */
public class Rectangulo implements Interfaz{
    private double base;
    private double altura;

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    @Override
    public double calcularArea() {
       return base*altura;
    }

    @Override
    public double calcularPerimetro() {
        return (base+altura)*2;
    }

}
