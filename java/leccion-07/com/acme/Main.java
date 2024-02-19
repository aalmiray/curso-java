package com.acme;

import com.acme.greetings.EnGreeting;
import com.acme.greetings.EsGreeting;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Language> set = new HashSet<>();
        set.add(Language.ES);
        set.add(Language.EN);
        
        List<Language> list = new ArrayList<>();
        list.add(Language.ES);
        list.add(Language.EN);
        
        Map<String, Language> map = new HashMap<>();
        map.put(Language.ES.name(), Language.ES);
        map.put(Language.EN.name(), Language.EN);
    
        System.out.println(set);
        System.out.println(list);
        System.out.println(map);
        
        System.out.println("-------------------------");
        
        for(Language lang : set) {
            Main.run(lang);
        }
        
        System.out.println("-------------------------");
        
        for(Language lang : list) {
            Main.run(lang);
        }
        
        System.out.println("-------------------------");
        
        for(Language lang : map.values()) {
            Main.run(lang);
        }
        
        System.out.println("=========================");
        
        set.forEach( lang -> Main.run(lang) );
        
        System.out.println("-------------------------");
        
        list.forEach( lang -> Main.run(lang) );
        
        System.out.println("-------------------------");
        
        map.forEach( (key, lang) -> {
            System.out.println("key = " + key);
            Main.run(lang);
        });
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