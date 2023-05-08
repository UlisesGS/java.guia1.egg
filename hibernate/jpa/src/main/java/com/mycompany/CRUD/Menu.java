/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.CRUD;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ulises
 */
public class Menu {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void menu() throws Exception {
            
            boolean flag=true;
            int op=0;
        
        do {
            
            
            
            try{
                
                System.out.println("--- LIBRERIA ---");
                System.out.println(" 1. LIBROS                ");
                System.out.println(" 2. AUTORES               ");
                System.out.println(" 3. EDITORIALES           ");
                System.out.println(" 4. PARA SALIR            ");
                System.out.println("**");
                System.out.println("Ingrese un opcion...\n");
                op = leer.nextInt();
                
                switch (op)
                {
                    case 1:
                        menuLibro();
                        break;
                    case 2:
                        menuAutor();
                        break;
                    case 3:
                        menuEditorial();
                        break;
                    case 4:
                        System.out.println("\nCHAU!!  \n");
                        flag=false;
                    default:
                        System.out.println("Ingresó una opcion no valida");
                        op = 0;
                }
            } catch (InputMismatchException e){
                
                e.getMessage();
                System.out.println("PAPARULO NO METAS LETRAS\n");
                leer.next();
                
            }
            
            
        } while (flag==true);

    }
    
    
    public void menuLibro() throws Exception{
    
        int op=0;
        
        boolean flag=true;
        
        do {

            try{
                
                System.out.println("*      Libros     **");
                System.out.println(" 1. Crear               ");
                System.out.println(" 2. Modificar               ");
                System.out.println(" 3. Busqueda ISBN                ");
                System.out.println(" 4. Busqueda titulo               ");
                System.out.println(" 5. Busqueda autor         ");
                System.out.println(" 6. Busqueda editorial           ");
                System.out.println(" 7. Listar libros");
                System.out.println(" 8. Eliminar");    
                System.out.println(" 9. volver");
                System.out.println("**");
                System.out.println("Ingrese un opcion...\n");
                op = leer.nextInt();
                
                ServicioLibro libro=new ServicioLibro();
                Long num;
                
                switch (op)
                {
                    case 1:
                        libro.crearLibro();
                        break;
                        
                    case 2:
                        System.out.print("Ingrese numero de ISBN = ");
                        num = leer.nextLong();
                        libro.modificarLibro(num);
                        break;
                        
                    case 3:
                        System.out.print("Ingrese numero de ISBN = ");
                        num = leer.nextLong();
                        libro.buscarLibroIsbn(num);
                        break;
                        
                    case 4:
                        System.out.print("Ingrese el titulo = ");
                        String titulo = leer.next();
                        libro.buscarLibroTitulo(titulo);
                        break;
                        
                    case 5:
                        System.out.print("Ingrese el autor = ");
                        String autor = leer.next();
                        libro.buscarLibroTitulo(autor);
                        break;
                        
                    case 6:
                        System.out.print("Ingrese el ediitorial = ");
                        String ediitorial = leer.next();
                        libro.buscarLibroEditorial(ediitorial);
                        break;
                        
                    case 7:
                        libro.listarLibro();
                        break;
                        
                    case 8:
                        System.out.print("ingrese el ISBN = ");
                        num = leer.nextLong();
                        libro.eliminarLibro(num);
                        break;
                        
                    case 9:
                        System.out.println("volviendo....");
                        menu();
                        flag=false;
                        break;
                    default:
                        System.out.println("Ingresó una opcion no validad");
                        op = 0;
                }
            } catch (InputMismatchException e){
                
                e.getMessage();
                System.out.println("PAPARULO NO METAS LETRAS\n");
                leer.next();
                
            }
            
            
        } while (flag);
    
    }
    
    
    public void menuAutor() throws Exception{
    
        
        int op=0;
        
        boolean flag=true;
        
        do {

            try{
                
                System.out.println("*      Autores     **");
                System.out.println(" 1. Crear");
                System.out.println(" 2. Modificar");
                System.out.println(" 3. Busqueda ID");
                System.out.println(" 4. Listar autores");
                System.out.println(" 5. Eliminar");    
                System.out.println(" 6. volver");
                System.out.println("**");
                System.out.println("Ingrese un opcion...\n");
                op = leer.nextInt();
                
                ServicioAutor autor=new ServicioAutor();
                Integer num;
                
                switch (op)
                {
                    case 1:
                        autor.crearAutor();
                        break;
                        
                    case 2:
                        System.out.print("Ingrese numero de ID = ");
                        num = leer.nextInt();
                        autor.modificarAutor(num);
                        break;
                        
                    case 3:
                        System.out.print("Ingrese numero de ID = ");
                        num = leer.nextInt();
                        autor.modificarAutor(num);
                        break;
                        
                    case 4:
                        autor.listarAutor();
                        break;
                        
                    case 5:
                        System.out.print("Ingrese el ID = ");
                        num = leer.nextInt();
                        autor.eliminarAutor(num);
                        break;
                        
                    case 6:
                        System.out.println("volviendo....");
                        menu();
                        flag=false;
                        break;
                        
                    default:
                        System.out.println("Ingresó una opcion no validad");
                        op = 0;
                }
            } catch (InputMismatchException e){
                
                e.getMessage();
                System.out.println("PAPARULO NO METAS LETRAS\n");
                leer.next();
                
            }
            
            
        } while (flag);
        
    
    }
    
    
    public void menuEditorial() throws Exception{
    
        
        int op=0;
        
        boolean flag=true;
        
        do {

            try{
                
                System.out.println("*      Editoriales     **");
                System.out.println(" 1. Crear");
                System.out.println(" 2. Modificar");
                System.out.println(" 3. Busqueda ID");
                System.out.println(" 4. Listar autores");
                System.out.println(" 5. Eliminar");    
                System.out.println(" 6. volver");
                System.out.println("**");
                System.out.println("Ingrese un opcion...\n");
                op = leer.nextInt();
                
                ServicioEditorial editorial=new ServicioEditorial();
                Integer num;
                
                switch (op)
                {
                    case 1:
                        editorial.crearEditorial();
                        break;
                        
                    case 2:
                        System.out.print("Ingrese numero de ID = ");
                        num = leer.nextInt();
                        editorial.modificarEditorial(num);
                        break;
                        
                    case 3:
                        System.out.print("Ingrese numero de ID = ");
                        num = leer.nextInt();
                        editorial.buscarEditorialId(num);
                        break;
                        
                    case 4:
                        editorial.listarEditorial();
                        break;
                        
                    case 5:
                        System.out.print("Ingrese el ID = ");
                        num = leer.nextInt();
                        editorial.eliminarEditorial(num);
                        break;
                        
                    case 6:
                        System.out.println("volviendo....");
                        menu();
                        flag=false;
                        break;
                        
                    default:
                        System.out.println("Ingresó una opcion no validad");
                        op = 0;
                }
            } catch (InputMismatchException e){
                
                e.getMessage();
                System.out.println("PAPARULO NO METAS LETRAS\n");
                leer.next();
                
            }
            
            
        } while (flag);
        
    
    }
    
    
}
