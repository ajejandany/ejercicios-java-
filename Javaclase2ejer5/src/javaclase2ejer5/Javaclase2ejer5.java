/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
* Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número. 

 */
package javaclase2ejer5;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Javaclase2ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner leer = new Scanner(System.in);
         System.out.println("ingrese un numero entero");
         int num1 = leer.nextInt();
         System.out.println(num1 * 2);
          System.out.println(num1 * 3);
           System.out.println(Math.sqrt(num1));
    }
    
}
