package com.java8.coding;

import java.util.Arrays;
import java.util.HashSet;

public class FindFirstRepeatedCharacter {
    public static void main(String [] args){
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        HashSet<String> hashSet = new HashSet<>();
        String s = Arrays.stream(inputString.split("")).filter(a -> !hashSet.add(a)).findFirst().get();
        System.out.println(s);

    }
}
