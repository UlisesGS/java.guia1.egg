
package com.mycompany.herencia_2.entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomestico{
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(int carga, double precio, String color, String consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return super.toString(); 
    }

    @Override
    protected void precioFinal() {
        super.precioFinal();
        //double precio=super.getPrecio();
        if(this.carga>30){
            this.precio+=500;
        }
    }
    

public void crearLavadora(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la carga de la lavadora");
        this.carga=leer.nextInt();
        super.crearElectrodomestico();
        precioFinal();
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
       
    }

}
