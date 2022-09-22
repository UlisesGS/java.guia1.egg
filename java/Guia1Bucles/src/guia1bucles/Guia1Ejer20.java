package guia1bucles;

/*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.*/
import java.util.Scanner;

public class Guia1Ejer20 {
    
    static void imprimirMatriz(int[][] matriz) {
        for (int y = 0; y < matriz.length; y++) {
            for (int x = 0; x < matriz[y].length; x++) {
                System.out.print("["+matriz[x][y]+"] ");
            }
            System.out.println();
        }
    }

    static void sumaFilas(int[][] matriz) {
        for (int y = 0; y < matriz.length; y++) {
            int suma = 0;
            for (int x = 0; x < matriz[y].length; x++) {
                System.out.print("["+matriz[x][y]+"] ");
                suma += matriz[y][x];
            }
            System.out.println("= "+suma);
        }
    }

    static void sumaColumnas(int[][] matriz) {
        // Imprimir la matriz normalmente
        imprimirMatriz(matriz);
        // Debajo de ella imprimir una línea divisora
        for (int x = 0; x < matriz[0].length; x++) {
            System.out.print("____");
        }
        System.out.println();
        // Luego recorrer por columna y sumar
        for (int x = 0; x < matriz[0].length; x++) {
            int suma = 0;
            for (int y = 0; y < matriz.length; y++) {
                suma += matriz[y][x];
            }
            System.out.print(suma+"  ");
        }
        System.out.println();
    }
    
    static void sumaDiagonales(int[][] matriz){
        int suma1=0;
        int suma2=0;
            
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz.length; y++) {
              if (x==y){ 
                suma1 += matriz[x][y];
              }
              if ((x+y) == matriz.length-1){
                 suma2 += matriz[x][y];
              }
            }
        }
        
        for (int y = 0; y < matriz.length; y++) {
            for (int x = 0; x < matriz[y].length; x++) {
                System.out.print("["+matriz[x][y]+"] ");
            }
            System.out.println();
        }
        
        System.out.println("____________");  
        System.out.print(suma1+"       "+suma2);
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[][] matriz = {
                {2, 7, 6},
                {9, 5, 1},
                {4, 3, 8},
        };
        System.out.println("La matriz es: ");
        imprimirMatriz(matriz);
        System.out.println("Suma de filas:");
        sumaFilas(matriz);
        System.out.println("Suma de columnas:");
        sumaColumnas(matriz);
        System.out.println("Suma de diagonales:");
        sumaDiagonales(matriz);
    }
    
}
