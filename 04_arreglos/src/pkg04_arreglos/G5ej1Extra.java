/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector 
de tamaño N, con los valores ingresados por el usuario.
 */
package pkg04_arreglos;

import java.util.Scanner;


public class G5ej1Extra {
    public static void main(String[] args) {
        
      
    Scanner leer = new Scanner (System.in);
      System.out.println("Ingrese dimensión del vector");
      int N=leer.nextInt();
      int suma=0;
     
     int vector []= new int [N];
     
        System.out.println("Escribe los elementos del vector");
        for (int i = 0; i < N; i++) {
            vector[i]=leer.nextInt();
            suma +=vector [i];
                
        }
        
        System.out.println("La suma de los elementos es " + suma);
        
     }}
