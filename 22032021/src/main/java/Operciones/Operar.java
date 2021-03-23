
package Operciones;

public class Operar {

 private int vuno,vdos,resultados;
 
 public Operar(int valoruno,int valordos){
     this.vuno = valoruno;
     this.vdos = valordos;
     
 }   
 
 public void Operacion(){
     resultados = vuno + vdos;
  }
 
  public void Imprimir(){
     
  System.out.println("El resultado de la suma es :" + resultados);
  }  
    
    
}
