package com.vetias.java.workshop.Collections;

import java.util.ArrayList;
import java.util.List;

public class StreamUpperCaseNames {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("pramisha");
        names.add("dhanush");
        names.add("dhanushya");
        names.add("rishika");
        names.add("shrika");
        names.add("sri vignesh");
        names.stream()
        .filter(name -> name.startsWith("s") || name.startsWith("s"))
        .distinct().map(String::toUpperCase).forEach(System.out::println);
       
    }
   
}

