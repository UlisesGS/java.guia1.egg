/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecciones;

import servicios.PeliculasServ;

/**
 *
 * @author Ulises
 */
public class Peliculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PeliculasServ n1=new PeliculasServ();
       n1.crearPelicula();
       n1.mostrarDatos();
    }
    
}
