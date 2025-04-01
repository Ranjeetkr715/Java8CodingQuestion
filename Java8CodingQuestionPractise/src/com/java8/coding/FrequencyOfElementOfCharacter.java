package com.java8.coding;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfElementOfCharacter {
    public static void main(String [] args){
        String inputString = "Java Concept Of The Day".replaceAll(" ","");
        Map<String, Long> collectCount = Arrays.stream(inputString.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collectCount);

        Map<Character, Long> collectCount1 = inputString.chars().mapToObj(ch -> (char)ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collectCount1);
    }
}
