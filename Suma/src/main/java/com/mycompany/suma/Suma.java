/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.suma;

/**
 *
 * @author abner
 */
public class Suma {
    public static void main(String[] args) {
        // Declaración del prototipo de la función
        int suma(int a, int b);
        
        // Definición de la función
        int suma(int a, int b) {
            return a + b;
        }
        
        // Llamada a la función desde el método main
        int resultado = suma(3, 5);
        System.out.println("La suma es: " + resultado);
    }
}


