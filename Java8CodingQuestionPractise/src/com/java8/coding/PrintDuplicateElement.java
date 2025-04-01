package com.java8.coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class PrintDuplicateElement {
    public static void main(String [] args){
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        HashSet<String> hashSet = new HashSet<>();
        List<String> collectDuplicate = listOfStrings.stream().filter(a -> !hashSet.add(a)).collect(Collectors.toList());
        System.out.println(collectDuplicate);
    }
}
