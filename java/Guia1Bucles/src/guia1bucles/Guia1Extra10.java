package guia1bucles;
/*Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.*/

import java.util.Scanner;
import java.util.Random;

public class Guia1Extra10 {

    public static void main(String[] args) {
        int num1, num2, usuario, res;
        boolean flag=true;
        Scanner leer= new Scanner (System.in);
        num1=new Random().nextInt(4);
        num2=new Random().nextInt(4);
        
        res = num1 *num2;
        System.out.println("ingrese su resultado");
        while(flag){
            
            usuario=leer.nextInt();
            
            if(usuario==res){
                System.out.println("respuesta correcta");
                break;
            }else
                System.out.println("respuesta incorrecta.");
            
        }
    }
    
}
