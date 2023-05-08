package servicios;

import Entidades.RaicesEnt;
import java.util.Scanner;

/**
 * Vamos a realizar una clase llamada Raices, donde representaremos los valores
 * de una ecuación de 2o grado. Tendremos los 3 coeficientes como atributos,
 * llamémosles a, b y c. Hay que insertar estos 3 valores para construir el
 * objeto a través de un método constructor. Luego, las operaciones que se
 * podrán realizar son las siguientes: • Método getDiscriminante(): devuelve el
 * valor del discriminante (double). El discriminante tiene la siguiente
 * formula: (b^2)-4*a*c • Método tieneRaices(): devuelve un booleano indicando
 * si tiene dos soluciones, para que esto ocurra, el discriminante debe ser
 * mayor o igual que 0. • Método tieneRaiz(): devuelve un booleano indicando si
 * tiene una única solución, para que esto ocurra, el discriminante debe ser
 * igual que 0. • Método obtenerRaices(): llama a tieneRaíces() y si
 * devolvió́true, imprime las 2 posibles soluciones. • Método obtenerRaiz():
 * llama a tieneRaiz() y si devolvió́true imprime una única raíz. Es en el caso
 * en que se tenga una única solución posible. • Método calcular(): esté método
 * llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles
 * soluciones que tiene nuestra ecuación con los métodos obtenerRaices() o
 * obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no
 * existir solución, se mostrará un mensaje. Nota: Formula ecuación 2o grado:
 * (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b
 *
 * @author Ulises
 */
public class RaicesServ {

    Scanner leer = new Scanner(System.in);

    public RaicesEnt ingresarValores() {

        RaicesEnt valor = new RaicesEnt();

        System.out.print("Ingrese el valor de a = ");
        valor.setA(leer.nextDouble());
        System.out.println("");
        System.out.print("Ingrese el valor de b = ");
        valor.setB(leer.nextDouble());
        System.out.println("");
        System.out.print("Ingrese el valor de c = ");
        valor.setC(leer.nextDouble());
        System.out.println("");

        return valor;
    }

    /*• Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c*/
    public double getDiscriminante(RaicesEnt valor) {

        double discr = (valor.getB() * valor.getB()) - 4 * valor.getA() * valor.getC();
        System.out.println("dis="+discr);
        return discr;
    }

    /*Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.*/
    public boolean tieneRaices(RaicesEnt valor) {
        boolean flag = true;
        if (getDiscriminante(valor) >= 0) {
            flag = true;
            System.out.println("tiene mas de una raiz? " + flag);
        } else {
            flag = false;
            System.out.println("tiene mas de una raiz? " + flag);
        }

        return flag;
    }

    /*Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.*/
    public boolean tieneRaiz(RaicesEnt valor) {
        boolean flag = true;
        if (getDiscriminante(valor) == 0) {
            flag = true;
            System.out.println("tiene una raiz? " + flag);
        } else {
            flag = false;
            System.out.println("tiene una raiz? " + flag);
        }

        return flag;
    }

    /*Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles
soluciones. (-b±√((b^2)-(4*a*c)))/(2*a)*/
    public void obtenerRaices(RaicesEnt valor) {

        if (tieneRaices(valor) == true) {
            System.out.println("primera solucion = " + valor.getB() + "+√((" + valor.getB() + "^2)-(4*" + valor.getA() + "*" + valor.getC() + ")))/2*" + valor.getA() + ")");
            System.out.println("segunda solucion = " + valor.getB() + "-√((" + valor.getB() + "^2)-(4*" + valor.getA() + "*" + valor.getC() + ")))/2*" + valor.getA() + ")");
        }

    }

    /*tieneRaiz() y si devolvió́true imprime una única raíz. Es en el caso
 * en que se tenga una única solución posible.*/
    public void obtenerRaiz(RaicesEnt valor) {

        if (tieneRaiz(valor) == true) {
            System.out.println("primera solucion = " + valor.getB() + "+√((" + valor.getB() + "^2)-(4*" + valor.getA() + "*" + valor.getC() + ")))/2*" + valor.getA() + ")");
        }

    }

    /* Método calcular(): esté método
 * llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles
 * soluciones que tiene nuestra ecuación con los métodos obtenerRaices() o
 * obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no
 * existir solución, se mostrará un mensaje. Nota: Formula ecuación 2o grado:
 * (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b*/
    /*double resultado = - valor.getB() + Math.sqrt(((valor.getB() * valor.getB()) - (4 * valor.getA() * valor.getC()) / (2 * valor.getA())));
            System.out.println("primer resultado = "+resultado);tieneRaiz(valor) == true*/
    public void calcular(RaicesEnt valor) {
        if (tieneRaiz(valor) == true) {
            
            double resultado = (-valor.getB()+Math.sqrt(valor.getB()*valor.getB()-4*valor.getA()*valor.getC()))/2*valor.getA();
            System.out.println("primer resultado = "+resultado);
        }else if (tieneRaices(valor) == true) {
            double resultado = (-valor.getB()+Math.sqrt(valor.getB()*valor.getB()-4*valor.getA()*valor.getC()))/2*valor.getA();
            System.out.println("primer resultado = "+resultado);
            
            double resultado1 = (-valor.getB()-Math.sqrt(valor.getB()*valor.getB()-4*valor.getA()*valor.getC()))/2*valor.getA();
            System.out.println("segundo resultado = "+ resultado1);
        }else{
            System.out.println("No hay solucion.");
        }
    }
}
