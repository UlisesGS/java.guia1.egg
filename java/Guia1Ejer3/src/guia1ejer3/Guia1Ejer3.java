package guia1ejer3;
//3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda 
//en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.

import java.util.Scanner;

public class Guia1Ejer3 {
    public static void main(String[] args) {
        
        String nombre;
        
        Scanner leer=new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        nombre=leer.nextLine();
        
        //toLowerCase hace todo minuscular y toUpperCase las hace mayusculas
        System.out.println(nombre.toLowerCase());
        
        System.out.println(nombre.toUpperCase());
        //escribiendo sout y apretando tab te pone
       // System.out.println("");
    }
    
}

