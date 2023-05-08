/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.CRUD;



import com.mycompany.entidades.Editorial;
import java.util.Collection;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Ulises
 */
public class ServicioEditorial {
    
       EntityManager em = Persistence.createEntityManagerFactory("com.mycompany.persistencia").createEntityManager();

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearEditorial() {

        try {

            Editorial editorial = new Editorial();

//            autor.setId(Integer.SIZE);++
            System.out.print("Ingrese el nombre = ");
            editorial.setNombre(leer.next());
            editorial.setAlta(true);
            
            
            if (editorial.getNombre()==null || editorial.getNombre().trim().isEmpty() ) {
               throw new Exception("Tiene que ingresar un autor.");
            }
            
            if (buscarComprobacion(editorial.getNombre())) {
                throw new Exception("Ya existe este autor.");
            }
            
            
            em.getTransaction().begin();
            em.persist(editorial);
            em.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("ERROR ingresar");
        }

    }
    
    
    public boolean buscarComprobacion(String nombre){
    
        Collection<String> editorial = em.createQuery("SELECT e.nombre FROM Editorial e").getResultList();
        
        for (Object e : editorial) {
            if (nombre.equals(e)) {
                return true;
            }
        }
        
        return false;
        
    }
    
    
    public void modificarEditorial(Integer editorial) {

        try {

            Editorial editorialM = new Editorial();

            editorialM = buscarEditorialId(editorial);
            
            System.out.print("ingrese el nuevo nombre = ");
            editorialM.setNombre(leer.next());
            
            em.getTransaction().begin();
            em.merge(editorialM);
            System.out.println(editorialM.getId() + " / " + editorialM.getNombre() + " / " + editorialM.isAlta());
            em.getTransaction().commit();
            
        } catch (Exception e) {
            System.out.println("Error modificar");
        }

    }

    public Editorial buscarEditorialId(Integer editorial) {

        Editorial editorial1 = em.find(Editorial.class, editorial);
        System.out.println(editorial1.getId() + " / " + editorial1.getNombre() + " / " + editorial1.isAlta());
        return editorial1;
    }
    
    
    public Editorial buscarEditorialNombre(String nombre) {

        Editorial editorial1 = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.nombre = :nombre").
                setParameter("nombre", nombre).
                getSingleResult();
        System.out.println(editorial1.getId() + " / " + editorial1.getNombre() + " / " + editorial1.isAlta());
        return editorial1;
    }
    
    
    public Editorial buscarEditorialNombre1(String nombre){
    
        Editorial editorial1 = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.nombre = :nombre").
                                                                                    setParameter("nombre", nombre).
                                                                                    getSingleResult();
        System.out.println(editorial1.getId() + " / " + editorial1.getNombre() + " / " + editorial1.isAlta());
        
        return editorial1;
    }
    
    
    public void eliminarEditorial(Integer id){
    
        try {
            Editorial editorialE = new Editorial();
            
            editorialE=buscarEditorialId(id);

            em.getTransaction().begin();
            em.remove(editorialE);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            System.out.println("ERROR eliminar");
        }
    
    }
    
    public void listarEditorial(){
        
        Collection<Editorial>editoriales = em.createQuery("SELECT e FROM Editorial e").getResultList();
        
        for (Editorial edi : editoriales) {
            System.out.println(edi.getId());
            System.out.println(edi.isAlta());
            System.out.println(edi.getNombre());
            System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        }
    }
    
    
}
