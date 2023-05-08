package guia1bucles;
/*Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:*/

import java.util.Scanner;

public class Guia1Extra13 {


    public static void main(String[] args) {
       Scanner leer= new Scanner (System.in);
       int lon;
       
       lon=leer.nextInt();
       
       // EN J GUARDAMOS i, PARA MOSTRAR TODOS LOS NUMEROS
        for (int i = 1; i <= lon; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j +" ");
            }
            System.out.println("");
        }
       
    }
    
}
