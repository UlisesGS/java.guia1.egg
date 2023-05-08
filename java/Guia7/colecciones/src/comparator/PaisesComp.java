/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comparator;

import entidades.PaisesEnt;
import java.util.Comparator;

/**
 *
 * @author Ulises
 */
public class PaisesComp {
    
    public static Comparator<PaisesEnt> paisesAlfabe = (PaisesEnt o1, PaisesEnt o2) -> o1.getPais().compareTo(o2.getPais());
    
}
