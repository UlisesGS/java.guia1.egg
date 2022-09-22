package guia1bucles;
/*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.*/
import java.util.Scanner;

public class Guia1Extra2 {
    
    public static void main(String[] args) {
        int A,B,C,D,X;
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese los 4 valores: ");
        A=leer.nextInt();
        B=leer.nextInt();
        C=leer.nextInt();
        D=leer.nextInt();
        System.out.println("");
        System.out.println("---------------");
        
        X = B;
        B = C;
        C = A;
        A = D;
        D = X;
        System.out.println(A+" "+B+" "+C+" "+D);
    }
    
}
