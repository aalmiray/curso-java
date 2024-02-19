package com.acme;

import com.acme.greetings.EnGreeting;
import com.acme.greetings.EsGreeting;

public class Main {
    public static void main(String[] args) {
        if (null == args || args.length == 0) {
            Main.run("es");
        } else {
            Main.run(args[0]);
        }
    }
    
    private static void run(String lang) {    
        if ("es".equals(lang)) {
            greetWith(new EsGreeting());
        } else if ("en".equals(lang)) {
            greetWith(new EnGreeting());
        } else {
            throw new IllegalArgumentException("Unknown language " + lang);
        }
    }
    
    private static void greetWith(Greeting greeting) {
        GreetingService service = new GreetingService(greeting);
        System.out.println(service.greet("Duke"));
    }
}