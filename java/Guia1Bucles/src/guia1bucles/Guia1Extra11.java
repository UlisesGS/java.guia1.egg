package guia1bucles;

import java.util.Scanner;
/*Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.*/

public class Guia1Extra11 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, cifras;

        System.out.print("Introduce un número entero: ");
        n = sc.nextInt();
        if(n==0) n++;{
        
        }
        cifras= 0;    //esta variable es el contador de cifras
        while(n!=0){             //mientras a n le queden cifras
                n = n/10;         //le quitamos el último dígito
               cifras++;          //sumamos 1 al contador de cifras
        }
        System.out.println("El número tiene " + cifras+ " cifras");

        
    }
    
}
