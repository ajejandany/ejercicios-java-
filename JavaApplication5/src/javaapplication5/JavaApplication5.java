/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
         System.out.println("ingrese un numero entero");
         int num1 = leer.nextInt();
         System.out.println("ingrese un numero entero");
         int num2 = leer.nextInt();
         int suma = num1 + num2;
         System.out.println("la suma de los numero es: " + suma);
    }
    
}
