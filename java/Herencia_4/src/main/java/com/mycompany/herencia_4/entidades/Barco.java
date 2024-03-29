/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia_4.entidades;

import java.util.Scanner;

/**
 *
 * @author Ulises
 */
public class Barco {

    protected String matricula;
    protected int eslora, anioFabricacion;
    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Barco(String matricula, int eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public Barco() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    protected void crearBarco() {
        System.out.print("Matricula: ");
        matricula = leer.next();
        System.out.print("Tamaño de eslora en metros: ");
        eslora = leer.nextInt();
        System.out.print("Año de fabricación: ");
        anioFabricacion = leer.nextInt();
    }

    public int modulo() {
        return 10 * eslora;
    }
}
