/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia_3.entidades;

import com.mycompany.herencia_3.interfaz.Interfaz;
import java.util.Scanner;

/**
 *
 * @author Ulises
 */
public class Circulo implements Interfaz{
    private double radio;
    private double diametro;

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    
    
    
    @Override
    public double calcularArea() {
       return PI*Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
       return PI*diametro;
    }
}
