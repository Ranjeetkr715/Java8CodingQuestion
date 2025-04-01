package com.java8.coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringBestOnTheLength {
    public static void main(String [] args){
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        listOfStrings.stream().sorted(Comparator.comparing((String::length))).forEach(s -> System.out.println(s));
        ///largest String
        String reduce = listOfStrings.stream().reduce("", (a, b) -> a.length() > b.length() ? a : b);
        System.out.println(reduce);
    }
}
