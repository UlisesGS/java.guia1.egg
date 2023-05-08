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
public class RuletaJuegoEnt {
    
    private RuletaRevolverEnt revolver;
    private ArrayList<RuletaJugadorEnt> jugador;

    public RuletaJuegoEnt() {
    }

    public RuletaJuegoEnt(RuletaRevolverEnt revolver, ArrayList<RuletaJugadorEnt> jugador) {
        this.revolver = revolver;
        this.jugador = jugador;
    }

    public RuletaRevolverEnt getRevolver() {
        return revolver;
    }

    public void setRevolver(RuletaRevolverEnt revolver) {
        this.revolver = revolver;
    }

    public ArrayList<RuletaJugadorEnt> getJugador() {
        return jugador;
    }

    public void setJugador(ArrayList<RuletaJugadorEnt> jugador) {
        this.jugador = jugador;
    }

    @Override
    public String toString() {
        return "RuletaJuegoEnt{" + "revolver=" + revolver + ", jugador=" + jugador + '}';
    }

    
    
    
}
