package guia1bucles;
/*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.*/
import java.util.Scanner;

public class Guia1Extra7 {

 public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de numeros que usara");
        int cant = leer.nextInt();
        int numeros, mayor=0, menor=0;
        int numerosA, mayorA=0, menorA=0;
        double promedio=0, promedioA=0;
        boolean flag=true;
        
        System.out.println("Ingrese los valores de sus nuemros:");
        while(flag){
            
            for(int i=0; i<cant; i++){
                numeros=leer.nextInt();
                
                promedio=promedio+numeros;
                
                if(i==0){
                    menor=numeros;
                }
                
                if(numeros>mayor){
                    mayor=numeros;
                }
                if(numeros<menor){
                    menor=numeros;
                }
                
            }
            
            promedio=promedio/cant;
            System.out.println("El numero mayor es: "+mayor);
            System.out.println("El numero menor es: "+menor);
            System.out.println("El promedio de los nuemros es : "+promedio);
            flag=false;
        }
        
        
        System.out.println("---------------------");
        flag=true;
        System.out.println("Ingrese los valores de sus nuemros:");
        
        do{
        
            for(int i=0; i<cant; i++){
                numerosA=leer.nextInt();
                
                if (numerosA>0){
                    promedioA=promedioA+numerosA;
                
                    if(i==0){
                        menorA=numerosA;
                    }
                
                    if(numerosA>mayorA){
                        mayorA=numerosA;
                    }
                    if(numerosA<menorA){
                        menorA=numerosA;
                    }
                }else
                    System.out.println("valor mal ingresado, no sera contado para la operacion");
                    cant=cant-1;
            }
            promedio=promedio/cant;
            System.out.println("El numero mayor es: "+mayorA);
            System.out.println("El numero menor es: "+menorA);
            System.out.println("El promedio de los nuemros es : "+promedioA);
            
            
            flag=false;
        }while(flag);
    }
}
