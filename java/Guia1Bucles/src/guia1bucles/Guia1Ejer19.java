package guia1bucles;

import java.util.Random;
import java.util.Scanner;
/*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).*/

public class Guia1Ejer19 {

    public static void main(String[] args) {
         int t = 3;
         int c = 9;
         int matriz [][] = new int [t][t];
         int neg_matriz [][] = new int [t][t];
         Scanner leer = new Scanner(System.in);
        
        for (int i=0; i< matriz.length; i++){
            for (int j=0; j<matriz.length; j++){
                matriz[i][j]=leer.nextInt();
            }
        }
        
        //neg_matriz = matriz;
        
        for (int i=0; i< matriz.length; i++){
            for (int j=0; j<matriz.length; j++){
            //matriz[i][j]=new Random().nextInt(3);
               neg_matriz[i][j] = matriz[i][j];
            }
        }
        
        System.out.println("Su matriz es:");
        
        for (int i=0; i< matriz.length; i++){
            for (int j=0; j<matriz.length; j++){
                System.out.print("["+matriz[i][j]+"] ");
            }
            System.out.println("");
        }
        
        System.out.println("Traspuesta y anti simetrica:");
     
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz.length; j++){
                
                if(matriz[i][j]==neg_matriz[i][j]){
                    c--;
                }
   
            }
                
        }
                
      
        for (int i=0; i< neg_matriz.length; i++){
            
            for(int j=0; j<neg_matriz.length; j++){
                
                System.out.print("["+neg_matriz[j][i]+"] ");
            }
          System.out.println("");
        }
     
        if(c==0){
            System.out.println("Felicidades, su matriz es correcta");
        }else{
            System.out.println("Su matriz es incorrecta");
        }
    }
    
}
