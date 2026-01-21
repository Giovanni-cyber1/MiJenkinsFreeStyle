package com.mycompany.mavenfreestyle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MavenFreeStyleTest {

    @Test
    public void testMain() {
        String[] args = {};
        MavenFreeStyle.main(args);
        // Si llega aquí, el test pasa
    }

    @Test 
    public void testFibonacci() {
        MavenFreeStyle instance = new MavenFreeStyle();
        assertEquals(1, instance.fibonacci(1));
    }

    @Test	
    public void testFibonacci2() {
        MavenFreeStyle instance = new MavenFreeStyle();
        assertEquals(55, instance.fibonacci(10));
    }
}

    
}
