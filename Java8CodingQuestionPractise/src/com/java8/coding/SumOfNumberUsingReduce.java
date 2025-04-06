package com.java8.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfNumberUsingReduce {
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Integer reduce = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduce);
        System.out.println(list.stream().mapToInt(Integer::intValue).sum());
        System.out.println(list.stream().collect(Collectors.summingInt(a->a)));
        System.out.println(list.stream().collect(Collectors.summarizingInt(a->a)).getSum());
    }
}
