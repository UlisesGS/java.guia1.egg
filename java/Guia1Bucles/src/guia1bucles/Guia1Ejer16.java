package guia1bucles;
/*16. Realizar un algoritmo que rellene un vector de tamaño N con 
valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde 
se encuentra el
numero y si se encuentra repetido*/

import java.util.Scanner;
import java.util.Random;

public class Guia1Ejer16 {

    public static void main(String[] args) {
        int tamaño, n, c=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el tamaño de su vector: ");
        tamaño=leer.nextInt();
        int [] vector = new int[tamaño];
        
        for (int i=0; i< vector.length; i++){
            vector[i]=new Random().nextInt(10);
        }
        
        System.out.println("Ingrese el numero a buscar: ");
        n=leer.nextInt();
        
        for (int i=0; i < vector.length; i++){
            if(vector[i] == n){
                System.out.println("Su numero se encuentra en la posicion: "+i);
                c = c + 1;
            }
        }
        if(c > 1){
                System.out.println("El numero se repite en mas de una ocacion");
            }
    }
    
}
