/*
 Los profesores del curso de programación de Egg 
necesitan llevar un registro de las notas adquiridas por sus 
10 alumnos para luego obtener una cantidad de aprobados y desaprobados.
Durante el período de cursado cada alumno obtiene 4 notas, 
2 por trabajos prácticos evaluativos y 2 por parciales. 
Las ponderaciones de cada nota son:

Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%

Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
Al final del programa los profesores necesitan obtener por pantalla 
la cantidad de aprobados y desaprobados, teniendo en cuenta que solo aprueban 
los alumnos con promedio mayor o igual al 7 de sus notas del curso.

 */
package pkg04_arreglos;

import java.util.Scanner;


public class G5ej4Extra {
    public static void main(String[] args) {
        double notas ;
        double tpe1,tpe2,pI,SI;
        double i=0;
        double vector[] = new double[10]; // Le ponemos la dimension al vector
        
        double total;
        total= notas*0.10+notas*0.15+notas*0.25+notas*0.5;
        
        System.out.println("Ingrese la nota del alumno" + i+1);
        Scanner leer = new Scanner (System.in);
        
                    
        
        for (int i = 0; i < 4; i++) {
            vector [i]=leer.nextDouble();
            
        }
        
        
     
        
        
        
        
    }
    
    
}
