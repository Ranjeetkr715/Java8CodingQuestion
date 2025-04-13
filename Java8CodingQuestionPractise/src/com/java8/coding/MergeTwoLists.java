package com.java8.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeTwoLists {
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(1,2,3);
        List<Integer> list1 = Arrays.asList(5,6);
        Stream.of(list,list1).flatMap(List::stream).forEach(System.out::println);
    }
}
