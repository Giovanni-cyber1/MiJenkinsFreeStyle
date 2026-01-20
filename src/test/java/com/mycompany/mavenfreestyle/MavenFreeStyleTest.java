/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mavenfreestyle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author olivert
 */
public class MavenFreeStyleTest {
    
    public MavenFreeStyleTest() {
    }

    /**
     * Test of main method, of class MavenFreeStyle.
     */
     @Test
    public void testMain() {
        // Solo verificamos que main no lance excepciones
        String[] args = null;
        MavenFreeStyle.main(args);
        assertTrue(true);
    }

    @Test 
    public void testFibonacci(){
        MavenFreeStyle instance = new MavenFreeStyle();
        assertTrue(instance.fibonacci(1)); // 1 pertenece a Fibonacci
    }

    @Test	
    public void testFibonacci2(){
        MavenFreeStyle instance = new MavenFreeStyle();
        assertFalse(instance.fibonacci(10)); // 10 NO pertenece a Fibonacci
    }
}
