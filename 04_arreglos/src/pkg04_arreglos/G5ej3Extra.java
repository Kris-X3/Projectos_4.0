/*
 Crear una función rellene un vector con números aleatorios, 
pasándole un arreglo por parámetro. 
Después haremos otra función o procedimiento que imprima el vector.
 */
package pkg04_arreglos;

import java.util.Random;
import java.util.Scanner;


public class G5ej3Extra {
    
    
   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese dimensión del vector");
        
        int N = leer.nextInt();
        
        int vector []= new int[N];
                
        llenarVector (vector,N);       
    }
   
     //subprograma > llenar vector con # aleatorios y mostrarlos
    
    public static void llenarVector( int  vector[], int N){
       
        /* Random random=new Random();
        
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100);
            
            System.out.println("[" + vector[i] + "]");
            
        }*/
        
          for (int i = 0; i < N; i++) {
            vector[i] = (int) (Math.random() * 10);
                     
            
            System.out.println("[" + vector[i] + "]");
            
        }
       
}
    
public static void mostrarMatriz(int[][] matriz){
}

    
}
