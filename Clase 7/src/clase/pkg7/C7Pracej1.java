/*
Crea una aplicación que le pida dos números al usuario 
y este pueda elegir entre sumar, restar, multiplicar y dividir. 
La aplicación debe tener una función para cada operación matemática 
y deben devolver sus resultados para imprimirlos en el main.
 */
package clase.pkg7;

import java.util.Scanner;

public class C7Pracej1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numero positivos: ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        String salida = "N";

        do {
            System.out.println("1-Suma");
            System.out.println("2-Resta");
            System.out.println("3-Multiplicacion");
            System.out.println("4-Division");
            System.out.println("5-Salir");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    suma(num1, num2);
                    break;
                case 2:
                    resta(num1, num2);
                    break;
                case 3:
                    multiplicacion(num1, num2);
                    break;
                case 4:
                    division(num1, num2);
                    break;
                case 5:
                    System.out.println("Esta Seguro? S/N ");
                    salida = leer.next();
                    System.out.println(salida);

                    break;
                default:
                    System.out.println("El valor ingresado no es correcto");
            }
        } while (!"S".equalsIgnoreCase(salida));
    }

    public static void suma(int num1, int num2) {

        int res = num1 + num2;

        System.out.println("La suma de ambos es: " + res);

    }

    public static void resta(int num1, int num2) {

        int res = num1 - num2;

        System.out.println("La resta de ambos es: " + res);

    }

    public static void multiplicacion(int num1, int num2) {

        int res = num1 * num2;

        System.out.println("El producto de ambos es: " + res);

    }

    public static void division(int num1, int num2) {
        float res;
        res = (float) num1 / num2;

        System.out.println("La division de ambos es: " + (res = (float) num1 / num2));

    }

}
