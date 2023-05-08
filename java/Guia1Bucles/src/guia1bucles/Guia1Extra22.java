package guia1bucles;

import java.util.Random;
import java.util.Scanner;

/*Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.*/


public class Guia1Extra22 {

    public static void main(String[] args) {
       int m, n, suma=0;
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el las filas y columnas de su matriz");
        n=leer.nextInt();
        m=leer.nextInt();
        
         int matriz [][] = new int [n][m];
         
         for (int i=0; i< matriz.length; i++){
            for (int j=0; j<matriz.length; j++){
                matriz[i][j]=new Random().nextInt(1,5);
                suma= suma + matriz[i][j];
            }
         }
         
         for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j < matriz.length; j++) {
                 System.out.print(" ["+matriz[i][j]+"] ");
             }
             System.out.println();
        }
       
         System.out.println("La suma de los valores de la matriz es "+ suma);
    }
    
}
