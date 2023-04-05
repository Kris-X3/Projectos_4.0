/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3ej5;

import java.util.Scanner;

/**
 *
 * @author monsil2
 * 
 */
public class Clase3ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese un numero entero: ");
       int num = leer.nextInt();
       int dob = num *2;
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
