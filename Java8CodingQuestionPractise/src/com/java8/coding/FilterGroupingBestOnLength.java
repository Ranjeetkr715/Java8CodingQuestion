package com.java8.coding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterGroupingBestOnLength {
    public static void main(String [] args){
        List<String> list = Arrays.asList("Ranjeet", "Sanjit", "vaanya", "Nishant", "Suchit","bob");
        Map<Integer,List<String>> mapGroupingList= list.stream().collect(Collectors.groupingBy(String::length));
         System.out.println(mapGroupingList);
    }
}
