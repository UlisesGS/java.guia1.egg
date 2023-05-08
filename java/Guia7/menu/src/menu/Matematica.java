package menu;

import Entidades.MatematicaEnt;


public class Matematica {

    /**Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
     * @param args the command line arguments
     * a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
     */
    public static void main(String[] args) {
       MatematicaEnt numeros=new MatematicaEnt();
       
       numeros.setNum1(Math.random()*10);
       numeros.setNum2(Math.random()*10);
       
        System.out.println("Numero uno: " +numeros.getNum1());
        System.out.println("Numero dos: "+numeros.getNum2());
       
        double fina,  fin1, fin2, fin3;
        fina = Math.max(numeros.getNum1(), numeros.getNum2());
        System.out.println("El nuemero mayor es: "+fina);
    
        if (fina==numeros.getNum1()) {
            fina = Math.round(fina);
            fin2 = Math.round(numeros.getNum2());
            System.out.println("El numero1 redondeado es: "+fina);
            System.out.println("El numero2 redondeado es: "+fin2);
            fin3=Math.pow(fina, fin2);
            System.out.println("La potencia es "+fin3);
            
            System.out.println("------");
            
            numeros.setNum2(Math.abs(numeros.getNum2()));
            numeros.setNum2(Math.sqrt(numeros.getNum2()));
            
            System.out.println("La raiz es "+numeros.getNum2());
            
        }else if (fina==numeros.getNum2()) {
            fin1 = Math.round(numeros.getNum1());
            fina = Math.round(fina);
            System.out.println("El numero1 redondeado es: "+fin1);
            System.out.println("El numero2 redondeado es: "+fina);
            fin3=Math.pow(fina, fin1);
            System.out.println("La potencia es "+fin3);
            
            System.out.println("------");
            
            numeros.setNum1(Math.abs(numeros.getNum1()));
            numeros.setNum1(Math.sqrt(numeros.getNum1()));
            
            System.out.println("La raiz es "+numeros.getNum1());
        }
 
        
    }
}
    
    

