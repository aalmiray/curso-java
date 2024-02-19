package com.acme;

import com.acme.Greeting;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingServiceTest {
    @Test
    void getGreetingReturnsExpectedValue() {
        // given:
        GreetingService service = new GreetingService(() -> "bonjour" );
        
        // when:
        String result = service.greet("Duke");
        
        // then:
        assertEquals("Bonjour Duke", result);
    }
}