package guia1bucles;
/*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.*/

import java.util.Random;

public class Guia4Ejer15 {

    public static void main(String[] args) {
        int[]vector;
        //int aux=0;
        vector=new int[100];
        for (int i=0; i<vector.length; i++){
            vector[i]=new Random().nextInt(100);
        }
        for (int i=0;i<vector.length;i++){
            System.out.print(vector[i]+" ");
        }
        System.out.println("");
        System.out.println("Vector inverso");
        for (int i=vector.length-1;i>=0;i--){
            System.out.print(vector[i]+" ");
        }
        System.out.println("");

    }
    
}

