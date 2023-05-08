/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jdbc.servicio;

import com.mycompany.jdbc.entidades.fabricante;
import java.util.Scanner;

/**
 *
 * @author Ulises
 */
public class Servicios {
    
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    
    public void menu() throws Exception{
        
        boolean flag=true;
        
        do {
            
            System.out.println("1.Fabricante\n"
                + "2.Producto\n"
                + "3.Salir");
            
        int opcion = leer.nextInt();
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        switch(opcion){
            case 1:
                FabricanteServicio valor = new FabricanteServicio();
                valor.ingresoFabricante();
                break;
                
            case 2:
                ProductoServicio valor1 = new ProductoServicio();
                valor1.ingresoProducto();
                break;
                    
            case 3:
                System.out.println("Saliendo del programa....");
                flag=false;
        
        }
        
        } while (flag);
    }
    

}
