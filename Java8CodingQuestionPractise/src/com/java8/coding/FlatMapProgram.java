package com.java8.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapProgram {
    public static void main(String [] args){
        List<List<Integer>> list = Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5),Arrays.asList(6,7,8),Arrays.asList(8,9));
        List<Integer> collect = list.stream().flatMap(a -> a.stream()).collect(Collectors.toList());
        System.out.println(collect);
        collect.stream().distinct().forEach(System.out::println);
    }
}
