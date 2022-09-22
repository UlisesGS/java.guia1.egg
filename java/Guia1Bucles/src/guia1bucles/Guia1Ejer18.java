package guia1bucles;
/*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).*/
import java.util.Random;

public class Guia1Ejer18 {

    public static void main(String[] args) {
        int matriz [][] = new int [3][3];
        
        for (int i=0; i< matriz.length; i++){
            for (int j=0; j<matriz.length; j++){
            matriz[i][j]=new Random().nextInt(3);
            }
        }
        
        System.out.println("Su matriz es:");
        
        for (int i=0; i< matriz.length; i++){
            for (int j=0; j<matriz.length; j++){
                System.out.print("["+matriz[i][j]+"] ");
            }
            System.out.println("");
        }
        
        System.out.println("Traspuesta:");
        
        for (int i=0; i< matriz.length; i++){
            for (int j=0; j<matriz.length; j++){
                System.out.print("["+matriz[j][i]+"] ");
            }
            System.out.println("");
        }
    }
    
}
