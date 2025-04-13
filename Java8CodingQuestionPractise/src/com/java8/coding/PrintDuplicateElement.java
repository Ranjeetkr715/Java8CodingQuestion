package com.java8.coding;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class PrintDuplicateElement {
    public static void main(String [] args){
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        HashSet<String> hashSet = new HashSet<>();
        List<String> collectDuplicate = listOfStrings.stream().filter(a -> !hashSet.add(a)).collect(Collectors.toList());
        System.out.println(collectDuplicate);

        List<String> list1 = listOfStrings.stream().filter(a -> Collections.frequency(listOfStrings, a) > 1).distinct().toList();
        System.out.println(list1);

        List<Integer> list = Arrays.asList(1,2,3,5,3,2,7,3);
        List<Integer> collectList = list.stream().filter(n -> Collections.frequency(list, n) > 1).distinct().collect(Collectors.toList());
        System.out.println(collectList);
    }
}
