package servicios;

import Entidades.PersonaEnt;
import java.util.Scanner;

/**
 *Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 * @author Ulises
 */
public class PersonaServ {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");;
    
    public PersonaEnt crearPersona(){
        
        PersonaEnt valor=new PersonaEnt();
        boolean flag=true;
      while(flag){
        System.out.println("Ingrese Los Siguientes datos");
        
        System.out.print("Nombre = ");
        valor.setNombre(leer.next());
        
        System.out.print("Edad = ");
        valor.setEdad(leer.nextInt());
        
        System.out.print("Sexo = ");
        valor.setSexo(leer.next());
        
        System.out.print("Peso = ");
        valor.setPeso(leer.nextDouble());
        
        System.out.print("Altura = ");
        valor.setAltura(leer.nextDouble());
        System.out.println("\n--------------------------");
        
        if (valor.getSexo().equalsIgnoreCase("H")|| valor.getSexo().equalsIgnoreCase("F") || valor.getSexo().equalsIgnoreCase("O")) {
                flag=false;
        }else {
            System.out.println("Ingreso mal el valor de sexo");
            System.out.println("--------------------------");
        }
      }
        return valor;
    }
    
    public double calcularMC(PersonaEnt valor){
        double resultado;
        int cont=0;
        resultado = valor.getPeso()/(valor.getAltura()*valor.getAltura());
        
            if (resultado<20) {
                cont=-1;
            } else if (resultado<=25) {
                cont=0;
            } else if (resultado>25){
                cont=1;
            }
           return cont;
    }
    
    public void esMayorDeEdad(PersonaEnt valor){
        boolean flag;
        if(valor.getEdad()<18){
            flag=false;
            System.out.println("Mayor de edad = "+flag);
        }else if (valor.getEdad()>=18) {
            flag=true;
            System.out.println("Mayor de edad = "+flag);
        }
    }
    
    public void Mostrar(PersonaEnt valor){
        System.out.println("Nombre = "+valor.getNombre());
        System.out.println("Edad = "+valor.getEdad());
        System.out.println("Sexo = "+valor.getSexo());
        System.out.println("Peso = "+valor.getPeso());
        System.out.println("Altura = "+valor.getAltura());
        boolean flag;
        if(valor.getEdad()<18){
            flag=false;
            System.out.println("Mayor de edad = "+flag);
        }else if (valor.getEdad()>=18) {
            flag=true;
            System.out.println("Mayor de edad = "+flag);
        }
    }
}
