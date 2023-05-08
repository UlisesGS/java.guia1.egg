package servicios;

import Entidades.Bancaria;
import java.util.Scanner;

/**
 *
 * @author Ulises
 */
public class BancariaServ {
    
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    
    public Bancaria Cargar(){
        
        Bancaria num = new Bancaria();
        
        System.out.println("Ingrese su numero de D.N.I.");
        num.setDni(leer.nextLong());
        System.out.println("Ingrese su numero de cuenta");
        num.setNumerocuenta(leer.nextInt());
        System.out.println("Ingrese su saldo actual");
        num.setSaldoactual(leer.nextInt());
        
        return num;
    }
    
    public void Ingreso(Bancaria num){
        int num1;
        
        System.out.println("Ingrese su monto");
        num1=leer.nextInt();
        
        int ingreso = num.getSaldoactual() + num1;
        
        num.setSaldoactual(ingreso);
     }
    
    
     public void Retiro(Bancaria num){
            int num1, retiro=0;
        
            System.out.println("Ingrese su monto a retirar");
            num1=leer.nextInt();
        
            if(num.getSaldoactual()>num1){
                retiro = num.getSaldoactual() - num1;
            }else{
                System.out.println("El monto ingresado a superado al actual");
            }
            num.setSaldoactual(retiro);
        }
     
     
     public void ExtraccionRapida(Bancaria num){
         
         int extraccionRapida= num.getSaldoactual()-((num.getSaldoactual()*20)/100);
         
         System.out.println("retiro en total "+ ((num.getSaldoactual()*20)/100)+"$");
         
         num.setSaldoactual(extraccionRapida);
     }
     
     
     public void Consultar(Bancaria num){

         System.out.println("Su saldo es = " +num.getSaldoactual());
         

     }
        
     public void Mostrar(Bancaria num){

         System.out.println("DNI = "+ num.getDni());
         System.out.println("Numero de cuenta = "+ num.getNumerocuenta());
         System.out.println("Saldo actual = "+ num.getSaldoactual());

     }   
}
