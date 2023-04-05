/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04_arreglos;

import java.util.Scanner;


public class G5Prac_ej5Antisimetrica {
     public static void main(String[] args) {   
         
        Scanner leer = new Scanner (System.in);
        int [][] matriz = new int [4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
            matriz[i][j] = (int) (Math.random() * 21 - 10);  
                System.out.print(" " + matriz[i][j]+ " ");  
                // RAMDOM SI QUIERES QUE QUEDE ENTRE -10 Y 10 USAR *21-10
                
        }
            System.out.println("");         
        }
        System.out.println("-----------------");
       for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {            
                System.out.print(" " + matriz[j][i] * -1 + " ");                
        }
            System.out.println("");         
        }
            
        }
    }
    

