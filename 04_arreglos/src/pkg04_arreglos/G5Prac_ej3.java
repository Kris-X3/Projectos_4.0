/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04_arreglos;

import java.util.Scanner;


public class G5Prac_ej3 {
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        System.out.println("ingrese el tamaño del vector");
        
        int N = leer.nextInt();
        int vector[] = new int [N];
        System.out.println("ingrese el numero que desea buscar");
        int numrep= leer.nextInt();
        
        for (int i=0; i<N; i++){
             vector[i] = (int) Math.floor(Math.random() * 10);
        }
        
        for (int i=0; i<N; i++) {
            //System.out.println("el numero es " +vector[i]+ " en la posicion " +i  );
            if (numrep==vector[i]) {
                System.out.println("el numero repetido se encuentra en la posicion " +i);
            
            }
        }
    }
}
