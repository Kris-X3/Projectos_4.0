/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1ej1scanner;


public class G1_02IntercambiarVariables {
    public static void main(String[] args) {
       //EXCHANGE VARIABLES
        String a="water";
        String b = "vodka";
        String aux;

        aux = a;
        a=b;
        b=aux;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        
    }
}
