package com.java8.coding;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Java8NonMatcherAnyMatcherAllMatcher {
    public static void main(String [] args){
        //AnyMatcher
        List<String> list = Arrays.asList("Java", "Spring", "lambda");
        boolean anyMatch = list.stream().anyMatch(a -> a.startsWith("J"));
        boolean anyMatch1 = list.stream().anyMatch(a -> a.startsWith("K"));
        System.out.println(anyMatch);
        System.out.println(anyMatch1);

        //All Match
        List<String> list1 = Arrays.asList("Java", "Jpring", "Jambda");
        boolean allMatch = list1.stream().allMatch(a -> a.startsWith("J"));
        boolean allMatch1 = list1.stream().allMatch(a -> a.startsWith("K"));
        System.out.println(allMatch);
        System.out.println(allMatch1);


        //All Match
        List<String> list3 = Arrays.asList("Java", "Jpring", "Jambda");
        boolean noMatch = list3.stream().noneMatch(a -> a.startsWith("J"));
        boolean noMatch1 = list3.stream().noneMatch(a -> a.startsWith("K"));
        System.out.println(noMatch);
        System.out.println(noMatch1);


    }
}
