package com.java8.coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestWordInList {
    public static void main(String [] args){
        List<String> list = Arrays.asList("RanjeetKR", "Sanjit", "vaanya", "Nishant", "Suchit","bob");
        String s = list.stream().max(Comparator.comparing(String::length)).orElse(null);
        System.out.println(s);
    }
}
