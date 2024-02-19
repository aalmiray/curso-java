package com.acme.greetings;

import com.acme.Greeting;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnGreetingTest {
    private final EnGreeting greeting = new EnGreeting();

    @Test
    void getGreetingReturnsExpectedValue() {
        assertEquals("hello", greeting.getGreeting());
    }
}