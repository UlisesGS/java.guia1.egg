package guia1bucles;
/*17. Recorrer un vector de N enteros contabilizando 
cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).*/
import java.util.Scanner;
import java.util.Random;

public class Guia1Ejer17 {

    public static void main(String[] args) {
        
        int tamaño, uno=0, dos=0, tres=0, cuatro=0, cinco=0;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el tamaño de su vector: ");
        tamaño=leer.nextInt();
        int [] vector = new int[tamaño];
        
        for (int i=0; i< vector.length; i++){
            vector[i]=new Random().nextInt(99999);
        }
        
        for (int i=0; i < vector.length; i++){
            if(vector[i] >= 0 && vector[i] <= 9){
                uno++;
                
            } else if(vector[i] >= 10 && vector[i] <= 99){
                dos++;
                
            } else if(vector[i] >= 100 && vector[i] <= 999){
                tres++;
                
            } else if(vector[i] >= 1000 && vector[i] <= 9999){
                cuatro++;
                
            } else if(vector[i] >= 10000 && vector[i] <= 99999){
                cinco++;
                
            }
        }
        System.out.println("Informe: \n" + 
                           "1 dígito: "+ uno +"\n" +
                           "2 dígito: "+ dos +"\n" +
                           "3 dígito: "+ tres +"\n" +
                           "4 dígito: "+ cuatro +"\n" +
                           "5 dígito: "+ cinco);
    }
    
}
