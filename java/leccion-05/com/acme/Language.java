package com.acme;

import java.util.Locale;

public enum Language {
    ES, EN;
    
    public static Language of(String input) {
        if (null == input) {
            throw new NullPointerException();
        }
        return Language.valueOf(input.toUpperCase(Locale.ROOT).trim());
    }
}