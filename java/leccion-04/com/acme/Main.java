package com.acme;

import com.acme.greetings.EnGreeting;
import com.acme.greetings.EsGreeting;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        if (null == args || args.length == 0) {
            Main.run(Language.of("es"));
        } else {
            Main.run(Language.of(args[0]));
        }
    }
    
    private static void run(Language lang) {    
        switch(lang) {
            case ES:
                greetWith(new EsGreeting());
                break;
            case EN:
                greetWith(new EnGreeting());  
                break;
            default: 
                throw new IllegalArgumentException("Unknown language " + lang); 
        }
    }
    
    private static void greetWith(Greeting greeting) {
        GreetingService service = new GreetingService(greeting);
        System.out.println(service.greet("Duke"));
    }
    
    private enum Language {
        ES, EN;
        
        public static Language of(String input) {
            if (null == input) {
                throw new NullPointerException();
            }
            return Language.valueOf(input.toUpperCase(Locale.ROOT).trim());
        }
    }
}