package servicios;

import Entidades.PuntosEnt;
import java.util.Scanner;

/**
 *Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
 * @author Ulises
 */
public class PuntosServ {
    
    Scanner leer=new Scanner (System.in);
    
    public PuntosEnt crearPuntos(){
        
        PuntosEnt valor=new PuntosEnt();
        
        System.out.print("Ingrese el valor del primer punto = ");
        valor.setX1(leer.nextInt());
        valor.setY1(valor.getX1());
        System.out.println("");
        System.out.print("Ingrese el valor del segundo punto = ");
        valor.setX2(leer.nextInt());
        valor.setY2(valor.getX2());
        
        return valor;
    }
    
    public void devolverDistancia(PuntosEnt valor){
        
       int  dist = (valor.getX1()-valor.getX2())^2+(valor.getY1()-valor.getY2())^2;
       
        System.out.println("La distancia de los dos puntos es "+ Math.sqrt(dist));
    }
}
