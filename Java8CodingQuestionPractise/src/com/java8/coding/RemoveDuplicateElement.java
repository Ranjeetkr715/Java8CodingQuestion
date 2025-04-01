package com.java8.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElement {
    public static void main(String [] args){
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String> collectUnique = listOfStrings.stream().distinct().collect(Collectors.toList());
        System.out.println(collectUnique);
    }
}