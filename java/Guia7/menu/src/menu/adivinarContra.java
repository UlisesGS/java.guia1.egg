package menu;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ulises
 */
public class adivinarContra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> contraseña = new ArrayList();
        Random random = new Random();
        ArrayList<String> aux = new ArrayList();
        String num, cad;
        boolean flag = true;

        System.out.println("Ingrese su contraseña de 6 digitos");

        /*Random random = new Random();
        return random.nextInt(upperRange);*/
        do {

            num = leer.next();

            if (num.length() == 6) {

                contraseña.add(num);

                contraseña.forEach(System.out::println);

                //creo el adivinador random de contraseña
                System.out.println("PROCESO");

                do {
                    //for (int i = 0; i < 6; i++) {
                        // int cont = random.nextInt(000000, 999999);
                        //cad = Integer.toString(cont);
                        cad = "126917";
                        aux.add(cad);
                   // }

                    aux.forEach(System.out::println);

                    if (aux.contains(contraseña)) {
                        System.out.println("Su contraseña fue adivinada");
                        aux.forEach(System.out::println);
                        flag = false;
                    }

                } while (flag == true);

            } else {
                System.out.println("ERROR");
            }

        } while (flag == true);

    }

}
