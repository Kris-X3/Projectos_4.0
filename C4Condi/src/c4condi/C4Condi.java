// WHILE

package c4condi;

import java.util.Scanner;


public class C4Condi {

 
    public static void main(String[] args) {
         	 
   	Scanner leer = new Scanner(System.in);
  	 
   	String respuesta = "S";
  	 
   	while (respuesta.equalsIgnoreCase("S")) {
      	 
    	System.out.println("Desea continuar?");
    	respuesta = leer.nextLine();
   	}
    }
   

}
    

