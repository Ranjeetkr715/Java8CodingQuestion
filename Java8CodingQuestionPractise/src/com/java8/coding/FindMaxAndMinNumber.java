package com.java8.coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxAndMinNumber {
    public static void main(String [] args){
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Integer maxValue = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
        System.out.println(maxValue);
        Integer minValue = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
        System.out.println(minValue);

    }
}
