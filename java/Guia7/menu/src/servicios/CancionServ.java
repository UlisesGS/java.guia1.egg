package servicios;

import Entidades.CancionEnt;
import java.util.Scanner;

/**
 *
 * @author Ulises
 */
public class CancionServ {
    
    Scanner leer = new Scanner (System.in);
    
    public CancionEnt pedirCancion(){
        
        CancionEnt valor=new CancionEnt();
        System.out.print("Ingrese el titulo = ");
        valor.setTitulo(leer.next());
        System.out.println("");
        System.out.print("Ingrese el autor = ");
        valor.setAutor(leer.next());
        
        return valor;
    }
}
