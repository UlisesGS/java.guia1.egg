/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package servicios;

import Entidades.CafeteraEnt;
import java.util.Scanner;


public class CafeteraServ {
    
    Scanner leer=new Scanner (System.in);
    
  public CafeteraEnt llenarCafetera(){  
        CafeteraEnt valor=new CafeteraEnt();
        valor.setCantidadActual(valor.getCapacidadMaxima());
        System.out.println("Cantidad actual es: "+valor.getCantidadActual());
        return valor;
  }
/*  Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.*/
  public void servirTaza(CafeteraEnt valor){
      
      System.out.println("Ingrese el tamanio de su taza:");
      int tamaño=leer.nextInt();
      System.out.println("llenando taza...");
      
      if (tamaño>0 && tamaño<valor.getCantidadActual()) {
          System.out.println("Se lleno la taza exitosamente.");
      }else if (tamaño>valor.getCantidadActual()) {
          tamaño-=valor.getCantidadActual();
          System.out.println("Ha la taza lr falto "+tamaño+" para llenarse.");
      }else{
          System.out.println("Lo sentimos, ah ocurrido algun error.");
      }
      
  }
  
  /*Método vaciarCafetera(): pone la cantidad de café actual en cero.*/
  
 public void vaciarCafetera(CafeteraEnt valor){
     System.out.println("La cafetera se vacio con exito");
     valor.setCantidadActual(0);
 }
 /* Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.*/
 public void agregarCafe(CafeteraEnt valor){
     
     System.out.println("Ingrese la cantidad para llenar la cafetera:");
     valor.setCantidadActual(leer.nextInt());
     
     if (valor.getCantidadActual()>valor.getCapacidadMaxima()) {
         System.out.println("Supero la cantidad maxima de la cafetera.");
         System.out.println("Se llenara por su valor inicial");
         valor.setCantidadActual(valor.getCapacidadMaxima());
         
     }else if (valor.getCantidadActual()<valor.getCapacidadMaxima()) {
         System.out.println("Se lleno con exito.");
     }else{
         System.out.println("Lo sentimos, ah ocurrido un error.");
     }
 }
 
}
