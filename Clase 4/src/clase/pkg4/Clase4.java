
package clase.pkg4;

import java.util.Scanner;

public class Clase4 {


    public static void main(String[] args) { 
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros: ");
                     
    int num1 = leer.nextInt(); 
    int num2 = leer.nextInt(); 
    
    if (num1 > 25) { 
    System.out.println("La variable num1 aloja un número mayor a 25."); 
    }else if (num2 > 25){ 
    System.out.println("La variable num2 aloja un número mayor a 25.");

    System.out.println("Ambas variables num1 y num2 alojan un número mayor a 25.");    
    }
 }
}
    
