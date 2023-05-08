/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.BarajaCartasEnt;
import entidades.BarajaEnt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Ulises
 */
public class BarajaServ {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    BarajaEnt baraja = new BarajaEnt();
    ArrayList<BarajaCartasEnt> aux = new ArrayList();

    public void crearCarta() {
        ArrayList<BarajaCartasEnt> listaCarta = new ArrayList();
        
        for (int i = 1; i < 13; i++) {

            if (i == 8 || i == 9) {

            } else {
                BarajaCartasEnt espadas = new BarajaCartasEnt(i, " espada");
                BarajaCartasEnt bastos = new BarajaCartasEnt(i, " bastos");
                BarajaCartasEnt oros = new BarajaCartasEnt(i, " oros");
                BarajaCartasEnt copas = new BarajaCartasEnt(i, " copas");
                listaCarta.add(espadas);
                listaCarta.add(bastos);
                listaCarta.add(oros);
                listaCarta.add(copas);
            }

        }

        baraja.setListaCartas(listaCarta);
        aux.clear();
    }

    public void barajar() {

        Collections.shuffle(baraja.getListaCartas());

    }

    public void siguienteCarta() {

        boolean flag = false;
        for (int i = 0; i < baraja.getListaCartas().size(); i++) {

            if (baraja.getListaCartas().size() >= 1) {
                aux.add(baraja.getListaCartas().get(i));
                baraja.getListaCartas().remove(i);
                break;
            } else {
                flag = true;
            }

            if (flag) {
                System.out.println("No hay mas cartas.");
            }

        }

    }

    public void cartasDisponibles() {

        System.out.println(baraja.getListaCartas().size());

    }

    public void darCartas() {
        
        /*System.out.println("¿Cúantas cartas quiere?");
        int n = leer.nextInt();
        if (baraja.getBaraja().size() >= n) {
            for (int i = 0; i < n; i++) {
                monton.add(siguienteCarta());
                baraja.getBaraja().remove(0);//eliminas siempre la posicion 0
            }
        }
*/
        
        System.out.print("Ingrese la cantidad de cartas = ");
        int dar = leer.nextInt();

       if (baraja.getListaCartas().size() < dar) {
           System.out.println("No hay cartas");
            
        } else {
            for (int i = 0; i < dar; i++) {//Desde el índice 0 hasta dar-1 
                aux.add(baraja.getListaCartas().get(i));
                
            }
            for (int i = dar-1; i > -1; i--) {
                baraja.getListaCartas().remove(i);
                
            }
        }
//        Iterator<BarajaCartasEnt> it = baraja.getListaCartas().iterator();
//        int cont =0;
//        while(it.hasNext()){
//            System.out.println(cont);
//            
//            if (cont<dar) {
//                it.remove();
//            }
//            cont++;
//        }
//        
        
    }

    public void cartasMonton() {
        
        System.out.println(aux);
        System.out.println(aux.size());

    }

    public void mostrarBaraja() {

        System.out.println(baraja.getListaCartas());

    }

    public void menu() {
        boolean flag = true;
        crearCarta();
        System.out.println("------------INICIO EL JUEGO------------");
        do {
            System.out.println("---------------------------");
            System.out.println("opciones:\n"
                    + "1: Barajar\n"
                    + "2: Pedir una carta\n"
                    + "3: Cantidad de cartas disponibles\n"
                    + "4: Pedir cartas\n"
                    + "5: Mostrar cartas que ya salieron\n"
                    + "6: Mostrar cartas disponibles\n"
                    + "7: Reiniciar baraja\n"
                    + "8: Salir de la partida");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("---------------------------");
                    barajar();
                    break;
                case 2:
                    System.out.println("---------------------------");
                    siguienteCarta();
                    break;
                case 3:
                    System.out.println("---------------------------");
                    cartasDisponibles();
                    break;
                case 4:
                    System.out.println("---------------------------");
                    darCartas();
                    break;
                case 5:
                    System.out.println("---------------------------");
                    cartasMonton();
                    break;
                case 6:
                    System.out.println("---------------------------");
                    mostrarBaraja();
                    break;
                case 7:
                    System.out.println("---------------------------");
                    crearCarta();
                    break;
                case 8:
                    System.out.println("VOLVIENDO AL LOBBY...");
                    flag = false;

            }

        } while (flag);

    }
}
