/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenfreestyle;

/**
 *
 * @author olivert
 */
public class MavenFreeStyle {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
public static int fibonacci(int n) {
    if (n <= 1) { // Casos base
        return n;
    } else {
        // Llamada recursiva
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
}
