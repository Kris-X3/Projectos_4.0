/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1ej1scanner;


public class G1_04MathsMethods {
    public static void main(String[] args) {
        
        double x = 3.54;
        double y = -10;
         System.out.println("para x=3.54 y y=-10");
        
        //compara dos numeros y encuentra el min o el max
        double min = Math.min(x, y);
        double max= Math.max(x, y);
        
        System.out.println("El mínimo es "+min);
        System.out.println("El máximo es "+max);
        
        double absoluto = Math.abs(y);
        System.out.println("El valor absoluto de y es "+absoluto);
        
        double raiz = Math.sqrt(x);
        System.out.println("La raiz cuadrada de x es "+raiz);
        
        /*DIFERENCIA ENTRE ROUND, CEIL Y FLOOR
        Estas tres funciones se aplican sobre valores numéricos decimales 
        y retornan un valor numérico que en el caso de ROUND es un ENTERO LONG,
        mientras que en el caso de floor y ceil retornan un valor 
        de tipo double coincidente o equivalente con un entero.*/
        
        
        double rounddown = Math.round(x);
        System.out.println("x redondeado -round- es "+rounddown);
       
        double roundup = Math.ceil(x);
        System.out.println("x redondeado por -ceil- arriba es  "+roundup);
        
         double redondeadown = Math.floor(x);
        System.out.println("x redondeado por abajo -floor- es  "+redondeadown);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
                
    }
            
    
}
