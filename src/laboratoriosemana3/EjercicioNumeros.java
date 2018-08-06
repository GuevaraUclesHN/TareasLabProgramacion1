package laboratoriosemana3;

import java.util.Scanner;

public class EjercicioNumeros {
    public static void main(String[] args) {
          
Scanner art=new Scanner(System.in);//Scanner
//Variables
int x,par=0,multiplo3=0,primo=0;
int contador=0;

//While
while(contador<20){
    System.out.print("Ingrese un numero: ");
    x=art.nextInt();
    
    if(x%2==0){par++;}
    else if(x%3==0){multiplo3++;}
    else{primo++;}
    if(x==2||x==3){primo++;}
    contador++;
}
//Prints
        System.out.println("---------------------RESULTADOS-----------------------");
        System.out.println("Total numeros pares: "+par);
        System.out.println("Total numeros multiplos de 3: "+multiplo3);
        System.out.println("Total numeros primos: "+primo);
        System.out.println("------------------------------------------------------");
    }//Cierre psvm
}//Cierre Clase
