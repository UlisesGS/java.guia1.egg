package menu;

import Entidades.Persona12Ent;
import servicios.Persona12Serv;

/**

 * @author Ulises
 */
public class Persona12 {

    public static void main(String[] args) {
        Persona12Serv fin = new Persona12Serv();
        Persona12Ent val=fin.crearPersona();
        fin.calcularEdad(val);
        fin.menorQue(val);
        fin.mostrarPersona(val);
    }
    
}
