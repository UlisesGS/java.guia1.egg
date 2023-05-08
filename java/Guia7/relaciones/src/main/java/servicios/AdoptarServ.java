/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.AdoptarPerrroEnt;
import entidades.AdoptarPersonaEnt;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a
 * contar de dos clases. Perro, que tendrá como atributos: nombre, raza, edad y
 * tamaño; y la clase Persona con atributos: nombre, apellido, edad, documento y
 * Perro. Ahora deberemos en el main crear dos Personas y dos Perros. Después,
 * vamos a tener que pensar la lógica necesaria para asignarle a cada Persona un
 * Perro y por ultimo, mostrar desde la clase Persona, la información del Perro
 * y de la Persona
 *
 * @author Ulises
 */
public class AdoptarServ {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    AdoptarPerrroEnt masc = new AdoptarPerrroEnt();
    ArrayList<AdoptarPerrroEnt> listaMascota = new ArrayList();
    ArrayList<AdoptarPersonaEnt> listaPers= new ArrayList();

    public void creacionMascota() {
        int cont = 0;
        do {
            
            System.out.println("Ingrese los siguientes datos de mascota: ");

            System.out.print("Nombre = ");
            masc.setNombrePerros(leer.next());
            System.out.println("");

            System.out.print("Raza = ");
            masc.setRazaPerros(leer.next());
            System.out.println("");

            System.out.print("Edad = ");
            masc.setEdadPerros(leer.nextInt());
            System.out.println("");

            System.out.print("Tamaño = ");
            masc.setTamañoPerros(leer.next());
            System.out.println("");

            listaMascota.add(new AdoptarPerrroEnt(masc.getNombrePerros(), masc.getRazaPerros(), masc.getEdadPerros(), masc.getTamañoPerros()));
            
            cont++;
            
        } while (cont<2);
        
        for (AdoptarPerrroEnt adoptarPerrroEnt : listaMascota) {
            System.out.println(adoptarPerrroEnt);
        }
    }
    
    public void creacionPersona(){
        boolean flag=true;
         int cont = 0;
        do {
            AdoptarPersonaEnt pers = new AdoptarPersonaEnt();
            System.out.println("Ingrese los siguientes datos de Persona: ");

            System.out.print("Nombre = ");
            pers.setNombrePersona(leer.next());
            System.out.println("");

            System.out.print("Apellido = ");
            pers.setApellidoPersona(leer.next());
            System.out.println("");

            System.out.print("Edad = ");
            pers.setEdadPersona(leer.nextInt());
            System.out.println("");

            System.out.print("Documento = ");
            pers.setDocumnetoPersona(leer.nextInt());
            System.out.println("");
            
            System.out.print("Ingrese el nombre de la mascota que desea adoptar = ");
            String nombre=leer.next();
            System.out.println("");
            
            for (int i = 0; i < 2; i++) {
                if (listaMascota.get(i).getNombrePerros().equalsIgnoreCase(nombre)) {
                    pers.setMascota(listaMascota.get(i));
                    flag=false;
                }
            }
            
            listaPers.add(pers);
            
            if (flag) {
                System.out.println("ERROR, la mascota ingresada no existe.");
            }else {
                System.out.println(listaPers);
            }
            
           // listaMascota.add(new AdoptarPerrroEnt(masc.getNombrePerros(), masc.getRazaPerros(), masc.getEdadPerros(), masc.getTamañoPerros()));
            
            cont++;
            
        } while (cont<2);
        
        
    }

}
