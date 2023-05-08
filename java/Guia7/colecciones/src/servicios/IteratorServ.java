/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.IteratorEnt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Ulises
 */
public class IteratorServ {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    ArrayList<IteratorEnt> listaAlumno = new ArrayList();
    IteratorEnt alumno = new IteratorEnt();

    public void crearAlumno() {
        String respuesta;
        do {
            ArrayList<Integer> listaNotas = new ArrayList();
            System.out.println("Por favor, ingrese el nombre del alumno.");
            String nombre = leer.next();
            for (int i = 0; i < 3; i++) {
                System.out.println("Por favor, ingrese la nota N°" + (i + 1));
                listaNotas.add(leer.nextInt());
            }

            listaAlumno.add(new IteratorEnt(nombre, listaNotas));
            System.out.println("¿Desea ingresar un nuevo alumno? (Sí/No)");
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("Sí") || (respuesta.equalsIgnoreCase("Si")));
    }

    public void mostrarLista() {
        for (IteratorEnt nombreAlumno : listaAlumno) {
            System.out.println(nombreAlumno.toString());
        }
    }

//    Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota 
//final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro 
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este 
//promedio final, devuelto por el método y mostrado en el main
    public IteratorEnt buscarAlumno() {
        IteratorEnt alumnoBuscado = null;
        boolean flag = true;
        Iterator<IteratorEnt> iterator = listaAlumno.iterator();
        System.out.println("Ingrese el nombre del alumno que desea buscar");
        String nombre = leer.next();
        
        while (iterator.hasNext()) {
            IteratorEnt next = iterator.next();
            if (next.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(next);//Para que me muestre este spolo alumno
                alumnoBuscado = next;
                flag = false;
                System.out.println("La nota final es " + notaFinal(alumnoBuscado));
            }
        }
        if (flag) {
            System.out.println("El alumno no se encuentra en la lista.");
        }
        
        return alumnoBuscado;
    }

    public double notaFinal(IteratorEnt alumnoBuscado){
        double notaFinal;
        int suma = 0;
        int aux = 0;
        for (int nota : alumnoBuscado.getNotas()) {
            suma += nota;
        }
        notaFinal = suma / 3;
        
        return notaFinal;
    }
    
}

