/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import comparator.PaisesComp;
import entidades.PaisesEnt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * *. Se requiere un programa que lea y guarde países, y para evitar que se
 * ingresen repetidos usaremos un conjunto. El programa pedirá un país en un
 * bucle, se guardará el país en el conjunto y después se le preguntará al
 * usuario si quiere guardar otro país o si quiere salir, si decide salir, se
 * mostrará todos los países guardados en el conjunto. (Recordemos hacer los
 * servicios en la clase correspondiente) Después deberemos mostrar el conjunto
 * ordenado alfabéticamente: para esto recordar cómo se ordena un conjunto. Por
 * último, al usuario se le pedirá un país y se recorrerá el conjunto con un
 * Iterator, se buscará el país en el conjunto y si está en el conjunto se
 * eliminará el país que ingresó el usuario y se mostrará el conjunto. Si el
 * país no se encuentra en el conjunto se le informará al usuario.
 *
 * @author Ulises
 */
public class PaisesServ {
    
    Scanner leer = new Scanner(System.in);
    PaisesEnt valor = new PaisesEnt();
    Set<PaisesEnt> listaPaises = new HashSet();
    
    public void ingresarPais() {
        
        boolean flag = true;
        
        do {
            
            System.out.print("Ingrese el nombre del pais: ");
            valor.setPais(leer.next());
            System.out.println("");
            
            guardarDatos();
            
            System.out.println("Desea ingresar otro pais??");
            String opcion = leer.next();
            
            if (opcion.equalsIgnoreCase("si")) {
                System.out.println("Reiniciando......");
            } else {
                System.out.println("Cerrando programa...");
                flag = false;
            }
            
        } while (flag);
        
        mostrarDatos();
        System.out.println("-----------------------------");
        ordenarDatos();
        System.out.println("-----------------------------");
        eliminarDatos();
        System.out.println("-----------------------------");
        ordenarDatos();
        
    }
    
    public Set<PaisesEnt> guardarDatos() {
        
        listaPaises.add(new PaisesEnt(valor.getPais()));
        
        return listaPaises;
    }
    
    public void mostrarDatos() {

        //listaPaises.forEach(System.out::println);
        for (PaisesEnt listaPaise : listaPaises) {
            System.out.println(listaPaise);
        }
        
    }
    
    public void ordenarDatos() {
        
        ArrayList<PaisesEnt> ArrayPaises = new ArrayList(listaPaises);
        
        System.out.println("Paises ordenados: ");

        //Collections.sort(ArrayPaises, PaisesComp.paisesAlfabe);
        ArrayPaises.sort(PaisesComp.paisesAlfabe);
        for (PaisesEnt listaPais : ArrayPaises) {
            System.out.println(listaPais.getPais());
        }
        
    }
    
    public void eliminarDatos() {
        
        boolean flag = true;
        
        
        
        do {
            Iterator<PaisesEnt> iterator = listaPaises.iterator();
            System.out.println("Desea eliminar un dato?");
            String opcion = leer.next();
            
            if (opcion.equalsIgnoreCase("Si")) {
                
                System.out.print("Ingrese el nombre a eliminar: ");
                String nombre = leer.next();
                System.out.println("");
                
                while (iterator.hasNext()) {
                    if (iterator.next().getPais().equalsIgnoreCase(nombre)) {
                        iterator.remove();
                    }
                }
                
                for (PaisesEnt listaPaise2 : listaPaises) {
                    System.out.println(listaPaise2);
                }
                
            } else {
                flag = false;
            }
            
        } while (flag);
        
    }
}
