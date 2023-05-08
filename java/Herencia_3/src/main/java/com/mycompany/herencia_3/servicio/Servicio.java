/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia_3.servicio;

import com.mycompany.herencia_3.entidades.Circulo;
import com.mycompany.herencia_3.entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Ulises
 */
public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Circulo cir = new Circulo();
    Rectangulo rec = new Rectangulo();
    
    public void retornar(){
    
        System.out.println("Ingrese el valor del radio");
        cir.setRadio(leer.nextDouble());
        System.out.println("Ingrese el valor del perimetro");
        cir.setDiametro(leer.nextDouble());
        System.out.println("El area del circulo = "+ cir.calcularArea());
        System.out.println("El perimetro del circulo = "+ cir.calcularPerimetro());
        
        
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        
        
        System.out.println("Ingrese el valor de la base");
        rec.setBase(leer.nextDouble());
        System.out.println("Ingrese el valor de la altura");
        rec.setAltura(leer.nextDouble());
        System.out.println("El area del rectangulo = "+ rec.calcularArea());
        System.out.println("El perimetro del rectangulo = "+ rec.calcularPerimetro());
    }
}
