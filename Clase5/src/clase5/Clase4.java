/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

import java.util.Scanner;


public class Clase4 {
     public static void main(String[] args){
         
     
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese una palabra");
    String pal = leer.nextLine();
    boolean bandera = pal.toUpperCase().substring(0,1).equals("A");
    if (bandera){
           System.out.println("La palabra ingresada A");
      } else{
           System.out.println("La palabra ingresada no es A");
       } 
    }
     
     
    
}
