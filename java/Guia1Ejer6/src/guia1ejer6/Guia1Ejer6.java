package guia1ejer6;
//Crear un programa que dado un numero determine si es par o impar.

import java.util.Scanner;

public class Guia1Ejer6 {
    public static void main(String[] args) {
        
        int num;
        
        Scanner leer=new Scanner(System.in);
        
        System.out.print("Ingrese su numero: ");
        num=leer.nextInt();
        
        if (num % 2 == 0){
            System.out.println("El numero ingresado es par");
        }
        else{
            System.out.println("El numero ingresado es impar");
        }
            
    }
    
}
