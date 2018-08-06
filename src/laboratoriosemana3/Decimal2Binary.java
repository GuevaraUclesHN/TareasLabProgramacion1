package laboratoriosemana3;

import java.util.Scanner;

public class Decimal2Binary {
    public static void main(String[] args) {
         Scanner art = new Scanner(System.in);
       
        System.out.println("~~~~~~~P R O G R A M A  D E  C O N V E R C I O N~~~~~~~");
        System.out.println("       D E C I M A L   A  B I N A R I O           ");
        
        System.out.print("Ingrese un numero (Base 10): ");
    
        int numero_b10 = art.nextInt();
    if(numero_b10>=0){
    int dividendo = numero_b10;
    int divisor=2;
    int cosiente= dividendo/divisor;
    int residuo= dividendo%divisor;
    String numero_b2="";
    
    while(cosiente>=1){
       numero_b2 = residuo + numero_b2;
    dividendo=cosiente;
    residuo=dividendo%divisor;
    cosiente=dividendo/divisor;
    
                
    }
    System.out.println("1"+numero_b2);

    }
    else {System.out.println("Numero debe ser mayor a 0");}
    
    
 }
}
