package guia1bucles;

import java.util.Scanner;

/*13. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * */

public class Guia1Ejer13 {

    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese el tamanio de su cuadrado");
        int num=leer.nextInt();
        
        if(num >= 0 && num <= 50){
            
            //primera linea
            for(int i = 0; i < num; i++){
                System.out.print("* ");
            }
            System.out.println();
            
            //centro del cuadrado 
            for(int i = 0; i < num-2; i++){
                System.out.print("* ");
                for(int j = 0; j < num-2; j++){
                   System.out.print("  ");
                }
                System.out.println("* ");
            }
            
            //ultima linea
            for(int i = 0; i < num; i++){
                System.out.print("* ");
            }
        }else{
            System.out.println("Error\n" +
                                "vuelva a intentar.");
        }
    }
}
    

