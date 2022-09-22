package guia1bucles;

import java.util.Scanner;


public class Guia1Ejer12 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int cont=0, cont1=0;
        String cadena;
        do{
            System.out.println("Ingrese datos a enviar");
            cadena=leer.nextLine();
            int lon=cadena.length();
            if ((cadena.length()<=5)&&(cadena.substring(0,1).equals("X"))&&(cadena.substring(lon-1).equals("O"))){
                cont++;
            }else if (!"&&&&&".equals(cadena)){
                cont1++;
            }
                
        }while (!"&&&&&".equals(cadena));
        System.out.println("La cantidad de ingresos correctos es de "+cont);
        System.out.println("La cantidad de ingresos incorrectos es de "+cont1);

    }
    
}
