package com.java8.coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DuplicateElementFromArray {
    public static void main(String [] args){
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        HashSet<Integer> unique = new HashSet<>();
        listOfIntegers.stream().filter(a -> !unique.add(a)).forEach(System.out::println);
    }
}
