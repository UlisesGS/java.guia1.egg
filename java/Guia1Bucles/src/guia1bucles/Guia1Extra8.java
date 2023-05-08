package guia1bucles;
/*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.*/

import java.util.Scanner;

public class Guia1Extra8 {

    public static void main(String[] args) {
        
        Scanner leer=new Scanner (System.in);
        int num=1, cant=0, pares=0, impares=0;
        boolean flag=true;
        
        System.out.println("ingrese numeros");
        
        do{
            
            num=leer.nextInt();
            if(num % 5 != 0 && num > 0){
                cant++;
                
                if(num%2==0){
                    pares++;
                    //flag=false;
                }else if(num%2!=0){
                    impares++;
                   // flag=false;
                }
                
            }else {
                System.out.println("Su numero es multipl0o de 5 o/y negativo");
                break;
            }    
            
        }while(flag=true);
        
        System.out.println("La cantidad de numeros ingresados son: "+cant+"\n"
                    + "Cantidad de pares: "+pares+"\n"
                    + "Cantidad de impares: "+impares);
        
    }
}

