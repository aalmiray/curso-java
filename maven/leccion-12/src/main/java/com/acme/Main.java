package com.acme;

import com.acme.greetings.EnGreeting;
import com.acme.greetings.EsGreeting;

public class Main {
    public static void main(String[] args) {
        Language[] languages = new Language[] {
            Language.ES, Language.EN
        };
        
        for (int i = 0; i < languages.length; i++) {
            Main.run(languages[i]);
        }
        
        System.out.println("-------------------------");
        
        for(Language lang : languages) {
            Main.run(lang);
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
}