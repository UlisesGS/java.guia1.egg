package guia1bucles;
/*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.*/
import java.util.Scanner;

public class EjerExtra3 {

 public static void main(String[] args) {
        
     String vocales;
     boolean flag = false;
     Scanner leer=new Scanner(System.in);
     vocales=leer.nextLine();
     vocales = vocales.toLowerCase();
     switch(vocales){
         case "a":
             System.out.println("Su letra es una vocal");
             break;
         case "e":
             System.out.println("Su letra es una vocal");
             break;
         case "i":
             System.out.println("Su letra es una vocal");
             break;
         case "o":
             System.out.println("Su letra es una vocal");
             break;
         case "u":
             System.out.println("Su letra es una vocal");
             break;
         default:
             System.out.println("Su letra no es una vocal");
    }
 } 
}
