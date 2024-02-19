package com.acme;

public class Main {
    public static void main(String[] args) {
        if (null == args || args.length == 0) {
            throw new IllegalArgumentException("java com.acme.Main <greeting>");
        }
        
        GreetingService service = new GreetingService(new Greeting() {
            public String getGreeting() { return args[0]; }
        });
        System.out.println(service.greet("Duke"));
        
        service.setGreeting(() -> args[0] + args[0] );
        System.out.println(service.greet("Duke"));
    }
}