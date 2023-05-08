/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia_2.serrvicio;

import com.mycompany.herencia_2.entidades.Electrodomestico;
import com.mycompany.herencia_2.entidades.Lavadora;
import com.mycompany.herencia_2.entidades.Televisor;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author crowl
 */
public class Servicio {
    
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    
    
    ArrayList<Electrodomestico> lista = new ArrayList();
    
    public void menu(){
        boolean flag=true;
        double valor=0;
        
        //JOptionPane.showConfirmDialog(null, "hola");
        do {
            
            
            
            System.out.println("Ingrese que quiere comprar.\n"
                    + "1. Lavadora\n"
                    + "2. Televisor\n"
                    + "3. Salir");
            int opcion=leer.nextInt();
            
            switch(opcion){
            
                case 1:
                    Lavadora one=new Lavadora();
                    one.crearLavadora();
                    lista.add(one);
                    break;
                case 2:
                    Televisor two=new Televisor();
                    two.crearTelevisor();
                    lista.add(two);
                    break;
                case 3:
                    flag=false;
            }
            
        } while(flag);
        
        for (Electrodomestico electrodomestico : lista) {
            System.out.println(electrodomestico.toString());
            
        }
        
        for (Electrodomestico electrodomestico : lista) {
            valor+= electrodomestico.getPrecio();
        }
        
        System.out.println("En total el precio es "+valor);
    }
}
