/*
Ejercicio 13
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros 
de equipo y define su tipo de dato de tal manera que te permita alojar 
sus nombres más adelante.

 */
package pkg04_arreglos;

import java.util.Scanner;

public class G05_ej13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

           
        
        String[] equipo = new String[6];
        
         //si quiero asignar valor en vez de Leer
        //equipo[0]="Nico";

        for (int i = 0; i < equipo.length; i++) {
            System.out.println("v[" + i + "]=");
            equipo[i] = leer.next();
        }

        for (String elemento:equipo){ 
            System.out.println("[" + elemento + "]");
        }

        /* }
          //mostrar vector
        for (String elemento:equipo){
            
           System.out.println("(* equipo:)");
    }*/
    }

}
