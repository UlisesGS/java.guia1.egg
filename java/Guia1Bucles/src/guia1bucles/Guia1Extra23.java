package guia1bucles;

import java.util.Random;
import java.util.Scanner;

/*23. Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se*/

public class Guia1Extra23 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rdn = new Random();
        String[][] matriz = new String[20][20];
        String palabra;
        boolean flag=true;
        int cont = 0, cont1=0;
        do {
            int fila = rdn.nextInt(9);
            String[] vector = new String[5];
            int x = 0, y = 1;
            System.out.println("Ingrese una palabra de 3 a 5 caracteres");
            palabra = leer.nextLine();
            palabra = palabra.toUpperCase();
            if (palabra.length() > 2 && palabra.length() < 6) {
                for (int i = 0; i < vector.length; i++) {
                    if (y <= palabra.length()) {
                        vector[i] = palabra.substring(x, y);
                        x++;
                        y++;
                    }
                    System.out.print("[" + vector[i] + "]");
                }
                System.out.println("\n====================================================");
                cont=vector.length;
                while(cont<1){ 
                for (int i = fila; i < fila + 1; i++) {
                    for (int j = 0; j < 1; j++) {
                        for (int k = 0; k < vector.length; k++) {
                            if (matriz[i][k]==null){
                            matriz[i][k] = vector[k];
                            cont++;
                            }else
                                fila = rdn.nextInt(5);
                                cont=0;
                        }
                    }
                }
              }
            } else {
                System.out.println("Palabra Incorrecta");
            }
        } while (cont < 5);
        
        if(cont<5){
        for (int i = 0; i < 20; i++) {
                    for (int j = 0; j < 20; j++) {
                        if (matriz[i][j] == null) {
                            String cara = "";
                            int num = rdn.nextInt(9);
                            cara = Integer.toString(num);

                            matriz[i][j] = cara;
                        }
                    }
                }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
        }
    }
 }
