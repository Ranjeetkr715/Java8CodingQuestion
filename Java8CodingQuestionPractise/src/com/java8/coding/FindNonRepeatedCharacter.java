package com.java8.coding;


import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindNonRepeatedCharacter {
    public static void main(String [] args){
        String input = "swiss";
        Map<String,Long> mapcounting = Arrays.stream(input.split("")).collect(Collectors.groupingBy(a->a,Collectors.counting()));
        mapcounting.entrySet().stream().filter(a-> a.getValue()==1).forEach(System.out::println);

        LinkedHashMap<String, Long> collectCount = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        Map.Entry<String, Long> stringLongEntry = mapcounting.entrySet().stream().filter(a -> a.getValue() == 1).findFirst().get();
        System.out.println(stringLongEntry.getKey());
    }
}
