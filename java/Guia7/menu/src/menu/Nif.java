/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menu;

import Entidades.NifEnt;
import servicios.NifServ;

/**
 *
 * @author Ulises
 */
public class Nif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NifServ val=new NifServ();
        NifEnt val1=val.crearNif();
        val.mostrar(val1);
    }
    
}
