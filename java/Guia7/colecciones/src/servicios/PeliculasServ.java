/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;


import comparator.PeliculasComp;
import entidades.PeliculasEnt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
 * Para esto, tendremos una clase Pelicula con el título, director y duración de
 * la película (en horas). Implemente las clases y métodos necesarios para esta
 * situación, teniendo en cuenta lo que se pide a continuación: En el servicio
 * deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
 * todos sus datos y guardándolos en el objeto Pelicula. Después, esa Pelicula
 * se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear
 * otra Pelicula o no. Después de ese bucle realizaremos las siguientes
 * acciones: 22 • Mostrar en pantalla todas las películas. • Mostrar en pantalla
 * todas las películas con una duración mayor a 1 hora. • Ordenar las películas
 * de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla. •
 * Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
 * en pantalla. • Ordenar las películas por título, alfabéticamente y mostrarlo
 * en pantalla. • Ordenar las películas por director, alfabéticamente y
 * mostrarlo en pantalla.
 *
 * @author Ulises
 */
public class PeliculasServ {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<PeliculasEnt> listaPeliculas = new ArrayList();
    PeliculasEnt valor = new PeliculasEnt();

    public void crearPelicula() {
        String opcion;
        boolean flag = true;

        do {

            System.out.println("Ingresar datos de la pelicula: ");

            System.out.print("Titulo : ");
            valor.setTitulo(leer.next());
            System.out.println("");

            System.out.print("Director : ");
            valor.setDirector(leer.next());
            System.out.println("");

            System.out.print("Duracion en hs : ");
            valor.setHora(leer.nextInt());
            System.out.println("");

            while (valor.getHora() < 0 || valor.getHora() > 23) {
                System.out.println("Ingreso mal el horario, vuelva a intentarlo");
                System.out.print("Duracion en hs : ");
                valor.setHora(leer.nextInt());
                System.out.println("");
            }
            
            System.out.println("-------------------------------------------");
            guardarDatos();
            
            System.out.print("¿Desea ingresar otra pelicula? Si/No : ");
            opcion=leer.next();
            System.out.println("");
            
            if (opcion.equalsIgnoreCase("No")) {
                flag=false;
            }else if (opcion.equalsIgnoreCase("Si")) {
                System.out.println("Reiniciando programa...");
                System.out.println("-------------------------------------------");
            }else   {
                System.out.println("ERROR, ingreso mal algun dato");
            }
            
        } while (flag);
       
    }

    public ArrayList<PeliculasEnt> guardarDatos() {

        listaPeliculas.add(new PeliculasEnt(valor.getTitulo(), valor.getDirector(), valor.getHora()));

        return listaPeliculas;
    }
    
    public void mostrarDatos(){
        System.out.println("Todas las peliculas ingresadas: ");
        listaPeliculas.forEach(System.out::println);
        
        System.out.println("-------------------------------------------");
        
        System.out.println("Peliculas con una duracion mayor a 1 hora: ");
        for (int i = 0; i < listaPeliculas.size(); i++) {
            if (listaPeliculas.get(i).getHora()>1) {
                System.out.println(listaPeliculas.get(i));
            }
        }
        
        System.out.println("-------------------------------------------");
        
        System.out.println("Peliculas de mayor a menor duracion: ");
        
        Collections.sort(listaPeliculas, PeliculasComp.peliculasMayor);
        
        for (PeliculasEnt listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula);
        }
        
        System.out.println("-------------------------------------------");
        
        System.out.println("Peliculas de menor a mayor duracion: ");
        
        Collections.sort(listaPeliculas, PeliculasComp.peliculasMenor);
        
        for (PeliculasEnt listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula);
        }
        
        System.out.println("-------------------------------------------");
        
        System.out.println("Peliculas de titulo: ");
        
        Collections.sort(listaPeliculas, PeliculasComp.tituloAlfabe);
        
        for (PeliculasEnt listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula);
        }
        
        System.out.println("-------------------------------------------");
        
        System.out.println("Peliculas de director: ");
        
        Collections.sort(listaPeliculas, PeliculasComp.directorAlfabe);
        
        for (PeliculasEnt listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula);
        }
    }
}
