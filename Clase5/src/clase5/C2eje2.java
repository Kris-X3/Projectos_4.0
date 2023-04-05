
package clase5;

import java.util.Scanner;


public class C2eje2 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String pal = leer.nextLine();
    boolean bandera = pal.toUpperCase().equals("EUREKA");
        
        if (bandera){
            System.out.println("CORRECTO");        
    }else 
            System.out.println("INCORRECTO");
   
    }
}

