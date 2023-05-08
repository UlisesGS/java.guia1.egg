/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menu;

import Entidades.CancionEnt;
import servicios.CancionServ;



/**
 *
 * @author Ulises
 */
public class Cancion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CancionServ valor1=new CancionServ();
        CancionEnt valor2 = valor1.pedirCancion();
        System.out.println(valor2.toString());
        
        
    }
    
}
