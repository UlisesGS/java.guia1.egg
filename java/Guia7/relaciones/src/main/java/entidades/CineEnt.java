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
public class CineEnt {
    
    private ArrayList<CinePeliculaEnt> listPeliculas = new ArrayList();
    private CineEspectadorEnt espectador;
    private double precio=1000;
    private CineAsientosEnt butacas[][];

    public CineEnt() {
        this.butacas =new CineAsientosEnt [8][6];
    }

    public CineEnt(CineEspectadorEnt espectador, CineAsientosEnt[][] butacas) {
        this.espectador = espectador;
        this.butacas = butacas;
    }

    public ArrayList<CinePeliculaEnt> getListPeliculas() {
        return listPeliculas;
    }

    public void setListPeliculas(ArrayList<CinePeliculaEnt> listPeliculas) {
        this.listPeliculas = listPeliculas;
    }

    public CineEspectadorEnt getEspectador() {
        return espectador;
    }

    public void setEspectador(CineEspectadorEnt espectador) {
        this.espectador = espectador;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public CineAsientosEnt[][] getButacas() {
        return butacas;
    }

    public void setButacas(CineAsientosEnt[][] butacas) {
        this.butacas = butacas;
    }

   
    
}
