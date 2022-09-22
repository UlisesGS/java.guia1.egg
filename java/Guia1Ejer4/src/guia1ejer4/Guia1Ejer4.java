package guia1ejer4;
//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados 
//Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5)

import java.util.Scanner;

public class Guia1Ejer4 {
    public static void main(String[] args) {
        
        int F;
        int C;
        
        Scanner leer=new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de grados centigrados a convertir: ");
        C=leer.nextInt();
        
        F = 32 + (9 * C / 5);
        
        System.out.println(F);
        
    }
    
}
