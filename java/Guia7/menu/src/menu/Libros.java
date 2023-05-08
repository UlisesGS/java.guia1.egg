package menu;


import Entidades.LibrosPaginas;
import servicios.ServiciosLibros;

/**
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 * @author Ulises
 */
public class Libros {


    public static void main(String[] args) {
       ServiciosLibros libro = new ServiciosLibros();
       LibrosPaginas lp = libro.lpComprobacion();
       System.out.println(lp.toString());
    }
    
}
