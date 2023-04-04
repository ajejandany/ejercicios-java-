/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Dada una cantidad de grados centígrados se debe mostrar su equivalente
en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

 */
package javaclase2ejer4;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class JavaClase2Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner leer = new Scanner(System.in);
         System.out.println("ingrese temperatura en C° ");
         int num1 = leer.nextInt();
         double Fahrenheit = 32 + (9 * num1 / 5);
        System.out.println("los grados Fahrenheit son " + Fahrenheit);
    }
    
}
