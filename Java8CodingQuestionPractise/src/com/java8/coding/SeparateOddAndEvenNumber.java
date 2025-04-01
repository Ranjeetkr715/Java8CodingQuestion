package com.java8.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SeparateOddAndEvenNumber {
    public static void main(String [] args){
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        List<Integer> evenCollection = listOfIntegers.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
        System.out.println(evenCollection);
        List<Integer> oddCollection = listOfIntegers.stream().filter(a -> a % 2 != 0).collect(Collectors.toList());
        System.out.println(oddCollection);
    }
}
