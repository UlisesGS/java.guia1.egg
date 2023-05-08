package menu;

import Entidades.Bancaria;
import java.util.Scanner;
import servicios.BancariaServ;

/**
 * Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
 * atributos: numeroCuenta (entero), el DNI del cliente (entero largo) y el
 * saldo actual (entero). Las operaciones asociadas a dicha clase son: a)
 * Constructor por defecto y constructor con DNI, saldo, número de cuenta e
 * interés. b) Agregar los métodos getters y setters correspondientes c) Metodo
 * para crear un objeto Cuenta, pidiéndole los datos al usuario. d) Método
 * ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
 * y se la sumara a saldo actual. e) Método retirar(double retiro): el método
 * recibe una cantidad de dinero a retirar y se la restará al saldo actual. Si
 * la cuenta no tiene la cantidad de dinero a retirar, se pondrá el saldo actual
 * en 0. f) Método extraccionRapida(): le permitirá sacar solo un 20% de su
 * saldo. Validar que el usuario no saque más del 20%. g) Método
 * consultarSaldo(): permitirá consultar el saldo disponible en la cuenta. h)
 * Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 *
 * @author Ulises
 */
public class BancariaCuenta {

    public static void main(String[] args) {

        int opcion;
        boolean flag = true;
        Scanner leer = new Scanner(System.in);
        BancariaServ banc = new BancariaServ();

        Bancaria num = banc.Cargar();

        while (flag) {

            System.out.println("-----------------");
            System.out.println("ingrese su opcion \n"
                    + "1. ingresar saldo\n"
                    + "2. retirar saldo\n"
                    + "3. extraccion rapida\n"
                    + "4. consultar saldo\n"
                    + "5. datos de la cuenta\n"
                    + "6. salir\n");
            System.out.println("-----------------");
            opcion = leer.nextInt();
            System.out.println("-----------------");

            switch (opcion) {
                case 1:
                    banc.Ingreso(num);
                    break;
                case 2:
                    banc.Retiro(num);
                    break;
                case 3:
                    banc.ExtraccionRapida(num);
                    break;
                case 4:
                    banc.Consultar(num);
                    break;
                case 5:
                    banc.Mostrar(num);
                    break;
                case 6:
                    System.out.println("Gracias por haber usado el programa.");
                    flag = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }
    }
}
