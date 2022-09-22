package guia1bucles;

import java.util.Scanner;

/*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/

public class Guia1Extra1 {

    public static void main(String[] args) {
        
        int minutos;
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese sus total de minutos:");
        minutos=leer.nextInt();
        
        int horas=minutos/60;
        int dias=horas/24;
        
        if(horas<24){
            System.out.println("Son " + horas + " horas y " + minutos%60+ " minutos");
        }else {
            System.out.println("Son "+dias+" dias y "+horas%24+" horas y "+minutos%60+" minutos");
        }
        
    }
    
}
