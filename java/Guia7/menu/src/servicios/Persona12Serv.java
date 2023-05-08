package servicios;

import Entidades.Persona12Ent;
import java.util.Date;
import java.util.Scanner;

/**
 *• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona():
 * @author Ulises
 */
public class Persona12Serv {
    
    Scanner leer=new Scanner (System.in);
    
    public Persona12Ent crearPersona(){
        
        /*Date fecha=new Date(anio-1900, mes, dia);
        Date fechaActual=new Date();*/
        int dia, mes, anio;
        
        Persona12Ent valorn=new Persona12Ent();
        
        
        System.out.print("Ingrese su nombre: ");
        valorn.setNombre(leer.next());
        System.out.println("");
        System.out.println("Ingrese fecha de nacimiento");
        System.out.print("Dia: ");
        dia=leer.nextInt();
        System.out.println("");
        System.out.print("Mes: ");
        mes=leer.nextInt();
        System.out.println("");
        System.out.print("Anio: ");
        anio=leer.nextInt();
        System.out.println("------------------------");
        Date valorf = new Date(anio-1900, mes-1, dia);
        
       valorn.setFecha(valorf);
       
       return valorn;
    }
    
   /* Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.*/
    
    public Date calcularEdad(Persona12Ent valorn){
        
        Date valorA = new Date();
        
       int edadf = valorA.getYear()-valorn.getFecha().getYear();
       
       
        
        return valorA;
    }
    
    /*• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.*/
    
    public void menorQue(Persona12Ent valorn){
    
        System.out.print("Ingrese la edad para comparar: ");
        boolean flag=true;
        int edad2=leer.nextInt();
        
        if (edad2<(calcularEdad(valorn).getYear()-valorn.getFecha().getYear())) {
            System.out.println(flag);
        }else if (edad2>=(calcularEdad(valorn).getYear()-valorn.getFecha().getYear())) {
            flag=false;
            System.out.println(flag);
        }else
            System.out.println("Dato mal ingresado");
    }
    
    //Metodo mostrarPersona():
    public void mostrarPersona(Persona12Ent valorn){
        
        System.out.println("NOMBRE = "+valorn.getNombre());
        System.out.println("EDAD = "+(calcularEdad(valorn).getYear()-valorn.getFecha().getYear()));
    }
}