
package clase3ej4;

import java.util.Scanner;


public class ej6doblecondi {
    
    public static void main(String[] args) { 
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros: ");
                     
    int num1 = leer.nextInt(); 
    int num2 = leer.nextInt(); 
    
    
    if (num1 > 25 && num2 > 25 ){ 
    System.out.println("Las variables num1 y num2 alojan un número mayor 25"); 
    }else if (num1 > 25 && num2 < 25 ){ 
    System.out.println("La variable num1 aloja un número mayor 25");
    }else if (num2 > 25 && num1 < 25 ){
    System.out.println("La variable num2 aloja un número mayor 25");
    } else {
    System.out.println("La variables aloja NO alojan un número mayor 25");
    }
    }
}
