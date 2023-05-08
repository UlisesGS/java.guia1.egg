/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Ulises
 */
public class CineAsientosEnt {
    
    private char letra;
    private int numero;
    private boolean ocupado;

    public CineAsientosEnt() {
    }

    public CineAsientosEnt(char letra, int numero, boolean ocupado) {
        this.letra = letra;
        this.numero = numero;
        this.ocupado = ocupado;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return "| "+letra +" "+ numero + " ocupado=" + ocupado +" |";
    }



   
    
    
}
