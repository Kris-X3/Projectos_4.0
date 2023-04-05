
package pkg04_arreglos;

import java.util.Scanner;


public class G5Prac_ej1 {
    public static void main(String[] args) {
        // Realizar un algoritmo que llene un vector con los 100 primeros números enteros 
        // y los muestre por pantalla en orden descendente.

        Scanner leer = new Scanner(System.in);
        //lenar vector
        int[] vector = new int[100];
        for (int i = 0; i <= 99; i++) {
            vector[i] = i;
            
        }
        //muestra vector
        for (int i= 99; i >= 0; i--) {
            System.out.println("[" + vector[i] + "]");
        }
        
    }
    
}
    



    
    

