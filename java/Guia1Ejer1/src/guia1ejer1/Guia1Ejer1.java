package guia1ejer1;
//1. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los 
//dos. El programa deberá después mostrar el resultado de la suma

import java.util.Scanner;

public class Guia1Ejer1 {
    public static void main(String[] args) {
        
       //definimos las variables como entero con int
       int a;
       int b;
       int c;
       
       //creamos la clase leer para pedir por teclado
       Scanner leer=new Scanner(System.in);
       
       //pedimos los numeros con el nextInt
       System.out.print("Ingrese el primer numero: ");
       a=leer.nextInt();
       
       System.out.print("Ingrese el segundo numero: ");
       b=leer.nextInt();
       
       c = a + b;
       
       System.out.println(c);
    }
    
}
