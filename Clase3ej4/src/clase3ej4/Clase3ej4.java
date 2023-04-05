/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package clase3ej4;

import java.util.Scanner;

public class Clase3ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese temperatura: ");
       int num = leer.nextInt();
       int dob = num*2;
       int trip= num*3;
       double raiz = Math.sqrt(num);
       System.out.println("El doble del numero ingresado es: " + dob);
       System.out.println("El Triple del numero ingresado es: " + trip);
      if ( num > 0 ){
       System.out.println("La raiz cuadrada del numero ingresado es: " + raiz);
      } else {
       System.out.println("Debe ser un numero mayor a 0");       
        }
    }  
    
}
    

