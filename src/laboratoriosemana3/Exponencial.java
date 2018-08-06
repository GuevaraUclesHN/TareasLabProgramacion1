package laboratoriosemana3;

import java.util.Scanner;

public class Exponencial {
    public static void main(String[] args) {
    Scanner art = new Scanner(System.in);
    
    System.out.print("Ingrese un numero para sacar su factorial : ");
    int numero=art.nextInt();
    if(numero>0){
    System.out.print(numero+"! = ");}

    
    while(numero>=0){  
        
    int factorial = 1;
      
    while(numero>0){
        
    factorial=factorial*numero;
    
    if(numero>1){System.out.print(numero + " x ");}
    numero--;//Contador 
    
    }//Cierre While para sacar exponencial 
    
    System.out.print("1 = ");
    System.out.println(factorial);
        
    System.out.print("Ingrese un numero para sacar su exponencial : ");
     numero=art.nextInt();
   if(numero>0){
    System.out.print(numero+"! = ");}
    }//Cierre While para que cierre hasta numero negativp
    }//Cierre psvm
  }//Cierre Class
