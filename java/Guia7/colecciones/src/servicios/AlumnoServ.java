/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.AlumnoEnt;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Crear una clase llamada Alumno que mantenga información sobre las notas de
 * distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una
 * lista de tipo Integer con sus 3 notas. En el servicio de Alumno deberemos
 * tener un bucle que crea un objeto Alumno. Se pide toda la información al
 * usuario y ese Alumno se guarda en una lista de tipo Alumno y se le pregunta
 * al usuario si quiere crear otro Alumno o no. Después de ese bucle tendremos
 * el siguiente método en el servicio de Alumno: Método notaFinal(): El usuario
 * ingresa el nombre del alumno que quiere calcular su nota final y se lo busca
 * en la lista de Alumnos. Si está en la lista, se llama al método. Dentro del
 * método se usará la lista notas para calcular el promedio final de alumno.
 * Siendo este promedio final, devuelto por el método y mostrado en el main.
 *
 * @author Ulises
 */
public class AlumnoServ {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<AlumnoEnt> listAlumno = new ArrayList();

    public ArrayList<AlumnoEnt> pedirDatos() {
        //ArrayList<AlumnoEnt> listAlumno = new ArrayList();

        boolean flag = true;

        do {

            ArrayList<Integer> aux = new ArrayList();
            String nombreaux, opcion;

            System.out.print("Ingrese el nombre: ");
            nombreaux = leer.next();
            System.out.println("");

            System.out.println("Ingrese la tres notas: ");

            for (int i = 0; i < 3; i++) {
                aux.add(leer.nextInt());
            }

            listAlumno.add(new AlumnoEnt(nombreaux, aux));
            
            System.out.println("Desea ingresar otro alumno?");
            opcion = leer.next();

            if (opcion.equalsIgnoreCase("No")) {
                flag = false;
            } else if (opcion.equalsIgnoreCase("Si")) {
                System.out.println("Reiniciando programa...");
            } else {
                System.out.println("Ingreso mal algun dato");
            }
            
        } while (flag);

        return listAlumno;
    }

    public int notaFinal(String nombre) {

        ArrayList<Integer> aux2 = new ArrayList();
        int suma = 0;
        for (int i = 0; i < listAlumno.size(); i++) {

            if (listAlumno.get(i).getAlumno().equalsIgnoreCase(nombre)) {

                for (int j = 0; j < listAlumno.size(); j++) {
                    aux2 = (listAlumno.get(i).getNotas());
                    suma += aux2.get(j);
                }

            }
        }
        return suma/3;
    }
    
    
}
