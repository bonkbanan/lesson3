package com.company;

import java.util.Locale;

public class Main {
    public static String isPalindrom(String phrase){
        phrase=phrase.toLowerCase().replaceAll("[^а-я]", "");
        StringBuilder builder= new StringBuilder(phrase);
        String reversed=builder.reverse().toString();
        boolean result= false;
        if(phrase.equals(reversed)){
            result=true;
        }else {
            result=false;
        }
        return phrase + " - " + result;
    }
    public static void main(String[] args) {
        String phrase = "он даже не жадно";
        String[] phrases={
                "Аки лев и та мати велика.",
                " Аки лот и та мати толика.",
                "Солов зов, воз волос",
                "Сани, плот и воз, зов и толп и нас."
        };
        for (int i = 0; i < phrases.length; i++) {
            System.out.println(isPalindrom(phrases[i]));
        }
    }
}
