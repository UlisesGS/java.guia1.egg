/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.herencia_4;

import com.mycompany.herencia_4.entidades.Alquiler;


/**
 *
 * @author Ulises
 */
public class Herencia_4 {

    public static void main(String[] args) {
        Alquiler a = new Alquiler();
        a.cargarCliente();
        System.out.println("---------------------------------------------------------");
        System.out.println(a.getNombreCliente() + " su barco le será alquilado por " + a.diasAlquilado + " días."
                + "\nEl costo del mismo es de $" + a.calcularCosto());
        System.out.println("Barco matrícula " + a.getBarco().getMatricula() + " ubicado en el amarre Nº " + a.getPosAmarre());

    }
}
