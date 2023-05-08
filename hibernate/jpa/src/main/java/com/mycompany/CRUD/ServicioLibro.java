/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.CRUD;


import com.mycompany.entidades.Autor;
import com.mycompany.entidades.Editorial;
import com.mycompany.entidades.Libro;
import java.util.Collection;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Ulises
 */
public class ServicioLibro {
    
    
       EntityManager em = Persistence.createEntityManagerFactory("com.mycompany.persistencia").createEntityManager();

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearLibro() {

        try {

            Libro libro = new Libro();

//            autor.setId(Integer.SIZE);
            System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
            System.out.print("Ingrese el nombre = ");
            libro.setTitulo(leer.next());
            System.out.print("Ingrese el año = ");
            libro.setAno(leer.nextInt());
            System.out.print("Ingrese la cantidad de ejemplares = ");
            libro.setEjemplares(leer.nextInt());
            System.out.print("Ingrese la cantidad de ejemplares prestados = ");
            libro.setEjemplaresPrestados(leer.nextInt());
            System.out.print("Ingrese la cantidad de ejemplares restantes = ");
            libro.setEjemplaresRestantes(leer.nextInt());
            
            
            ServicioAutor servicioA = new ServicioAutor();
            Autor autor = new Autor();
            System.out.print("Ingresar el ID del autor = ");
            autor.setId(leer.nextInt());
            libro.setAutor(servicioA.buscarAutorId(autor.getId()));
            
            
            ServicioEditorial servicioE = new ServicioEditorial();
            Editorial editorial = new Editorial();
            System.out.print("Ingresar el ID de la editorial = ");
            editorial.setId(leer.nextInt());
            System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
            libro.setEditorial(servicioE.buscarEditorialId(editorial.getId()));
            
            em.getTransaction().begin();
            em.persist(libro);
            em.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("ERROR ingresar");
        }

    }
    
    
    public void modificarLibro(Long isbn) {

        try {

            Libro libroM = new Libro();

            libroM = buscarLibroIsbn(isbn);
            
            
            System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
            System.out.println(" -------- INGRESAR NUEVOS DATOS --------");
            System.out.print("Ingrese el nombre = ");
            libroM.setTitulo(leer.next());
            System.out.print("Ingrese el año = ");
            libroM.setAno(leer.nextInt());
            System.out.print("Ingrese la cantidad de ejemplares = ");
            libroM.setEjemplares(leer.nextInt());
            System.out.print("Ingrese la cantidad de ejemplares prestados = ");
            libroM.setEjemplaresPrestados(leer.nextInt());
            System.out.print("Ingrese la cantidad de ejemplares restantes = ");
            libroM.setEjemplaresRestantes(leer.nextInt());
            
            
            
            ServicioAutor servicioA = new ServicioAutor();
            Autor autor = new Autor();
            System.out.print("Ingrese el ID del autor = ");
            autor.setId(leer.nextInt());
            libroM.setAutor(servicioA.buscarAutorId(autor.getId()));
            
            
            ServicioEditorial servicioE = new ServicioEditorial();
            Editorial editorial = new Editorial();
            System.out.print("Ingrese el ID de la editorial = ");
            editorial.setId(leer.nextInt());
            System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
            libroM.setEditorial(servicioE.buscarEditorialId(editorial.getId()));
            
            
            em.getTransaction().begin();
            em.merge(libroM);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            System.out.println("Error modificar");
        }

    }
    
    
    //PROCESO
    public Libro buscarLibroIsbn(Long libro) {
        
        try {
            
            Libro libro1 = em.find(Libro.class, libro);
            boolean hola = libro1.isAlto();
            System.out.println(libro1.getIsbn() + " / " + libro1.getTitulo() + " / " + libro1.getAno()+ " / " + libro1.getEjemplares() + " / " + libro1.getEjemplaresPrestados()+ " / " + libro1.getEjemplaresRestantes() + " / " + hola+ " / " + libro1.getAutor() + " / " + libro1.getEditorial());
            return libro1;
            
        } catch (Exception e) {
            System.out.println("ERROR buscar");
            return null;
        }
        
    }
    
    
    public void buscarLibroTitulo(String titulo){
        
        try {
            Libro libro1 = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.titulo = :titulo").
                                                                            setParameter("titulo", titulo).
                                                                            getSingleResult();
            boolean hola = libro1.isAlto();
            System.out.println(libro1.getIsbn() + " / " + libro1.getTitulo() + " / " + libro1.getAno()+ " / " + libro1.getEjemplares() + " / " + libro1.getEjemplaresPrestados()+ " / " + libro1.getEjemplaresRestantes() + " / " + hola+ " / " + libro1.getAutor() + " / " + libro1.getEditorial());
        
        } catch (Exception e) {
            System.out.println("ERROR buscar titulo");
        }
       
    }
    // HASTA ACA
    
    
    public void buscarLibroAutor(String nombre){
        
        try {
            Libro libro1 = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.autor.nombre = :nombre").
                                                                            setParameter("nombre", nombre).
                                                                            getSingleResult();
            boolean hola = libro1.isAlto();
            System.out.println(libro1.getIsbn() + " / " + libro1.getTitulo() + " / " + libro1.getAno()+ " / " + libro1.getEjemplares() + " / " + libro1.getEjemplaresPrestados()+ " / " + libro1.getEjemplaresRestantes() + " / " + hola+ " / " + libro1.getAutor() + " / " + libro1.getEditorial());
        
        } catch (Exception e) {
            System.out.println("ERROR buscar titulo");
        }
       
    }
    
    
    public void buscarLibroEditorial(String nombre){
        
        try {
            Libro libro1 = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.editorial.nombre = :nombre").
                                                                            setParameter("nombre", nombre).
                                                                            getSingleResult();
            boolean hola = libro1.isAlto();
            System.out.println(libro1.getIsbn() + " / " + libro1.getTitulo() + " / " + libro1.getAno()+ " / " + libro1.getEjemplares() + " / " + libro1.getEjemplaresPrestados()+ " / " + libro1.getEjemplaresRestantes() + " / " + hola+ " / " + libro1.getAutor() + " / " + libro1.getEditorial());
        
        } catch (Exception e) {
            System.out.println("ERROR buscar titulo");
        }
       
    }
    
    
    public void eliminarLibro(Long libro){
    
        try {
            Libro libroE = new Libro();
            
            libroE=buscarLibroIsbn(libro);

            em.getTransaction().begin();
            em.remove(libroE);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            System.out.println("ERROR eliminar");
        }
    
    }
    
    
    public void listarLibro(){
        
        Collection<Libro>libro = em.createQuery("SELECT l FROM Libro l").getResultList();
        
        for (Libro li : libro) {
            System.out.println(li.getIsbn());
            System.out.println(li.getTitulo());
            System.out.println(li.getAno());
            System.out.println(li.getEjemplares());
            System.out.println(li.getEjemplaresPrestados());
            System.out.println(li.getEjemplaresRestantes());
            boolean hola = li.isAlto();
            System.out.println(hola);
            System.out.println(li.getAutor().getNombre());
            System.out.println(li.getEditorial().getNombre());
            System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        }
    }
    
 }

