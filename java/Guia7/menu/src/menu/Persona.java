/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menu;

import Entidades.PersonaEnt;
import java.util.*;
import servicios.PersonaServ;


public class Persona {


    public static void main(String[] args) {
        PersonaServ caract=new PersonaServ();
        PersonaEnt persona[]=new PersonaEnt [2];
        int cont1=0, cont2=0, cont3=0;
        for (int i = 0; i < 2; i++) {
            persona[i]=caract.crearPersona();
        }
        caract.Mostrar(persona[0]);
        System.out.println("--------------------------");
        caract.Mostrar(persona[1]);
        
        System.out.println("--------------------------");
        
        for (int i = 0; i < 2; i++) {
            if (caract.calcularMC(persona[i])== -1) {
                cont1++;
            } else if (caract.calcularMC(persona[i])==0) {
                cont2++;
            }else if (caract.calcularMC(persona[i])==1) {
                cont3++;
            }
        }
        
        System.out.println("Las personas de bajo peso son "+cont1*100/2+" %");
        System.out.println("Las personas de normal peso son "+cont2*100/2+" %");
        System.out.println("Las personas de mas peso son "+cont3*100/2+" %");
    }
    
}
