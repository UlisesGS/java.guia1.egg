/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ulises
 */
public class VotarSimul {

    ArrayList<VotarAlumnoEnt> lista = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void nombreAleatorio() {

        boolean flag = true;

        String[] nombres = {"Matias", "Pedro", "Ezequiel", "Gustavo", "Diego", "Mateo", "Horacio", "Uriel", "Benjamin", "Julian"};
        String[] apellidos = {"Fernandez ", "Lopez", "Perez", "Romero", "Martinez", "Rodriguez"};

        int cant;
        System.out.println("Ingrese cantidad de alumnos a generar");
        cant = leer.nextInt();

        do {
            VotarAlumnoEnt valor = new VotarAlumnoEnt();

            Random random1 = new Random();
            Random random2 = new Random();
            //Random random3 = new Random();

            int posiN = random1.nextInt(6);
            int posiA = random2.nextInt(6);
            Integer numeroAleatorio;
            do {
                numeroAleatorio = 25000000 + (int) (Math.random() * 45000000 - 25000000);
                if (lista.contains(numeroAleatorio)) {
                    flag = false;
                } else {
                    flag = true;
                }
            } while (numeroAleatorio < 25000000 || numeroAleatorio > 45000000 && flag == false);

//            do {
//            } while (!lista.contains(DNI));
            String nombre1 = nombres[posiN];
            String apellido1 = apellidos[posiA];
            //DNI = dni[numeroAleatorio];

            valor.setNombre(nombre1);
            valor.setApellido(apellido1);
            valor.setDni(numeroAleatorio);
            valor.setCantidadV(0);

            lista.add(valor);
        } while (lista.size() < cant);
        System.out.println(lista);

    }

    public void votacion() {
        VotarVotoEnt alum = new VotarVotoEnt();
        
        HashSet<VotarVotoEnt> lista3 = new HashSet();
        int cont=0, cont2=1;
        
        boolean flag=true;

        Random random3 = new Random();
        Random random4 = new Random();
        ArrayList<VotarAlumnoEnt> lista1 = new ArrayList();
        
        int posiN=0;
        int posiA = random4.nextInt(3) + 1;
        
//        do {
//            
//            for (int i = 0; i < lista.size(); i++) {
//                HashSet<VotarVotoEnt> lista2 = new HashSet();
//                alum.setAlumno(lista.get(i));
//                
//                while(cont>lista.size()){
//                    cont = cont2 + (int) (Math.random() * lista.size() - cont2);
//                    cont2++;
//                    if (cont2==lista.size()) {
//                        cont=0;
//                    }
//                }
//                
//                if (flag) {
//                    
//                }
//                
//                
//                
//            }
//            
//        } while (flag);
        
        do {
            
            for (int i = 0; i < lista.size(); i++) {
                HashSet<VotarVotoEnt> lista2 = new HashSet();
                
                
                alum.setAlumno(lista.get(i));
                System.out.println(i);
                
                if (cont<3) {
                    for (int j = 0; j < 3; j++) {

                    posiN = random3.nextInt(lista.size());


                    if (lista1.contains(lista.get(posiN))) {
                        j--;
                        if (j==0) {
                            j=0;
                        }
                    }else{
                        cont++;
                        lista.get(posiN).setCantidadV(lista.get(posiN).getCantidadV()+1);
                        lista1.add(lista.get(posiN));
                        
                    }
                    alum.setListaAlumnos(lista1);
                    

                    
                    

                }
                    
                }
                cont=0;
                lista2.add(alum);
                System.out.println("---------------------------------"
                        + "\n");
                System.out.println(lista2);
                System.out.println("---------------------------------"
                        + "\n");
                lista1.clear();
            }
            
            
            flag=false;

        } while (flag);

    }

}
