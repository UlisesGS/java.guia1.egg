/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia_4.entidades;

/**
 *
 * @author Ulises
 */
public class BarcoMotor extends Barco {

    protected int potencia;

    public BarcoMotor() {
        crearBarcoMotor();
    }

    public BarcoMotor(String matricula, int eslora, int anioFabricacion, int potencia) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public final void crearBarcoMotor() {
        super.crearBarco();
        System.out.print("Potencia en CV: ");
        potencia = leer.nextInt();
    }

    @Override
    public int modulo() {
        return 10 * eslora + potencia;
    }
}
