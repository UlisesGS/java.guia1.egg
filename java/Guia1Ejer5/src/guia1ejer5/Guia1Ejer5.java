package guia1ejer5;
//5. Escribir un programa que lea un número entero por teclado y muestre por pantalla el 
//doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().

import java.util.Scanner;

public class Guia1Ejer5 {
    public static void main(String[] args) {
        
        int num;
        
        Scanner leer=new Scanner(System.in);
        
        System.out.print("Ingrese su numero: ");
        num=leer.nextInt();
        
        System.out.print("El doble del numero es: ");
        System.out.println(num*2);
        
        System.out.print("El triple del numero es: ");
        System.out.println(num*3);
        
        //Math.sqrt lo que hace esto es buscar la raiz cuadrada
        System.out.print("La raiz cuadrada de su numero es: ");
        System.out.println(Math.sqrt(num));
        
    }
    
}
