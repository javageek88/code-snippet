package com.vivek.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountColors {
    public static void main(String[] args) {

        System.out.println(" Starting point for Java 8 Examples");

        List<String> colors = Arrays.asList("red", "yellow", "green", "red", "green", "red");

        Map<String, Integer> countColors = new HashMap<>();
        colors.stream().forEach(x -> {
            if(!countColors.containsKey(x)){
                countColors.put(x, Long.valueOf(colors.stream().filter(color -> color == x)
                        .count()).intValue());
            }
        });
        System.out.println("countColors = " + countColors);
    }
}
