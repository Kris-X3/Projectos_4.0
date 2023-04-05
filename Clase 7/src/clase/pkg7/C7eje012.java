/*
ej 11
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
validando que el primer número múltiplo del segundo e imprima 
si el primer número es múltiplo del segundo, sino informe que no lo son.

 */
package clase.pkg7;

import java.util.Scanner;

public class C7eje012 {

    public static void main(String[] args) {
        System.out.println("Ingrese dos números enteros");
        Scanner leer = new Scanner(System.in);
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();

        EsMultiplo(num1, num2);
    }

    public static void EsMultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println("El primer número es múltiplo del segundo");

        } else {
            System.out.println("El primer número NO es múltiplo del segundo");
        }

    }

}
