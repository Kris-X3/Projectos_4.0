/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraprimos;

import java.util.Scanner;

/**
 *
 * @author monsil
 */
public class ExtraPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese dos numeros enteros: ");
       int num1 = leer.nextInt();
       int num2 = leer.nextInt();
       
       int A = Math.min(num1,num2); 
       int B = Math.max(num1,num2); 
       int X=1;
               
        for(int i = A; i <= B; i++)
            {
             boolean esprimo = true;
             for(int j = 2; j <= i/2; j++)
             { 
             if(i%j==0){
               esprimo=false;
               break;
               }
             if (esprimo){
                 System.out.println(i);
             }
        }  
    
       
    }
    
}
    
}

