package guia1bucles;

import java.util.Scanner;

/*Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.*/

public class Guia1Extra9 {


    public static void main(String[] args) {
        int dividendo, divisor, cant=0;
        boolean flag=true;
        Scanner leer=new Scanner (System.in);
        
        System.out.println("ingrese el dividendo");
        dividendo=leer.nextInt();
        System.out.println("ingrese el divisor");
        divisor=leer.nextInt();
        
        
        while(flag){
            
            if (dividendo<divisor){
                break;
            }else if(dividendo>divisor){
                dividendo = dividendo - divisor;
                cant++;
            }
        }
        System.out.println("El resultado es "+dividendo+" y la cantidad de restas realizadas fueron "+cant);
    }
    
}
