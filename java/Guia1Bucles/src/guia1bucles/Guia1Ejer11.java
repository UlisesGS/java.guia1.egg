package guia1bucles;
/*11. Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.*/

import java.util.Scanner;

public class Guia1Ejer11 {
    public static void main(String[] args) {
    
        //Scanner leer=new Scanner(System.in);
        String opcion;
        int num1;
        int num2;
        int num3;
        
        do {
            System.out.println("---------------------------");
            System.out.println("MENU\n" +
                               "1. Sumar\n" +
                               "2. Restar\n" +
                               "3. Multiplicar\n" +
                               "4. Dividir\n" +
                               "5. Salir\n" +
                               "Elija opcion: ");
            Scanner leer=new Scanner(System.in);
            opcion = leer.nextLine();
            
            System.out.println("---------------------------");
            
            if(opcion.equals("1")){
                System.out.println("Ingrese su primer numero: ");
                num1 = leer.nextInt();
                System.out.println("Ingrese su segundo numero: ");
                num2 = leer.nextInt();
                
                num3 = num1 + num2;
                
                System.out.println("El resultado de la suma es: " + num3);
            }
            
            if(opcion.equals("2")){
                System.out.println("Ingrese su primer numero: ");
                num1 = leer.nextInt();
                System.out.println("Ingrese su segundo numero: ");
                num2 = leer.nextInt();
                
                num3 = num1 - num2;
                
                System.out.println("El resultado de la resta es: " + num3);
            }
            
            if(opcion.equals("3")){
                System.out.println("Ingrese su primer numero: ");
                num1 = leer.nextInt();
                System.out.println("Ingrese su segundo numero: ");
                num2 = leer.nextInt();
                
                num3 = num1 * num2;
                
                System.out.println("El resultado de la multiplicacion es: " + num3);
            }
            
            if(opcion.equals("4")){
                System.out.println("Ingrese su primer numero: ");
                num1 = leer.nextInt();
                System.out.println("Ingrese su segundo numero: ");
                num2 = leer.nextInt();
                
                num3 = num1 / num2;
                
                System.out.println("El resultado de la division es: " + num3);
            }
            
            if(opcion.equals("5")){
                System.out.println("Esta seguro usted que desea salir del programa?"
                        + "#Si"
                        + "#No");
                opcion = leer.nextLine();
                if(opcion.equals("No")){
                    System.out.println("PERFECTO, elija su nueva opcion: ");
                }else{
                    opcion = "S";
                    System.out.println("Nos vemos pronto!!!");
                }
            }
            
        } while (!"S".equals(opcion));
        
    }
}
