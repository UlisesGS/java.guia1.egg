package servicios;

import Entidades.CircunferenciaRad;
import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *2. Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
 * @author Ulises
 */
public class CircunferenciaServ {
    
    
        public CircunferenciaRad crearCircunferencia(){
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        
         CircunferenciaRad rad=new CircunferenciaRad();
         
            System.out.println("Ingrese el radio");
            rad.setRadio(leer.nextInt());
           
           return rad;
    }
    
      public double Area(CircunferenciaRad rad){
          
          double area;
          
         area=PI*(rad.getRadio()*rad.getRadio());
          
          return area;
      }
      
      public double Perimetro(CircunferenciaRad rad){
          
          double perimetro;
          
          perimetro=2*PI*rad.getRadio();
          
          return perimetro;
      }
}
