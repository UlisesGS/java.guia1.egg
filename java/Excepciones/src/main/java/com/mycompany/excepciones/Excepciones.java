/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.excepciones;

/**
 *
 * @author Ulises
 */
public class Excepciones {

    public static void main(String[] args) {
        
        try{
        
            System.out.println(metodo());
        
        }catch(Exception e){
        
            System.out.println("excepcion en metodo");
            e.printStackTrace();
        }
        
        
        
     
}
    private static  int metodo() {
         
       int valor=0;
         try{
           valor = valor + 1;
           valor = valor + Integer.parseInt ("w");
           valor = valor + 1;
           System.out.println("Valor final del try: " + valor) ;
        } catch ( NumberFormatException e ) {
            valor = valor + Integer.parseInt ("42");
            System.out.println("Valor final del catch: " + valor) ;
        } finally {
            valor = valor + 1;
            System.out.println("Valor final del finally: " + valor) ;
        }
     
        valor = valor +1;
        System.out.println("Valor antes del return: "+ valor);
        return valor;
    
    }
}
