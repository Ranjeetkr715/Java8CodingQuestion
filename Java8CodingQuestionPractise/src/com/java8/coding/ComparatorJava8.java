package com.java8.coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorJava8 {
    public static void main(String [] args){
        List<String> list = Arrays.asList("java", "lambda", "kafka");

        list.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }
}
