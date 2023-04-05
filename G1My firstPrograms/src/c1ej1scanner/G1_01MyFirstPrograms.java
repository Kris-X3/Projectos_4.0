/*
this is a line of comments
 */
package c1ej1scanner;

import java.util.Scanner;

public class G1_01MyFirstPrograms {

    // shortcut psvm + TAB
    public static void main(String[] args) {

        //to read you need Scanner  
        // Scanner --se debe Importar
        // shortcut sout + TAB
        //ln> linea- es como el enter
        System.out.println("Adoro el sushi!");
        //Si quieres incluit comillas usa \"...\"
        // esta esté sin ln Asi que no va a saltar linea
        System.out.print("\"y también la arepa\" ");
        //        Agrega \n junto y salta otra linea, el salto se hace donde la ubiques
        System.out.println(" Agrega eso \n y salta a otra línea ");
        System.out.println("\tPara tabular ");
        System.out.println("\\Con slash\\");

        //VARIABLES EN JAVA
        //es donde guardamos las variables
        int x; //Declara variable
        x = 123; //asignar variable

        int y = 123; //inicializar variable +cuando combinamos Declarar y asignar, se piede hacer separado

        System.out.println(" _Mi numero es: " + x); //concatenar con +

        //otros tipos
        double z = 3.15;
        boolean a = true;
        char symbol = '%'; //' apostrofes no ""
        String name = "Kristil";
        
              
        
        Scanner read = new Scanner (System.in);
        System.out.println("Ingrese el primer numero");

        int num1 = read.nextInt();
      

        System.out.println("Ingrese el segundo numero");
        int num2 = read.nextInt();

        int suma = num1 + num2;

        System.out.println("El resultado de sumar " + num1 + " + " + num2 + " = " + suma);// TODO code application logic here
    }
    
}
