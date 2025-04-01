package com.java8.coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateCharacterFromString {
    public static void main(String [] args){
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        HashSet<String> hashSet = new HashSet<>();
        Set<String> collectSet = Arrays.stream(inputString.split("")).filter(ch -> !hashSet.add(ch)).collect(Collectors.toSet());
        System.out.println(collectSet);
    }
}
