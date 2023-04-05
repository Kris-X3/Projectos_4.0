/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4ej6;

import java.util.Scanner;

/**
 *
 * @author monsil
 */
public class Clase4EJ6 {


    
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
    System.out.println("La variables NO alojan un número mayor 25");
    }
    }
}