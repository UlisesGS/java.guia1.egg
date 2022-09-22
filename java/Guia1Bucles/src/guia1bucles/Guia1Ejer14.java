package guia1bucles;
/*14. Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €*/
import java.util.Scanner;

public class Guia1Ejer14 {
    
    public static void main(String[] args) {
        double dinero=0;
        String opcion;
        boolean bandera = true;
        
        while(bandera == true){
            
            System.out.println("- - - - - - - - - - - -");
            System.out.println("ingrese alguna de las siguientes opciones?\n" + 
                               "#Libras\n" +
                               "#Dolares\n" +
                               "#Yenes\n" +
                               "#SALIR");
            Scanner leer=new Scanner(System.in);
            opcion=leer.nextLine();
            opcion.toLowerCase();
            
            System.out.println("- - - - - - - - - - - -");
            
            if (opcion.equals("salir")){
                System.out.println("Gracias por usar el programa, vuelva pronto...");
                bandera = false;
                break;
            }
            
            while(dinero<1 && bandera == true){
                System.out.println("Ingrese el monto a cambiar");
                dinero=leer.nextDouble();
                
                if (dinero < 0){
                    System.out.println("Ingreso una cantidad no permitida");
                }
            }
            
            System.out.println("- - - - - - - - - - - -");
            
            if (opcion.equals("libras")){
                System.out.println("usted recibira " +dinero*0.86+ " Libras");
                
            } else if (opcion.equals("dolares")){
                System.out.println("Usted recibira " +dinero*1.28611+ " Dolares");
                
            } else if (opcion.equals("yenes")){
                System.out.println("Usted recibira " +dinero*129.852+ " Yenes");
                
            }else {
                System.out.println("Ingreso una opcion incorrecta");
            }
        }
    }
}
