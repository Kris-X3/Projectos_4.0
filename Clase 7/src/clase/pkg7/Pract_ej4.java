/*EJERCICIO 4
 Crea una aplicación que nos pida un número por teclado 
y con una función se lo pasamos por parámetro para que nos indique si es 
o no un número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 
17 si es primo.

 */
package clase.pkg7;

import java.util.Scanner;

public class Pract_ej4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numero: ");
        int num = leer.nextInt();
        System.out.println(esPrimo(num));
 
    }

    public static Boolean esPrimo(int num) {
        int cont=0; 
                     
        //El FOR recorre todo los numeros el DO/WHILE corta cuando mas de 2
        for (int i = 1; i <= num; i++) {
            if (num %i==0) {
               cont++;       
            }
     
        }
      
    return (cont==2);
    }
    

    
     public static Boolean esPrimo2(int num) {
        int cont1=0; 
        int cont2=1;
                     
         do { 
             if (num%cont2==0) {
                 cont1++;
                 
             }
             cont2++;
             
         } while ((cont1 <= 2) && (cont2 <= num));
           return (cont1==2);
  
    }
}
