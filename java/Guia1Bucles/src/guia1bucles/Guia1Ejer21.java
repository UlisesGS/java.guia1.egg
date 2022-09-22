package guia1bucles;
/*Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.*/

import java.util.Scanner;

public class Guia1Ejer21 {
    
    public static void main(String[] args) {
        int[][] matrizM = {
            {1, 26, 36, 47, 5, 6, 72, 81, 95, 10},
            {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
            {56, 78, 87, 90, 9, 90, 17, 12, 87, 67},
            {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
            {32, 76, 79, 1, 36, 5, 67, 96, 12, 11},
            {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
            {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
            {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
            {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
            {21, 68, 78, 98, 90, 67, 12, 41, 65, 12},};
        int[][] matrizP = {
            {96, 12, 11},
            {12, 41, 76},
            {42, 56, 78}};
        buscarSubmatriz(matrizM, matrizP);
        
    }
//
    
//    
    
    public static void buscarSubmatriz(int[][] m, int[][] p) {
        boolean encontrado = false;
        int fila = -1, columna = -1;
        for (int i = 0; i < m.length - 2; i++) {
            for (int j = 0; j < m[0].length - 2; j++) {
                if (!encontrado) {
                    if (m[i][j] == p[0][0]) {
                        int ip, jp;
                        ip = 0;
                        //encontre
                        encontrado = true;
                        fila = i;
                        columna = j;
                        for (int f = i; f < i + p.length; f++) {
                            jp = 0;
                            for (int c = j; c < j + p.length; c++) {
                                //comparo con cada elemento de p, si alguno es distinto, no encontro la subm
                                if (m[f][c] != p[ip][jp]) {
                                    encontrado = false;
                                    fila = -1;
                                    columna = -1;
                                }
                                jp++;
                            }
                            ip++;
                        }
                    }
                }
            }
        }
        if (encontrado) {
            System.out.println("La matriz fue encontrada en la posicion: [" + fila + "," + columna + "]");
        } else {
            System.out.println("La matriz no fue encontrada.");
        }
    }
    
}
