/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecciones;

import servicios.IteratorServ;

/**
 *
 * @author Ulises
 */
public class Iterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IteratorServ servicios = new IteratorServ();
        servicios.crearAlumno();
       // servicios.mostrarLista();
     
       servicios.buscarAlumno();
    }
    
}
