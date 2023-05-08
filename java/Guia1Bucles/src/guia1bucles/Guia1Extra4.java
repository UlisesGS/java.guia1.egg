package guia1bucles;
/*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.*/

import java.util.Scanner;


public class Guia1Extra4 {


    public static void main(String[] args) {
        
        int numeros;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero el 1 al 10 para ver su equivalente a romano.");
        numeros=leer.nextInt();
        String romanos = String.valueOf(numeros);
        switch(romanos){
         case "1":
             System.out.println("Su numero "+numeros+" en romano es l");
             break;
         case "2":
             System.out.println("Su numero "+numeros+" en romano es ll");
             break;
         case "3":
             System.out.println("Su numero "+numeros+" en romano es lll");
             break;
         case "4":
             System.out.println("Su numero "+numeros+" en romano es lV");
             break;
         case "5":
             System.out.println("Su numero "+numeros+" en romano es V");
             break;
         case "6":
             System.out.println("Su numero "+numeros+" en romano es Vl");
             break;
         case "7":
             System.out.println("Su numero "+numeros+" en romano es Vll");
             break;
         case "8":
             System.out.println("Su numero "+numeros+" en romano es Vlll");
             break;
         case "9":
             System.out.println("Su numero "+numeros+" en romano es lX");
             break;
         case "10":
             System.out.println("Su numero "+numeros+" en romano es X");
             break;
         default:
             System.out.println("Su letra no es una vocal"
                     + "Vuelva a ingresar su opcion");
    }
        
    }
    
}
