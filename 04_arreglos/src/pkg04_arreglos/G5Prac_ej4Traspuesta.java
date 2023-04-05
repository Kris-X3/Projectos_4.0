/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04_arreglos;

public class G5Prac_ej4Traspuesta {
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matrizA = new int[4][4];
        int[][] matrizB = new int[4][4];
        
        
        System.out.println("Matriz A: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizA[i][j] = (int) (Math.random() * 10);
                System.out.print("[" + matrizA[i][j] + "]");
            }
            System.out.println("");
        }

        //Matriz traspuesta
        System.out.println("Matriz B: ");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizB[i][j] = matrizA[j][i];
                System.out.print("[" + matrizB[i][j] + "]");
            }
            System.out.println("");
        }
        
        //Matriz Antisimetrica
          System.out.println("Matriz C: ");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizB[i][j] = -matrizA[j][i];
                System.out.print("[" + matrizB[i][j] + "]");
            }
            System.out.println("");
        }
    }

}
