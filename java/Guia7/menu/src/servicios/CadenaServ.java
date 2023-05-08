package servicios;

import Entidades.CadenaEnt;
import java.util.Scanner;

/**
 * Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo
 * de String) y su longitud. En el main se creará el objeto y se le pedirá al
 * usuario que ingrese una frase que puede ser una palabra o varias palabras
 * separadas por un espacio en blanco y a través de los métodos set, se guardará
 * la frase y la longitud de manera automática según la longitud de la frase
 * ingresada. Deberá además implementar los siguientes métodos: a) Método
 * mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
 * frase ingresada. b) Método invertirFrase(), deberá invertir la frase
 * ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca",
 * Salida: "acnalb asac". c) Método vecesRepetido(String letra), recibirá un
 * carácter ingresado por el usuario y contabilizar cuántas veces se repite el
 * carácter en la frase, por ejemplo: d) Entrada: frase = "casa blanca". Salida:
 * El carácter 'a' se repite 4 veces. e) Método compararLongitud(String frase),
 * deberá comparar la longitud de la frase que compone la clase con otra nueva
 * frase ingresada por el usuario. f) Método unirFrases(String frase), deberá
 * unir la frase contenida en la clase Cadena con una nueva frase ingresada por
 * el usuario y mostrar la frase resultante. g) Método reemplazar(String letra),
 * deberá reemplazar todas las letras “a” que se encuentren en la frase, por
 * algún otro carácter seleccionado por el usuario y mostrar la frase
 * resultante. h) Método contiene(String letra), deberá comprobar si la frase
 * contiene una letra que ingresa el usuario y devuelve verdadero si la contiene
 * y falso si no.
 *
 * @author Ulises
 */
public class CadenaServ {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public CadenaEnt ingresarFrase() {
        CadenaEnt valor = new CadenaEnt();

        System.out.println("Ingrese la frase:");
        valor.setFrase(leer.next());
        valor.setLargo(valor.getFrase().length());

        return valor;
    }

    /*a) Método mostrarVocales(), deberá contabilizar la cantidad de voca
    les que tiene la frase
ingresada.*/
    public void mostrarVocales(CadenaEnt valor) {
        int conta = 0, conte = 0, conti = 0, conto = 0, contu = 0;

        for (int i = 0; i < valor.getLargo(); i++) {
            if (valor.getFrase().substring(i, i + 1).equalsIgnoreCase("A")) {
                conta++;
            } else if (valor.getFrase().substring(i, i + 1).equalsIgnoreCase("E")) {
                conte++;
            } else if (valor.getFrase().substring(i, i + 1).equalsIgnoreCase("I")) {
                conti++;
            } else if (valor.getFrase().substring(i, i + 1).equalsIgnoreCase("O")) {
                conto++;
            } else if (valor.getFrase().substring(i, i + 1).equalsIgnoreCase("U")) {
                contu++;
            }
        }

        System.out.println("Vocales veces encontradas :");
        System.out.println("A = " + conta + " -- E = " + conte + " -- I = " + conti + " -- O = " + conto + " -- U = " + contu);
        System.out.println("----------------------------");
        // contains()
    }

    /*b) Método invertirFrase(), deberá invertir la frase ingresada y
    mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".*/
    public void invertirFrase(CadenaEnt valor) {
        String cadenaInvertida = "";

        for (int i = valor.getFrase().length() - 1; i >= 0; i--) {
            cadenaInvertida += valor.getFrase().charAt(i);
        }
        System.out.println("Cadena invertida: " + cadenaInvertida);
        System.out.println("----------------------------");

    }

    /*c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.*/
    public void vecesRepetido(CadenaEnt valor) {

        System.out.print("Ingrese la letra a buscar: ");
        int cont = 0;
        String letra = leer.next();
        for (int i = 0; i < valor.getLargo(); i++) {
            if (valor.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {
                cont++;
            }
        }
        System.out.println("La letra " + letra + " se repite " + cont + " veces.");
        System.out.println("----------------------------");

    }

    /*e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.*/
    public void compararLong(CadenaEnt valor) {

        System.out.print("Ingrese la nueva frase a comparar: ");
        String frase1 = leer.next();
        int long1 = frase1.length();

        if (valor.getLargo() == long1) {
            System.out.println("Las 2 frases tienen la misma longitud.");
        } else if (valor.getLargo() < long1) {
            System.out.println("La longitud de la nueva frase es mayor.");
        } else {
            System.out.println("La longitud de la nueva frase es menor.");
        }
        System.out.println("----------------------------");

    }

    /*f) Método unirFrases(String frase), deberá unir la frase contenida 
    en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.*/
    public void unirFrases(CadenaEnt valor) {

        System.out.print("Ingrese la nueva frase: ");
        String frase2 = leer.next();
        System.out.println(valor.getFrase() + " " + frase2);
        System.out.println("----------------------------");
    }

    /*g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.*/
    public void reemplazar(CadenaEnt valor) {

        System.out.print("Ingrese una letra para reemplazar la a: ");
        String letra1 = leer.next();
        String frase3 = valor.getFrase(), frase4 = valor.getFrase();
        boolean flag = true;

        while (flag) {

            if (valor.getFrase().contains("a")) {
                if (letra1.length() != 1) {
                    System.out.print("Ingreso mal algun dato, ingrese de nuevo la letra : ");
                    letra1 = leer.next();

                } else {
                    frase4 = frase3.replace("a", letra1);
                    System.out.println(frase4);
                    flag = false;
                }
            } else {
                System.out.println("La frase original no contiene una a.");
                flag = false;
            }
        }
        System.out.println("\n----------------------------");
    }

    /*Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.*/
    public void contiene(CadenaEnt valor) {
        System.out.print("Ingrese una letra para ver si se encuentra en la frase: ");
        String letra2 = leer.next();
        boolean flag = true;
        boolean compr = true;

        while (flag) {

            if (letra2.length() != 1) {
                System.out.print("Ingreso mal algun dato, ingrese de nuevo la letra : ");
                letra2 = leer.next();

            } else if (valor.getFrase().contains(letra2)) {
                System.out.println(compr);
            } else {
                System.out.println(compr = false);
            }
            flag = false;
        }

        System.out.println("\n----------------------------");
    }
}
