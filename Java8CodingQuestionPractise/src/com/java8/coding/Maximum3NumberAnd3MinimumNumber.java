package com.java8.coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Maximum3NumberAnd3MinimumNumber {
    public static void main(String [] args){
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        listOfIntegers.stream().sorted(Comparator.naturalOrder()).limit(3).forEach(System.out::println);
        System.out.println("===========");
        listOfIntegers.stream().sorted(Comparator.naturalOrder()).skip(listOfIntegers.size()-3).forEach(System.out::println);
    }
}
