package com.cognizant;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AaaPatternTest {

    private StringBuilder message;

    @Before
    public void setUp() {
        message = new StringBuilder();
        message.append("Hello");
    }

    @After
    public void tearDown() {
        message = null;
    }

    @Test
    public void testWithArrangeActAssertPattern() {
        // Arrange
        String name = "Alice";

        // Act
        message.append(" ").append(name);
        String result = message.toString();

        // Assert
        assertEquals("Hello Alice", result);
    }
}
