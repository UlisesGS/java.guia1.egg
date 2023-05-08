package menu;

import Entidades.PuntosEnt;
import servicios.PuntosServ;


public class Puntos {


    public static void main(String[] args) {
        PuntosServ valor1=new PuntosServ();
        PuntosEnt fin = valor1.crearPuntos();
        valor1.devolverDistancia(fin);
    }
    
}
