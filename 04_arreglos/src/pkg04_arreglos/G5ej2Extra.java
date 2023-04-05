/*
 Escriba un programa que averigüe si dos vectores de N enteros son iguales 
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
 */
package pkg04_arreglos;

import java.util.Scanner;

public class G5ej2Extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dimensión de los vectores");
        int N = leer.nextInt();

        int vector1[] = new int[N];
        int vector2[] = new int[N];

        System.out.println("Escribe los elementos del vector");
        for (int i = 0; i < N; i++) {
            vector1[i] = leer.nextInt();
            
        }
        System.out.println(" -------- ");
        

        System.out.println("Escribe los elementos del vector");
        for (int i = 0; i < N; i++) {
            vector2[i] = leer.nextInt();
            
        }
         for (int i = 0; i < N; i++) {
             if (vector1 [i]==vector2[i]) {
                 System.out.println("los vectores son iguales"); 
             }else{
                 System.out.println("Los vectores son distintos");
                 break;
                
             }
 
           
        } 
    }

}
