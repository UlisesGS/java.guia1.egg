package guia1ejer2;
//2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por 
//pantalla

import java.util.Scanner;

public class Guia1Ejer2 {
    public static void main(String[] args) {
        
        //definimos variable de tipo str
        String nombre;
        
        Scanner leer=new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        
        //pedimos el nombre o letra con nextLine
        nombre=leer.nextLine();
        
        System.out.println(nombre);
        
    }
    
}
