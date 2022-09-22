package guia1ejer8;
//8. Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
//usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
//pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
//Nota: investigar la función Lenght() en Java.

import java.util.Scanner;

public class Guia1Ejer8 {
    public static void main(String[] args) {
        String frase="";
        
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese su frase: ");
        frase=leer.nextLine();
        
        if (frase.length()==8){
            System.out.println("CORRECTO, su frase es " + frase);
        }else{
            System.out.println("INCORRECTO, su frase es " + frase);
        }
            
    }
    
}
