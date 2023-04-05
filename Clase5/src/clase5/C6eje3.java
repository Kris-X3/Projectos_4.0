/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

import java.util.Scanner;


public class C6eje3 {
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese una palabra: ");
    String pal = leer.nextLine();
    int num = pal.length();
    if ( num == 8){
           System.out.println("La palabra ingresada tiene 8 caracteres");
      } else{
           System.out.println("La palabra ingresada no tiene 8 caracteres ");
       } 
}
    
}
