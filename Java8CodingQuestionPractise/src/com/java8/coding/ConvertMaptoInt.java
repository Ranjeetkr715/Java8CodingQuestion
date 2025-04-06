package com.java8.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertMaptoInt {
    public static void main(String [] args){
        List<String> list = Arrays.asList("java", "lambda", "kafka");
        list.stream().mapToInt(String::length).forEach(System.out::println);
        list.stream().map(String::length).forEach(System.out::println);

    }
}
