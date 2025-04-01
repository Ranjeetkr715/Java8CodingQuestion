package com.java8.coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DecimalSortingInReverseOrder {
    public static void main(String [] args){
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        decimalList.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("================================");
        decimalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
    }
}
