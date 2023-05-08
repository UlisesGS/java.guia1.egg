/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia_4.entidades;

/**
 *
 * @author Ulises
 */
public class Yate extends BarcoMotor{
    private int camarotes;

    public Yate(){
        crearYate();
    }
    public Yate(String matricula, int eslora, int anioFabricacion, int potencia, int camarotes) {
        super(matricula, eslora, anioFabricacion, potencia);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }
    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }
    
    public final void crearYate(){
        super.crearBarco();
        System.out.print("Potencia en CV: ");
        potencia = leer.nextInt();
        System.out.print("Cantidad de camarotes: ");
        camarotes = leer.nextInt();
    }
    
    @Override
    public int modulo(){
        return 10*eslora + potencia + camarotes;
    }
}
