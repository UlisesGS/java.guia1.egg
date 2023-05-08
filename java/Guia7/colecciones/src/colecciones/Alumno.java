/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones;

import entidades.AlumnoEnt;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.AlumnoServ;

/**
 * 3. Crear una clase llamada Alumno que mantenga información sobre las notas de
 * distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una
 * lista de tipo Integer con sus 3 notas. En el main deberemos tener un bucle
 * que crea un objeto Alumno. Se pide toda la información al usuario y ese
 * Alumno se guarda en una lista de tipo Alumno y se le pregunta al usuario si
 * quiere crear otro Alumno o no. Después de ese bluce tendremos el siguiente
 * método en la clase Alumno: Método notaFinal(): El usuario ingresa el nombre
 * del alumno que quiere calcular su nota final y se lo busca en la lista de
 * Alumnos. Si está en la lista, se llama al método. Dentro del método se usará
 * la lista notas para calcular el promedio final de alumno. Siendo este
 * promedio final, devuelto por el método y mostrado en el main. Nota:
 * encontrarán en Moodle un ejemplo de una Colección como Atributo.
 *
 * @author Ulises
 */
public class Alumno {

    public static void main(String[] args) {
        
        Scanner leer =new Scanner (System.in);
        AlumnoServ n1 = new AlumnoServ();
        
        ArrayList<AlumnoEnt> listAlumno2= n1.pedirDatos();
        
        String opcion, nombre;
        boolean flag = true;

        do {
            
            System.out.print("Desea buscar algun alumno : ");
            opcion=leer.next();
            System.out.println("");
            
            if (opcion.equalsIgnoreCase("Si")) {
                
                System.out.print("Ingrese el nombre del alumno : ");
                nombre=leer.next();
                System.out.println("");
                
                for (int i = 0; i < listAlumno2.size(); i++) {
                    if (listAlumno2.get(i).getAlumno().equalsIgnoreCase(nombre)) {
                        System.out.println("La nota final del alumno "+nombre+" es "+n1.notaFinal(nombre) );
                    }
                }
                
            }else if (opcion.equalsIgnoreCase("No")) {
                System.out.println("Gracias por usar el programa...");
                flag=false;
            }else   {
                System.out.println("Ingreso mal la opcion.");
            }
            
            
        } while (flag);
        listAlumno2.forEach(System.out::println);
    }
}
