
//ej.6
package clase6;

import java.util.Scanner;


public class Clase6 {

   
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese dos numero positivos: ");
    int num = leer.nextInt();
    int num1 = leer.nextInt(); 
    String salida="N"; 
    
    do {
        System.out.println("1-Suma");
        System.out.println("2-Resta");
        System.out.println("3-Multiplicacion");
        System.out.println("4-Division");
        System.out.println("5-Salir");
        int opcion =  leer.nextInt();
        float res; 
         
        switch (opcion) {
        	case 1:
           System.out.println(num+num1);
           break;
        	case 2:
           System.out.println(num-num1);
            break;
            case 3:
           System.out.println(num*num1);
            break;   
            case 4:
           System.out.println(res=(float) num/num1);
           
            break;   
             case 5:
           System.out.println("Esta Seguro? S/N ");
           salida=leer.next();
            System.out.println(salida);
           
            break; 
          default:
           System.out.println("El valor ingresado no es correcto");
    }
    } while(!"S".equalsIgnoreCase(salida)); 
}}