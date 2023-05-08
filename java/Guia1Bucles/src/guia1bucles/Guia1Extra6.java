package guia1bucles;
/*Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.*/

import java.util.Scanner;

public class Guia1Extra6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        double num=1.60;
        double persona, suma=0;
        int personas, mayores=0, menores=0;
        
        
            System.out.println("cuantas personas son en total?");
            personas = leer.nextInt();
            
            System.out.println("ingrese las alturas:");
            
            for (int i = 0; i < personas; i++) {
                
                persona =leer.nextDouble();
                suma = suma + persona;
                if(persona> num){
                    
                    mayores++;
                    
                } else if(persona<num){
                    
                    menores++;
                    
                }
                
            }
            
            
            System.out.println(menores +" de cada " + personas +" esta por debajo de 1,60");
            System.out.println("");
             System.out.println("El promedio en general es "+ suma/personas);
        
        
    }
    
}
