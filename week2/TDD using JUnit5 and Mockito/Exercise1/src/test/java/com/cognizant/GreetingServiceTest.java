package com.cognizant;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GreetingServiceTest {

    @Test
    public void testGreetWithName() {
        GreetingService service = new GreetingService();
        assertEquals("Hello, Alice!", service.greet("Alice"));
    }
}
