package com.acme;

import org.apache.commons.lang3.StringUtils;

public class GreetingService {
    private Greeting greeting;
    
    public GreetingService(Greeting greeting) {
        this.greeting = greeting;
    }
    
    public void setGreeting(Greeting greeting) {
        if (null != greeting) {
            this.greeting = greeting;
        }
    }
    
    public String greet(String name) {
        return StringUtils.capitalize(greeting.getGreeting()) + " " + name;
    }
}