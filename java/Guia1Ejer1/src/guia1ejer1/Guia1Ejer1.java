package guia1ejer1;
//1. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los 
//dos. El programa deberá después mostrar el resultado de la suma

import java.util.Scanner;

public class Guia1Ejer1 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        String frase= "aabeeesa";
        
        String abu="";
        for (int i = 0; i < frase.length(); i++) {
            switch (frase){
            case "a":
                abu=abu+"@";
                break;
                
            case "b":
                abu=abu+"$";
                break;
                
            case "c":
                abu=abu+"!";
                break;
                
        
        }
            System.out.println(abu);
        }
        
        
    }
    
}
