package laboratoriosemana3;

import java.util.Scanner;

public class ImpuestoSR {
    public static void main(String[] args) {
     Scanner art = new Scanner(System.in);
        System.out.println("--------------------------Calculo de ISR-------------------------------");
     //Ingreso desde el teclado
        System.out.print("Ingrese nombre del empleado: ");
        String empleado=art.nextLine();
        System.out.print("Ingrese el salario mensual del empleado: ");
        double salario=art.nextDouble();
     //Variables
        double impuesto=0;
        double deduccion=0;
    //Ifs
        if(salario>0&&salario<=152557.15){System.out.println("No tiene deduccion de ISR");}
        
        else if(salario>=152557.16&&salario<=232622.61){System.out.println("El impuesto sera el 15%");
        impuesto=0.15;deduccion=salario*impuesto;}
        
        else if(salario>=232622.62&&salario<=540982.82){System.out.println("El impuesto sera el 20%");
        impuesto=0.20;deduccion=salario*impuesto;}
        
        else if(salario>=540982.83){System.out.println("El impuesto sera el 25%");
        impuesto=0.25;deduccion=salario*impuesto;}
        
        
        else{System.out.println("Ingrese un salario valido");}
        
        System.out.print("El total de la deduccion del salario es: "+deduccion+ " Lempiras \n");
        System.out.println("-----------------------------------------------------------------------");
        
                
        
        
        
        
    }    
}
