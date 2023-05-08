package servicios;

import Entidades.OperacionNum;
import java.util.Scanner;

/**
 *Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 * @author Ulises
 */
public class OperacionServ {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    
    public OperacionNum Cargar(){
        
        OperacionNum num=new OperacionNum();
        System.out.println("Ingrese sus dos numeros");
        
        num.setNum1(leer.nextInt());
        num.setNum2(leer.nextInt());
        
        return num;
        
    }
    
    public int Sumar(OperacionNum num){
        
        int sumar=num.getNum1()+num.getNum2();
        
        return sumar;
    }
    
     public int Restar(OperacionNum num){
        
        int restar=num.getNum1()-num.getNum2();
        
        return restar;
    }
     
     public int Multiplicacion(OperacionNum num){
        int multiplicacion;
         if (num.getNum1()>0 && num.getNum2()>0){
            multiplicacion=num.getNum1()*num.getNum2();
            return multiplicacion;
         }else
             return 0;
    }
     
     public double Dividir(OperacionNum num){
        double dividir;
       if (num.getNum1()>0 && num.getNum2()>0){
            dividir=num.getNum1()/num.getNum2();
            return dividir;
         }else
             return 0;
     }
}
