
package com.mycompany.herencia_2.entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico {
    private  int pulgadas;
    private boolean tDt;

    public Televisor() {
    }

    public Televisor(int pulgadas, boolean tDt, double precio, String color, String consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.tDt = tDt;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean istDt() {
        return tDt;
    }

    public void settDt(boolean tDt) {
        this.tDt = tDt;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected void precioFinal() {
        super.precioFinal(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        double precio=super.getPrecio();
        
        if (this.pulgadas>40) {
            precio+=(precio*30)/100;
            this.precio=precio;
        }
        
        if (tDt) {
            precio+=500;
            this.precio=precio;
        }
        
        
    }
    
    
    
    public void crearTelevisor(){
        Scanner leer= new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de pulgadas");
        this.pulgadas=leer.nextInt();
        System.out.println("Tiene TDT integrado? S/N");
        String TDT =leer.next();
        if (TDT.equalsIgnoreCase("s")) {
            this.tDt=true;
        }else if(TDT.equalsIgnoreCase("n")){
            this.tDt=false;
        }else{
            this.tDt=false;
        }
        super.crearElectrodomestico();
        precioFinal();
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
    }
    

    
}
