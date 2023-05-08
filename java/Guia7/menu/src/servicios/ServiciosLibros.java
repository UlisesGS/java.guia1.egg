/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import Entidades.LibrosPaginas;
import java.util.Scanner;

/**
 *
 * @author Ulises
 */
    public class ServiciosLibros {
       Scanner leer=new Scanner(System.in).useDelimiter("\n");
       public  LibrosPaginas lpComprobacion(){
           
           LibrosPaginas lp = new LibrosPaginas();
           
           System.out.println("ingrese el codigo del libro:");
           lp.setCodigo(leer.nextInt());
           
           System.out.println("ingrese el titulo:");
           lp.setTitulo(leer.next());
           
           System.out.println("ingrese el autor:");
           lp.setAutor(leer.next());
           
           System.out.println("ingrese la cantidad de paginas del libro");
           lp.setCantPaginas(leer.nextInt());
           
           return lp;
    }
      
}
