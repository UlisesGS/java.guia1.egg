/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Menu;

import Entidades.obraAnimalEnt;
import Entidades.obraGatoEnt;
import Entidades.obraPerroEnt;
import java.util.ArrayList;

/**
 *
 * @author Ulises
 */
public class obraAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        obraPerroEnt b = new obraPerroEnt("juan", "croquetas", "18", "doberman");
        obraGatoEnt c = new obraGatoEnt("tuvieja", "galletas", "8", "siames");
        ArrayList<obraAnimalEnt> lista=new ArrayList();
        
        lista.add(b);
        lista.add(c);
        
        for (obraAnimalEnt animalEnt : lista) {
            animalEnt.alimentar();
        }

    }
    
}
