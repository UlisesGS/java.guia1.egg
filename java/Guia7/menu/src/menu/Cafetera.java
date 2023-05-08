/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menu;

import Entidades.CafeteraEnt;
import java.util.Scanner;
import servicios.CafeteraServ;

/**
 *
 * @author Ulises
 */
public class Cafetera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        boolean flag=true;
        Scanner leer=new Scanner (System.in);
        CafeteraServ valorfinal=new CafeteraServ();
        CafeteraEnt valorent=valorfinal.llenarCafetera();
       
         while (flag) {

            System.out.println("-----------------");
            System.out.println("ingrese su opcion \n"
                    + "1. Servir taza\n"
                    + "2. Vaciar cafetera\n"
                    + "3. Llenar cafetera\n"
                    + "6. salir\n");
            System.out.println("-----------------");
            opcion = leer.nextInt();
            System.out.println("-----------------");

            switch (opcion) {
                case 1:
                    valorfinal.servirTaza(valorent);
                    break;
                case 2:
                    valorfinal.vaciarCafetera(valorent);
                    break;
                case 3:
                    valorfinal.agregarCafe(valorent);
                    break;
                case 6:
                    System.out.println("Gracias por haber usado el programa.");
                    flag = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }
    }
    
}
