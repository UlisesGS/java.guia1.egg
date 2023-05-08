/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia_4.entidades;

import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author Ulises
 */
public class Alquiler {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombreCliente;
    private int docCliente, posAmarre;
    public long diasAlquilado;
    private Barco barco;
    private Date fechaAlq, fechaDev;
    //Const
    public Alquiler(String nombreCliente, int docCliente, int posAmarre, Barco barco, Date fechaAlq, Date fechaDev) {
        this.nombreCliente = nombreCliente;
        this.docCliente = docCliente;
        this.posAmarre = posAmarre;
        this.barco = barco;
        this.fechaAlq = fechaAlq;
        this.fechaDev = fechaDev;
    }
    public Alquiler() {
    }
    //G y S
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public int getDocCliente() {
        return docCliente;
    }
    public void setDocCliente(int docCliente) {
        this.docCliente = docCliente;
    }
    public int getPosAmarre() {
        return posAmarre;
    }
    public void setPosAmarre(int posAmarre) {
        this.posAmarre = posAmarre;
    }
    public Barco getBarco() {
        return barco;
    }
    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    public Date getFechaAlq() {
        return fechaAlq;
    }
    public void setFechaAlq(Date fechaAlq) {
        this.fechaAlq = fechaAlq;
    }
    public Date getFechaDev() {
        return fechaDev;
    }
    public void setFechaDev(Date fechaDev) {
        this.fechaDev = fechaDev;
    }
    
    public void cargarCliente(){
        System.out.print("Nombre: ");
        nombreCliente = leer.next();
        System.out.print("Número de documento: ");
        docCliente = leer.nextInt();
        diasAlquilado = calcularDiasAlquilado();        
        System.out.print("Amarre Nº: ");
        posAmarre = leer.nextInt();
        System.out.println("---------------------------------------------------------");
        System.out.println("Catalogo de barcos");
        System.out.println("1: Velero"
                + "\n2: Yate"
                + "\n3: Yate de lujo");
        int opc; System.out.println("Opción: "); opc = leer.nextInt();
        while(opc<1 || opc>3){
            System.out.println("Opción inválida. Reingrese: ");
            opc = leer.nextInt();
        }
        switch(opc){
            case 1: barco = new Velero(); break;
            case 2: barco = new BarcoMotor(); break;
            case 3: barco = new Yate(); break;
        }
    }
    public long calcularDiasAlquilado(){
        long retorno;
        System.out.println("Fecha de alquiler.");
        System.out.print("Año: ");
        int anio = leer.nextInt();
        System.out.print("Mes: ");
        int mes = leer.nextInt();
        System.out.print("Dia: ");
        int dia = leer.nextInt();
        fechaAlq = new Date(anio-1900,mes-1,dia);//Dia alq
        System.out.println("Fecha de devolución.");
        System.out.print("Año: ");
        anio = leer.nextInt();
        System.out.print("Mes: ");
        mes = leer.nextInt();
        System.out.print("Dia: ");
        dia = leer.nextInt();
        fechaDev = new Date(anio-1900,mes-1,dia);//Dia dev
        retorno = fechaDev.getTime()-fechaAlq.getTime();
        retorno = retorno/1000/86400;
        return retorno;
    }
    public int calcularCosto(){
        int costo = (int) diasAlquilado*barco.modulo();
        return costo;
    }
}
