
package Operciones;
import java.util.Scanner;

public class Datos {
   public static void main(String arg[]){
       
       Scanner entrada = new Scanner(System.in);
       
       System.out.println("Por favor ingrese el primer numero:");
       int valoruno = entrada.nextInt();
       
       System.out.println("Por favor ingrese el segundo numero:");
       int valordos = entrada.nextInt();
       
       Operar valores = new Operar(valoruno,valordos);
       valores.Imprimir();
       
   }
    
     
    
}
