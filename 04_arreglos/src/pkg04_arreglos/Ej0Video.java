/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04_arreglos;

import java.util.Scanner;


public class Ej0Video {
    public static void main(String[] args) {
       
    
    int [] vector;
    
    vector = new int[2];
    
    int[][] matriz = {{4,8,6},{2,1,7}};
    
        System.out.println("Ingrese los valores del vector de tamaño " + vector.length+":" );
    Scanner leer = new Scanner(System.in);
    
        for (int i = 0; i < vector.length; i++) {
            System.out.println("v["+"]=");
            vector [i] = leer.nextInt();
            
        }
        
        //Multiplica vector por matriz
        
        
        String aux = "";
        
        //mostrar vector
        System.out.println("(* Vector:)");
        
        for (int elemento:vector){
            aux += " " + elemento; 
        }
        System.out.println(aux);
                    
        }
        
        //mostrar matriz
        //System.out.println("(* Vector:)");
        
       // for (int elemento:vector){
            
        
    }
    
    
    
            
    

