package com.acme.greetings;

import com.acme.Greeting;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EsGreetingTest {
    private final EsGreeting greeting = new EsGreeting();

    @Test
    void getGreetingReturnsExpectedValue() {
        assertEquals("hola", greeting.getGreeting());
    }
}