/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jdbc.servicio;

import com.mycompany.jdbc.entidades.fabricante;
import com.mycompany.jdbc.persistencia.FabricanteDAO;
import java.util.Scanner;

/**
 *
 * @author Ulises
 */


public class FabricanteServicio {
    
    private FabricanteDAO dao;

    public FabricanteServicio() {
        this.dao = new FabricanteDAO();
    }
    
    Scanner leer=new Scanner (System.in).useDelimiter("\n");
    
    public void crearFabricante(String nombre) throws Exception{
    
        try {
            
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Tiene que ingresar un fabricante");
            }
            
            if (dao.buscarFabricante(nombre) != null) {
             
                throw new Exception("Ya existe un usuario con el mismo nombre ' "+nombre+" ' ");
            }
            
            //Creamos el usurario
            fabricante Fabricante = new fabricante();
            Fabricante.setNombre(nombre);
            dao.guardarFabricante(Fabricante);
            
        } catch (Exception e) {
            System.out.println("ERROR!!!");
        }
        
    }
    
    
   public void ingresoFabricante() throws Exception {
        
        boolean flag=true;

        do {

            System.out.println("1. Ingresar Fabricante\n"
                    + "2. Modificar Fabricante\n"
                    + "3. Eliminar Fabricante\n"
                    + "4. Buscar Fabricante\n"
                    + "5. Listar Fabricante\n"
                    + "6. Volver");
            
            int opcion = leer.nextInt();
            System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
            switch (opcion) {
                case 1:
                    System.out.print("ingrese el nombre del fabricante = ");
                    String nombre = leer.next();
                    crearFabricante(nombre);
                    System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
                    break;
                    
                case 2:                    
                    fabricante F1 = new fabricante();
                    System.out.print("Ingrese el codigo del fabricante = ");
                     F1.setCodigo(leer.nextInt());
                     System.out.println("");
                     System.out.print("Ingrese el nuevo nombre = ");
                    F1.setNombre(leer.next());                   
                    dao.modificarFabricante(F1);
                    System.out.println("");
                    System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
                    break;
                    
                case 3:
                    System.out.print("ingrese el nombre del fabricante = ");
                    dao.eliminarFabricante(leer.next());
                    System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
                    break;
                    
                case 4:
                    System.out.print("ingrese el nombre del fabricante = ");
                    dao.buscarFabricante(leer.next());
                    System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
                    break;
                    
                case 5:
                    dao.listarFabricante();
                    System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
                    break;
                
                case 6:
                    System.out.println("volviendo...");
                    System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
                    flag=false;

            }
            
        } while (flag==true);
    }
    
    
    
}
