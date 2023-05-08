/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author Ulises
 */
public class BarajaEnt {
    
    private ArrayList<BarajaCartasEnt> listaCartas;

    public BarajaEnt() {
    }

    public BarajaEnt(ArrayList<BarajaCartasEnt> listaCartas) {
        this.listaCartas = listaCartas;
    }

    public ArrayList<BarajaCartasEnt> getListaCartas() {
        return listaCartas;
    }

    public void setListaCartas(ArrayList<BarajaCartasEnt> listaCartas) {
        this.listaCartas = listaCartas;
    }

    @Override
    public String toString() {
        return "BarajaEnt{" + "listaCartas=" + listaCartas + '}';
    }
    
    
}
