/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.TiendaEnt;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los
 * distintos productos que venderemos y el precio que tendrán. Además, se
 * necesita que la aplicación cuente con las funciones básicas. Estas las
 * realizaremos en el servicio. Como, introducir un elemento, modificar su
 * precio, eliminar un producto y mostrar los productos que tenemos con su
 * precio (Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto
 * y de valor el precio. Realizar un menú para lograr todas las acciones
 * previamente mencionadas.
 *
 * @author Ulises
 */
public class TiendaServ {

    Scanner leer = new Scanner(System.in);
    TiendaEnt valor = new TiendaEnt();
    HashMap<String, Integer> listaTienda = new HashMap();

    public void menu() {
        boolean flag = true;
        int opcion;
        System.out.println("opciones:\n"
                + "1. ingresar producto\n"
                + "2. eliminar producto\n"
                + "3. modificar precio\n"
                + "4. mostrar productos guardados\n"
                + "5.salir");
        do {
            System.out.print("ingrese opcion = ");
            opcion = leer.nextInt();
            System.out.println("");

            switch (opcion) {
                case 1:
                    ingresarProd();
                    break;
                case 2:
                    eliminarProd();
                    break;
                case 3:
                    modificarPrecio();
                    break;
                case 4:
                    mostrarTienda();
                case 5:
                    flag=false;
                    break;
                default:
                    System.out.println("OPCION INCORRECTA");
                    System.out.println("-------------------------------");
            }

        } while (flag);
    }

    public void ingresarProd() {

        String producto;
        System.out.print("Ingrese el nombre del producto: ");
        valor.setProducto(leer.next());
        System.out.println("");
        System.out.print("Ingrese el precio del producto: ");
        valor.setPrecio(leer.nextInt());
        System.out.println("");
        listaTienda.put(valor.getProducto(), valor.getPrecio());
        System.out.println("-------------------------------");

    }

    public void eliminarProd() {

        String nombre;
        System.out.println("Ingrese el nombre del producto: ");
        nombre = leer.next();

        if (listaTienda.remove(nombre) != null) {
            System.out.println("Producto eliminado");
        } else {
            System.out.println("ERROR, el producto no existe");
        }

        System.out.println("-------------------------------------------");
        


    }

    public void modificarPrecio() {

        String nombreaux;
        int notas;
        System.out.println("Ingrese el nombre del producto");
        nombreaux = leer.next();

        if (listaTienda.containsKey(nombreaux)) {
            System.out.println("Ingrese el nuevo precio");
            listaTienda.put(nombreaux, leer.nextInt());
        } else {
            System.out.println("ERROR, el producto no existe");
        }
        
        System.out.println("-------------------------------");
        
        /**
         System.out.println("NUEVO PRECIO: ");
            int newPrecio=leer.nextInt();
        if(productos.replace(cambio, newPrecio) != null){
            System.out.println("cambio realizado");
        }else{
            System.out.println("no se encontro la key");
        }
          */
        /**
        if (productos.containsKey(cambio)){
            System.out.println("NUEVO PRECIO: ");
            int newPrecio=leer.nextInt();
            productos.replace(cambio, newPrecio);
        }else{
            System.out.println("este producto no esta en la lista");
        }
        * */
    }
    
    
    public void mostrarTienda(){
        for (Map.Entry<String, Integer> aux : listaTienda.entrySet()) {
            Object key = aux.getKey();
            Object val = aux.getValue();
            System.out.println("PRODUCTOS INGRESADOS: ");
            System.out.println("-------");
            System.out.println("Producto: " + key + "\n"
                    + "Precio: " + val);
            System.out.println("-------");
        }
        
    }
}

