package com.java8.coding;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedCharacter {
    public static void main(String [] args){
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        Map<String, Long> collect = Arrays.stream(inputString.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        Map.Entry<String, Long>  firstNonRepeatedCharacter = collect.entrySet().stream().filter(a -> a.getValue() == 1).findFirst().get();
        System.out.println(firstNonRepeatedCharacter.getKey() + "   "+firstNonRepeatedCharacter.getValue());
    }
}
