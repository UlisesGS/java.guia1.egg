package menu;

import Entidades.CadenaEnt;
import java.util.Scanner;
import servicios.CadenaServ;

/*Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.*/
public class Cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadenaServ fin= new CadenaServ();
        CadenaEnt fras=fin.ingresarFrase();
        Scanner leer=new Scanner(System.in);
        boolean flag=true;
        int opcion;
        while(flag){
        
            System.out.println("-----------------");
            System.out.println("ingrese su opcion \n"
                    + "1. Mostrar vocales\n"
                    + "2. Invertir frase\n"
                    + "3. Veces repetida letra\n"
                    + "4. Comparar longitud\n"
                    + "5. Unir frases\n"
                    + "6. Reemplazar\n"
                    + "7. Contiene\n"
                    + "8. Salir\n");
            System.out.println("-----------------");
            opcion = leer.nextInt();
            System.out.println("-----------------");
            
            switch (opcion) {
                case 1:
                    fin.mostrarVocales(fras);
                    break;
                case 2:
                    fin.invertirFrase(fras);
                    break;
                case 3:
                    fin.vecesRepetido(fras);
                    break;
                case 4:
                    fin.compararLong(fras);
                    break;
                case 5:
                    fin.unirFrases(fras);
                    break;
                case 6:
                    fin.reemplazar(fras);
                    break;
                case 7:
                    fin.contiene(fras);
                    break;
                case 8:
                    System.out.println("Gracias por usar el programa...");
                    flag=false;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }
    }
    
}
