package guia1ejer7;
//7. Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
//pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
//la función equals() en Java.

import java.util.Scanner;

public class Guia1Ejer7 {
    public static void main(String[] args) {
       String frase;
       
       Scanner leer=new Scanner(System.in);
       
       System.out.print("Ingrese su FRASE: ");
       frase=leer.nextLine();
       
       //equals su funcion es tirar true o flase dependiendo que queres comparar
       System.out.println("Su frase es: "+frase.equals("eureka"));
    }
    
}
