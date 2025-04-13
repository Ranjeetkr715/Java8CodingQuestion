package com.java8.coding;

import java.util.Arrays;
import java.util.List;

public class MultipleFilterUsingSingleStream {
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,15,18,20,23,27);
        list.stream().filter(a-> a % 5==0).filter(b -> b %3 ==0).forEach(System.out::println);
    }
}
