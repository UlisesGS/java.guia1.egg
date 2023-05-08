/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.CRUD;

import com.mycompany.ecxeption.MiException;
import com.mycompany.entidades.Autor;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Ulises
 */
public class ServicioAutor {

    EntityManager em = Persistence.createEntityManagerFactory("com.mycompany.persistencia").createEntityManager();

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    
    public void crearAutor() throws Exception   {

        try {
            Autor autor = new Autor();

            System.out.print("Ingrese el nombre = ");
            autor.setNombre(leer.next());
            autor.setAlta(true);

            if (autor.getNombre()==null || autor.getNombre().trim().isEmpty() ) {
               throw new Exception("Tiene que ingresar un autor.");
            }
            
            if (buscarComprobacion(autor.getNombre())) {
                throw new Exception("Ya existe este autor.");
            }

            em.getTransaction().begin();
            em.persist(autor);
            em.getTransaction().commit();

        } catch (Exception e) {
            throw e;
        }

    }

    
    public void modificarAutor(Integer id) {

        try {

            Autor autorM = new Autor();

            autorM = buscarAutorId(id);
            
            System.out.print("ingrese el nuevo nombre = ");
            autorM.setNombre(leer.next());
            
            if (autorM.getNombre()==null || autorM.getNombre().trim().isEmpty() ) {
               throw new Exception("Tiene que ingresar un autor.");
            }
            
            if (buscarComprobacion(autorM.getNombre())) {
                throw new Exception("Ya existe este autor.");
            }
            
            em.getTransaction().begin();
            em.merge(autorM);
       //     System.out.println(autorM.getId() + " / " + autorM.getNombre() + " / " + autorM.isAlta());
            em.getTransaction().commit();
            
        } catch (Exception e) {
            System.out.println("Error modificar");
        }

    }

    
    public Autor buscarAutorId(Integer id) {
        

        Autor autor1 = em.find(Autor.class, id);

        
        System.out.println(autor1.getId() + " / " + autor1.getNombre() + " / " + autor1.isAlta());
        
        return autor1;
    }
    
    
    public boolean buscarComprobacion(String nombre) {
        
        
        Collection<String> autor = em.createQuery("SELECT a.nombre FROM Autor a").getResultList();
        
        for (Object a : autor) {
            if (nombre.equals(a)) {
                return true;
            }
        }
        
        return false;
        
        
        
//        Autor autor1 = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre = :nombre").
//                                                                            setParameter("nombre", nombre).
//                                                                            getSingleResult();
//        System.out.println(autor1.getId() + " / " + autor1.getNombre() + " / " + autor1.isAlta());
     

    }
    
    
    public void eliminarAutor(Integer id){
    
        try {
            Autor autorE = new Autor();
            
            autorE=buscarAutorId(id);
            em.getTransaction().begin();
            em.remove(autorE);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            System.out.println("ERROR eliminar");
        }
    
    }
    
    
    public void listarAutor(){
        
        Collection<Autor>autores = em.createQuery("SELECT a FROM Autor a").getResultList();
        
        for (Autor autore : autores) {
            System.out.println(autore.getId());
            System.out.println(autore.isAlta());
            System.out.println(autore.getNombre());
            System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        }
    }
}
