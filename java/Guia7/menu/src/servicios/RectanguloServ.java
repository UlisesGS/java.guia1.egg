package servicios;

import Entidades.RectanguloValores;
import java.util.Scanner;



public class RectanguloServ {
    
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    
    public RectanguloValores Cargar(){
        
        RectanguloValores num=new RectanguloValores();
        
        System.out.println("Ingrese la base y la altura:");
        
        num.setBase(leer.nextInt());
        num.setAltura(leer.nextInt());
        
        return num;
    }
    
    //Superficie = base * altura
    
    public int Superficie(RectanguloValores num){
        
        int superficie = (num.getBase()*num.getAltura());
        
        return superficie;
    }
    
    
    //Perímetro = (base + altura) * 2.
    
        public int Perimetro(RectanguloValores num){
        
        int perimetro = ((num.getBase()+num.getAltura())*2);
        
        return perimetro;
    }
    
    public int Matriz(RectanguloValores num){
        int numero=1;
             for (int i = 1; i <= num.getAltura(); i++) {
                for (int j = 1; j <= num.getBase(); j++) {
                    if((i == 1) || (i ==num.getAltura()) || (j == 1) || ( j == num.getBase())) {
                        System.out.print("* ");
                }else
                        System.out.print("  ");
            }
                 System.out.println("");
        }
      System.out.println("------------------------------");
      System.out.println("Altura = "+num.getAltura());
      System.out.println("Base = "+num.getBase());
      System.out.println("Perimetro = "+Perimetro(num));
      System.out.println("Superficie = "+Superficie(num));
      return numero;
    }
}
