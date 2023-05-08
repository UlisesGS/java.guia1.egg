package servicios;

import Entidades.JuegoEnt;
import java.util.Scanner;


public class JuegoServ {
    
    JuegoEnt a1 = new JuegoEnt();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public String crearJuego() {
        String palabraIngresada;
        System.out.println("Ingrese una palabra");
        palabraIngresada = leer.next();
        String[] aux = new String[palabraIngresada.length()];

        String[] palabraDividida = new String[palabraIngresada.length()];

        System.out.println("Ingrese la cantidad máxima de jugadas");
        a1.setMaximoDeJugadas(leer.nextInt());

        for (int i = 0; i < palabraIngresada.length(); i++) {
            palabraDividida[i] = palabraIngresada.substring(i, i + 1);
            a1.setPalabraBuscada(palabraDividida);
            aux[i] = "-";
            a1.setLineas(aux);
        }
        System.out.println(" ");
        return palabraIngresada;
    }

    public void longitud() {
        int longitud = a1.getPalabraBuscada().length;
        System.out.println("Su palabra tiene " + longitud + " letras");
    }

    public String letraIngresada() {
        String letraBuscada = "";
        for (int i = 0; i < a1.getPalabraBuscada().length; i++) {
            System.out.print(a1.getLineas()[i]);
        }
        System.out.println(" ");
        boolean flag = true;
        while (flag) {
            System.out.println("Ingrese una letra");
            letraBuscada = leer.next();
            if (a1.getAbecedario().contains(letraBuscada)) {
                a1.setAbecedario(a1.getAbecedario().replace(letraBuscada, ""));
                flag = false;
            } else {
                System.out.println("La letra que ingresó ya ha sido ingresada.");
            }
            
        }

        System.out.println(a1.getAbecedario().toUpperCase());
        return letraBuscada;
    }

    public boolean buscar(String letraBuscada) {
        String[] letra1 = new String[a1.getPalabraBuscada().length];
        String[] letra2 = new String[a1.getPalabraBuscada().length];
        for (int i = 0; i < a1.getPalabraBuscada().length; i++) {
            letra1[i] = a1.getLineas()[i];
            letra2[i] = a1.getLineas()[i];
        }
        boolean verificar = false;
        System.out.println(letraBuscada);
        
        /*REVISAR ESTA PARTE DEL CODIGO*/
        
        for (int i = 0; i < a1.getPalabraBuscada().length; i++) {
            if (a1.getPalabraBuscada()[i].contains(letraBuscada)) {
                letra1[i] = letra2[i].replace(letra2[i], letraBuscada);
                //Arrays.fill(letra1,i, a1.getPalabraBuscada().length, letraBuscada);
                a1.setLineas(letra1);
                verificar = true;
            }
        }
        if (verificar == true) { 
            System.out.println("Ha acertado!");
            a1.setLetrasEncontradas(a1.getLetrasEncontradas() + 1);
        } else {
            System.out.println("Lo siento. No se encontró la letra");
            a1.setMaximoDeJugadas(a1.getMaximoDeJugadas() - 1);
            mostrarIntentos();
        }
        return verificar;
    }

    public boolean encontradas(String letraBuscada) {
        boolean seEncontraron = false;
        int cont = 0;
        for (int i = 0; i < a1.getPalabraBuscada().length; i++) {
            if (letraBuscada.equalsIgnoreCase(a1.getPalabraBuscada()[i])) {
                cont++;
                seEncontraron = true;
            }
        }
        System.out.println("");
        if (cont > 0) {
            System.out.println("Se encontró " + cont + " letra/s");
        }
        System.out.println("Le falta por encontrar " + (a1.getPalabraBuscada().length - a1.getLetrasEncontradas()) + " letras");
        buscar(letraBuscada);
        return seEncontraron;
    }

    public void mostrarIntentos() {
        System.out.println("A usted le queda " + a1.getMaximoDeJugadas() + " intento/s restante/s");
        System.out.println("----------------------");
        System.out.println("");
    }

    public void juego() {
        crearJuego();
        boolean flag = false;
        do {
            encontradas(letraIngresada());
            if (a1.getMaximoDeJugadas() == 0 || a1.getLetrasEncontradas() == a1.getPalabraBuscada().length) {
                flag = true;
            }
        } while (flag == false);

        if (a1.getLetrasEncontradas() == a1.getPalabraBuscada().length) {
            System.out.println("Felicitaciones! Ha ganado");
            for (int i = 0; i < a1.getPalabraBuscada().length; i++) {
                System.out.print(a1.getLineas()[i]);
            }
            System.out.println("");
        } else {
            System.out.println("Lo sentimos. Ha perdido");
        }
    }
}

