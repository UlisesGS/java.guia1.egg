package colecciones;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import servicios.RazaServ;


/*Punto 1 Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList

voy a usar este mismo para hacer el 2

Punto 2  Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
se mostrará la lista ordenada.
*/
public class Raza {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        RazaServ v = new RazaServ();
        boolean flag = false;
        String opcion = "", r="";
        List<String> listR = new ArrayList();
        
        do {

            System.out.println("Desea ingresar una raza?");
            opcion = leer.next();
            if (opcion.equalsIgnoreCase("Si")) {
                System.out.print("Ingrese la raza : ");
                 r = leer.next();
                listR.add(r);
                System.out.println("");
            } else if (opcion.equalsIgnoreCase("No")) {
                listR.forEach(System.out::println);
                flag = true;
            } else {
                System.out.println("Ingreso mal la opcion.");
            }
            
        } while (flag == false);
        
        
        
        do {
            
            System.out.print("desea eliminar una raza : ");
            opcion=leer.next();
            System.out.println("");
            
            if (opcion.equalsIgnoreCase("Si")) {
                System.out.println("Ingrese la raza");
                r=leer.next();
                
                for (int i = 0; i < listR.size(); i++) {
                    if (listR.get(i).equals(r)) {
                        listR.remove(i);
                    }
                }
            } else {
                System.out.println("nos vemos puto");
                flag=false;
                System.out.println("----------");
            }
            
        } while (flag==true);
        
        
        listR.forEach(System.out::println);
    }
}


