/*
 *Diseñe una función que pida el nombre y la edad de N personas 
e imprima los datos de las personas ingresadas por teclado 
e indique si son mayores o menores de edad. Después de cada persona, 
el programa debe preguntarle al usuario si quiere seguir mostrando personas 
y frenar cuando el usuario ingrese la palabra “No”.
 */
package clase.pkg7;

import java.util.Scanner;

public class C7Pracej2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String nombre = null;
        int edad = 0;

        pedirDatos(nombre, edad);

    }

    public static void pedirDatos(String nombre, int edad) {
        Scanner leer = new Scanner(System.in);

        int i = 0;
        String resp;

        do {
            System.out.println("Ingrese el Nombre");
            nombre = leer.next();
            System.out.println("Ingrese edad");
            edad = leer.nextInt();
            if (edad < 18) {
                System.out.println("Nombre: " + nombre + " Edad: " + edad + "Menor de edad");
                System.out.println("Desea salir S/N");
                resp = leer.next();
            } else {
                System.out.println("Nombre: " + nombre + " Edad: " + edad + "Mayor de edad");
                System.out.println("Desea salir S/N");
                resp = leer.next();
            }
            }while (!resp.equals("N"));

        
    }
}
