/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1ej1scanner;

import java.util.Scanner;


public class G1_03Strings_pedirdatos {
    public static void main(String[] args) {
  Scanner read = new Scanner(System.in);
        System.out.println("¿Cómo te llamas?");
        String name = read.nextLine();
        System.out.println("¿Qué edad tienes?");
        int edad= read.nextInt();
        read.nextLine(); //se agrega porque para de leer con read.nextInt
        
        System.out.println("¿Cuál es tu comida favorita?");
        String comida = read.nextLine();
             
        
        System.out.println("Hola "+name);
        System.out.println("Tienes "+edad+" años.");
        System.out.println("Tu comida favorita es "+comida+"! yum yum");
        
    }
    
    
}
