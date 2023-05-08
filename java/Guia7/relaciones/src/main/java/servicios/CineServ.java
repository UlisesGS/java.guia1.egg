/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.CineAsientosEnt;
import entidades.CineEnt;
import entidades.CineEspectadorEnt;
import entidades.CinePeliculaEnt;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ulises
 */
public class CineServ {

    CineEnt valor = new CineEnt();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<CinePeliculaEnt> listaPeli = new ArrayList();
    CineEspectadorEnt espe = new CineEspectadorEnt();
    CineAsientosEnt lugar = new CineAsientosEnt();

    public void menu() {
        System.out.println("----------------------------INICIAR CINE----------------------------");
        creacionPelicula();
        System.out.println("1. Registrarse\n"
                + "2. Reiniciar programa");

        System.out.print("Ingresar opcion: ");
        int opcion = leer.nextInt();

        switch (opcion) {

            case 1:
                creacionButacas();
                creacionEspec();
            case 2:
                creacionPelicula();

        }
    }

    public boolean creacionPelicula() {

        CinePeliculaEnt pelicula1 = new CinePeliculaEnt("la Troya", 260, 18, "tu vieja");
        CinePeliculaEnt pelicula2 = new CinePeliculaEnt("batman", 240, 16, "lean viejo");
        CinePeliculaEnt pelicula3 = new CinePeliculaEnt("nose ", 200, 10, "jota larga");
        CinePeliculaEnt pelicula4 = new CinePeliculaEnt("boca", 256, 16, "El jr");

        System.out.println("Elegir peligula: ");

        System.out.println("1. " + pelicula1);
        System.out.println("2. " + pelicula2);
        System.out.println("3. " + pelicula3);
        System.out.println("4. " + pelicula4);
        System.out.println("5. Ninguna\n"
                + "--------");
        System.out.print("Ingrese la opcion en numero: ");

        int opcion = leer.nextInt();
        boolean flag = false;

        switch (opcion) {

            case 1:
                listaPeli.add(pelicula1);
                break;
            case 2:
                listaPeli.add(pelicula2);
                break;
            case 3:
                listaPeli.add(pelicula3);
                break;
            case 4:
                listaPeli.add(pelicula4);
                break;
            case 5:
                flag = true;
        }
        valor.setListPeliculas(listaPeli);
        System.out.println("---------------------------------------------");
        System.out.println("Opcion ingresada correctamente");
        System.out.println("---------------------------------------------");
        return flag;
    }

    public void creacionEspec() {
        boolean flag = true;
        do {
            System.out.println("Quiere iniciar su registro? S/N");
            String opcion = leer.next();

            if (opcion.equalsIgnoreCase("s")) {
                System.out.print("Nombre: ");
                espe.setNombre(leer.next());
                System.out.println("Edad: ");
                espe.setEdad(leer.nextInt());
                System.out.println("Plata: ");
                espe.setPlata(leer.nextDouble());
                //llamar metodo comprobacion de datos
                if (comprobacionEspe()) {
                    seleccionButaca();
                } else {
                    System.out.println("");
                    break;
                }
            } else if (opcion.equalsIgnoreCase("n")) {
                flag = false;
            } else {
                System.out.println("ERROR, opcion mal ingresada");
            }

        } while (flag);

    }

    public boolean comprobacionEspe() {
        boolean flag = false;
        if (espe.getEdad() < valor.getListPeliculas().get(0).getMinEdad()) {
            System.out.println("Error, no tiene la edad requerida");
        } else if (espe.getPlata() < valor.getPrecio()) {
            System.out.println("Error, no tiene la plata suficiente");
        } else {
            System.out.println("Se registro CORRECTAMENTE");
            flag = true;
        }

        return flag;
    }

    public void creacionButacas() {

        CineAsientosEnt matriz[][] = new CineAsientosEnt[8][6];
        System.out.println(valor.getButacas().length);
        int num = valor.getButacas().length;
        for (int i = 0; i < valor.getButacas().length; i++) {
            for (int j = 0; j < valor.getButacas()[0].length; j++) {

                matriz[i][j] = new CineAsientosEnt((char) ('A' + j), num, false);

            }

            num--;
        }

        for (int i = 0; i < valor.getButacas().length; i++) {
            for (int j = 0; j < valor.getButacas()[0].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }

        valor.setButacas(matriz);

    }

    public void seleccionButaca() {

        System.out.println("---------------------------------------------");
        boolean flag = true;
        int colum = 0, numero=0;
        ArrayList<Integer> listaPosi = new ArrayList();
        CineAsientosEnt matriz1[][] = valor.getButacas();
        
        while (flag == true) {
            System.out.print("Ingrese la letra de la columna: ");
            String col = leer.next();
            col = col.toUpperCase();

            switch (col) {
                case "A":
                    colum = 0;
                    break;
                case "B":
                    colum = 1;
                    break;
                case "C":
                    colum = 2;
                    break;
                case "D":
                    colum = 3;
                    break;
                case "E":
                    colum = 4;
                    break;
                case "F":
                    colum = 5;
                    break;

            }

            System.out.println("Ingrese el nuemero de la fila: ");
             numero = leer.nextInt();

            
            int num = valor.getButacas().length;
            
            

            for (int i = 0; i < valor.getButacas().length; i++) {
                for (int j = 0; j < valor.getButacas()[0].length; j++) {
                    if (num==numero && j==colum && matriz1[i][j].isOcupado()==false) {
                        matriz1[i][j] = new CineAsientosEnt((char) ('A' + j), num, true);
                        //listaPosi.add(colum + numero);
                        flag = false;
                       
                    }
                }

                num--;
            }

            System.out.println("---------------------------------------------");

//            if (flag ==false) {
//                listaPosi.add(colum + numero);
              if(flag==true)  {
                System.out.println("La butaca seleccionada esta ocupada");
            }
        } 

//ACORDATE DE USAR ESTO PARA EL OCUPADO

        for (int i = 0; i < valor.getButacas().length; i++) {
            for (int j = 0; j < valor.getButacas()[0].length; j++) {
                System.out.print(matriz1[i][j]);
            }
            System.out.println("");
        }

    }
}
