package com.acme;

import com.acme.greetings.EnGreeting;
import com.acme.greetings.EsGreeting;

public class Main {
    public static void main(String[] args) {
        GreetingService service = new GreetingService(new EsGreeting());
        System.out.println(service.greet("Duke"));
        
        service.setGreeting(new EnGreeting());
        System.out.println(service.greet("Duke"));
    }
}