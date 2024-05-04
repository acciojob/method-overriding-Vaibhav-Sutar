package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

import com.driver.A;
import com.driver.B;
import org.junit.jupiter.api.Test; // Import JUnit test annotations if needed

public class TestCases {
    @Test
    public void testMethodOverride() {
        // Create an object of class B
        B objectB = new B();

        // Call overridden method from object of class B
        System.out.println(objectB.meth());

        // Additionally, you can call the method from class A using object of class B
        System.out.println(((A)objectB).meth());
    }
}