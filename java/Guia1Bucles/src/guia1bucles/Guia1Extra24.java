package guia1bucles;

import java.util.Scanner;


public class Guia1Extra24 {


    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        int lon, a=0, b=1, c;
        
        lon=leer.nextInt();
        
        for (int i = 0; i < lon; i++) {
            System.out.print(a+ " ");
            c=a+b;
            a=b;
            b=c;
        }

    }
    
}
