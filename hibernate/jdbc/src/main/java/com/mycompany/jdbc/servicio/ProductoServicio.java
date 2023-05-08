/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jdbc.servicio;

import com.mycompany.jdbc.entidades.producto;
import com.mycompany.jdbc.persistencia.ProductosDAO;
import java.util.Scanner;

/**
 *
 * @author Ulises
 */
public class ProductoServicio {
    
    private ProductosDAO dao;

    public ProductoServicio() {
        this.dao = new ProductosDAO();
    }
    
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    
    //NO FUNCIONA EL SEGUNDO IF DEL TRY
    public void crearProducto(String nombre) throws Exception{
    
        try {
            
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Tiene que ingresar un producto");
            }
            
            if (dao.buscarProducto(nombre) != null) {
                throw new Exception("Ya existe un producto con este nombre ' "+nombre+" '");
            }
          
            //Creamos el producto
            producto Producto=new producto();
            Producto.setNombre(nombre);
            System.out.print("Ingrese precio = ");
            Producto.setPrecio(leer.nextDouble());
            System.out.println("");
            System.out.print("Ingrese codigo de fabricante = ");
            Producto.setCodigo_fabricante(leer.nextInt());
            
//            try {
                dao.guardarProducto(Producto);
//                
//            } catch (Exception e) {
//                throw e;
//            }
//                
            
        } catch (Exception e) {
            
            throw e;
            
        }
    
    }
    
    public void ingresoProducto() throws Exception{
    
        boolean flag=true;
        
        do {
            
            System.out.println("1. Ingresar Producto\n"
                    + "2. Modificar Producto\n"
                    + "3. Eliminar Producto\n"
                    + "4. Buscar Producto\n"
                    + "5. Listar Productos\n"
                    + "6. Listar nombre/precio\n"
                    + "7. Ordenar Precios\n"
                    + "8. Listar Portatiles\n"
                    + "9. Producto Barato\n"
                    + "10.Volverr");
            
            int opcion=leer.nextInt();
            System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
            
             switch (opcion) {
                case 1:
                    System.out.print("ingrese el nombre del producto = ");
                    String nombre = leer.next();
                    crearProducto(nombre);
                    System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
                    break;
                    
                case 2:
                    producto P1 = new producto();
                    System.out.print("Ingrese el codigo del producto");
                    P1.setCodigo(leer.nextInt());
                    System.out.println("");
                    System.out.println("Ingrese el nuevo nombre del producto");
                    P1.setNombre(leer.next());
                    System.out.println("");
                    System.out.print("Ingrese el nuevo precio");
                    P1.setPrecio(leer.nextDouble());
                    System.out.println("");
                    P1.setCodigo_fabricante(leer.nextInt());
                    dao.modificarProducto(P1);
                    System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
                    break;
                    
                case 3:
                        System.out.print("Ingrese el nombre del poroducto = ");
                        dao.eliminarProducto(leer.next());
                        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
                        break;
                    
                case 4:
                    System.out.print("ingrese el nombre del producto = ");
                    dao.buscarProducto(leer.next());
                    System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
                    break;
                    
                case 5:
                    dao.listarProducto();
                    System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
                    break;

                case 6:
                    dao.listarNomPrecio();
                    System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
                    break;
                    
                case 7:
                    dao.ordenPrecio();
                    System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
                    break;
                    
                case 8:
                    dao.listarPortatiles();
                    System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
                    break;
                    
                case 9:
                    dao.productoBarato();
                    System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
                    break;
                    
                case 10:
                    System.out.println("Volviendo...");
                    flag=false;
                    System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
                        
             }
        } while (flag);
    
    }
    
    
}
