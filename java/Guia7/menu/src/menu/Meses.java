/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menu;

import java.util.Scanner;

/**
 * Crea una clase en Java donde declares una variable de tipo array de Strings
 * que contenga los doce meses del año, en minúsculas. A continuación, declara
 * una variable mesSecreto de tipo String, y hazla igual a un elemento del array
 * (por ejemplo, mesSecreto = mes[9]. El programa debe pedir al usuario que
 * adivine el mes secreto. Si el usuario acierta mostrar un mensaje, y si no lo
 * hace, pedir que vuelva a intentar adivinar el mes secreto. Un ejemplo de
 * ejecución del programa podría ser este: Adivine el mes secreto. Introduzca el
 * nombre del mes en minúsculas: febrero No ha acertado. Intente adivinarlo
 * introduciendo otro mes: agosto ¡Ha acertado!
 *
 * @author Ulises
 */
public class Meses {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] M1 = new String[12];
        String aux, valor;
        

        M1[0] = "enero";
        M1[1] = "febrero";
        M1[2] = "marzo";
        M1[3] = "Abril";
        M1[4] = "mayo";
        M1[5] = "junio";
        M1[6] = "julio";
        M1[7] = "agosto";
        M1[8] = "septiembre";
        M1[9] = "octubre";
        M1[10] = "noviembre";
        M1[11] = "diciembre";
        aux=M1[(int)(Math.random()*12)];
        
        do {
            
            System.out.print("Ingrese el mes secreto: ");
            valor=leer.next();
            
            
            
        } while (!aux.equals(valor));
        
        System.out.println("Adivinasteeeeeeeee putooooooooo");
    }

}
