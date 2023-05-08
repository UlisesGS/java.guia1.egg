/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comparator;

import entidades.PeliculasEnt;
import java.util.Comparator;

/**
 *
 * @author Ulises
 */
public class PeliculasComp {

    public static Comparator<PeliculasEnt> peliculasMayor = new Comparator<PeliculasEnt>() {
        @Override
        public int compare(PeliculasEnt o1, PeliculasEnt o2) {
            return o2.getHora().compareTo(o1.getHora());
        }
    };
    
    public static Comparator<PeliculasEnt> peliculasMenor = new Comparator<PeliculasEnt>() {
        @Override
        public int compare(PeliculasEnt o1, PeliculasEnt o2) {
            return o1.getHora().compareTo(o2.getHora());
        }
    };
    
    public static Comparator<PeliculasEnt> tituloAlfabe = new Comparator<PeliculasEnt>() {
        @Override
        public int compare(PeliculasEnt o1, PeliculasEnt o2) {
            return o1.getTitulo().compareTo(o2.getTitulo());
        }
    };
    
    public static Comparator<PeliculasEnt> directorAlfabe = new Comparator<PeliculasEnt>() {
        @Override
        public int compare(PeliculasEnt o1, PeliculasEnt o2) {
            return o1.getDirector().compareTo(o2.getDirector());
        }
    };
}
