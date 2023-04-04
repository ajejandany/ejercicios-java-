/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Escribir un programa que pida una frase y la muestre toda en mayúsculas 
y después toda en minúsculas. 
 */
package javaclase2ejer3;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class JavaClase2Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner leer = new Scanner(System.in);
         System.out.println("Escribe una frase");
         String frase = leer.nextLine();
         System.out.println(frase.toUpperCase());
         System.out.println(frase. toLowerCase());
    }
    
}
