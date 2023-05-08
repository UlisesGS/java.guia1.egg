package menu;

import Entidades.RaicesEnt;
import servicios.RaicesServ;


public class Raices {

  
    public static void main(String[] args) {
        RaicesServ fin = new RaicesServ();
        RaicesEnt val=fin.ingresarValores();
        
        fin.getDiscriminante(val);
        fin.tieneRaices(val);
        fin.tieneRaiz(val);
        fin.obtenerRaices(val);
        fin.obtenerRaiz(val);
        fin.calcular(val);
        
    }
    
}
