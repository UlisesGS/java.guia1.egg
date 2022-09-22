package guia1bucles;
/*10. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.*/

import java.util.Scanner;

public class Guia1Ejer10 {
    public static void main(String[] args) {
        int numero;
        int numeros;
        int i=0;
        int j=0;
        
        
        Scanner leer=new Scanner(System.in);
        
        do {
            System.out.println("Ingrese su valor positivo limite: ");
            numero=leer.nextInt();
            
            if(numero < 0){
                System.out.println("ERROR, ingreso un valor negativo");
                System.out.println("---------------------------");
            }
        } while (numero < 0);
        
        do {
            System.out.println("Ingrese su numero a sumar: ");
            numeros=leer.nextInt();
            
            
            if(i < numero){
                i = i + numeros;
            }
        } while (i < numero);
        
        System.out.println("Su numero es "+i);
    }
    
}
