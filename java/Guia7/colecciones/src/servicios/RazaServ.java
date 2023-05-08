/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.RazaEnt;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
 * String. El programa pedirá una raza de perro en un bucle, el mismo se
 * guardará en la lista y después se le preguntará al usuario si quiere guardar
 * otro perro o si quiere salir. Si decide salir, se mostrará todos los perros
 * guardados en el ArrayList
 *
 * @author Ulises
 */
public class RazaServ {

    RazaEnt r1 = new RazaEnt();
    List<RazaEnt> listaRaza = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public RazaEnt crearR() {

        boolean flag = false;

        String opcion = "", texto;

        do {
            System.out.println(" ¿quiere ingrese una Raza Perro? SI/NO ");
            opcion = leer.next();
            if (opcion.equalsIgnoreCase("Si")) {
                System.out.println("Ingrese una raza: ");
                añadir();

            } else if (opcion.equalsIgnoreCase("No")) {
                flag = true;
            } else {
                System.out.println("Ingreso mal la opcion");
            }
        } while (flag == false);

        return r1;
    }

    public void añadir() {

        listaRaza.add(new RazaEnt(leer.next()));

    }

    public void mostrar() {
        for (RazaEnt raza : listaRaza) {
            System.out.println(raza);
        }
    }

    public void eliminar() {

        boolean flag = false;

        String opcion = "";

        System.out.println("desea eliminar una raza?SI/NO");
        opcion = leer.next();
        int razaEliminar;

        while (opcion.equalsIgnoreCase("si")) {
            System.out.println("ingrese la raza que quiere eliminar: ");
            razaEliminar = leer.nextInt();
            listaRaza.remove(razaEliminar);

            System.out.println("Quiere eliminar otra raza");
            opcion = leer.next();
        }

        mostrar();
    }
}
