package menu;

import Entidades.CircunferenciaRad;
import servicios.CircunferenciaServ;

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
public class Circunferencia {

 
    public static void main(String[] args) {
        
        CircunferenciaServ circ=new CircunferenciaServ();
        CircunferenciaRad valor= circ.crearCircunferencia();
        System.out.println("area = "+circ.Area(valor));
        System.out.println("perimetro = "+circ.Perimetro(valor));
    }
    
}
