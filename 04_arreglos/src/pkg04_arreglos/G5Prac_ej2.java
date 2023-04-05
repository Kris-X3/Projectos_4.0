/* CHECK
EJ 2
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
y le pida al usuario un número a buscar en el vector. 
El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */
package pkg04_arreglos;

import java.util.Scanner;


public class G5Prac_ej2 {
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
            System.out.println("el numero es " +vector[i]+ " en la posicion " +i  );
            if (numrep==vector[i]) {
                System.out.println("el numero repetido se encuentra en la posicion " +i);
            }
        }
    }
}

