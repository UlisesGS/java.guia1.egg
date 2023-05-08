/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import Entidades.NifEnt;
import java.util.Scanner;

/**
 *
 * @author Ulises
 */
public class NifServ {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
   public NifEnt crearNif(){
       NifEnt valor=new NifEnt();
       System.out.println("Ingrese el DNI");
       valor.setDNI(leer.nextLong());
       String []vector= {"T" , "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E",};
       double compro=valor.getDNI()%23;
       int x=(int)compro;
       System.out.println(x);
       valor.setNIF(vector[x]);
       return valor;
   }
   public void mostrar(NifEnt valor){
       System.out.println(valor.getDNI()+"-"+valor.getNIF());
   }
}
