package guia1bucles;
/*Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.*/

import java.util.Scanner;

public class Guia1Extra5 {

    public static void main(String[] args) {
        
        String socio;
        int valor;
        boolean flag=true;
        
        
        while(flag){
            Scanner leer=new Scanner (System.in);
            System.out.println("--------------------------------");
            System.out.println("Ingrese que tipo de socio es:\n"
                                + "Si desea salir del programa, ingrese salir.");
            socio=leer.nextLine();
            socio=socio.toUpperCase();

            switch(socio){
         case "A":
             System.out.println("Ingrese cuanto vale su tratamiento");
             valor=leer.nextInt();
             System.out.println("Por ser socio tipo "+socio+" su descuento es del 50% y debera pagar "+(valor-(valor*50/100)));
             continue;
         case "B":
             System.out.println("Ingrese cuanto vale su tratamiento");
             valor=leer.nextInt();
             System.out.println("Por ser socio tipo "+socio+" su descuento es del 35% y debera pagar "+(valor-(valor*35/100)));
             continue;
         case "C":
             System.out.println("Ingrese cuanto vale su tratamiento");
             valor=leer.nextInt();
             System.out.println("Por ser socio tipo "+socio+" no tiene descuento y su monto se mantiene en "+valor);
             continue;
         case "SALIR":
             System.out.println("Gracias por haber usado el programa.");
             flag=false;
             break;
         default:
                 System.out.println("ERROR, ingreso un valor incorrecto");
            }
        }
    }
    
}
