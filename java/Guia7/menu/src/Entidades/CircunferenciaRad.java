package Entidades;

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

public class CircunferenciaRad {
    
    private double radio;

    public CircunferenciaRad() {
    }

    public CircunferenciaRad(double radio) {
        this.radio = radio;
    }
    
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "CircunferenciaRad{" + "radio=" + radio + '}';
    }
    
    
    
}
