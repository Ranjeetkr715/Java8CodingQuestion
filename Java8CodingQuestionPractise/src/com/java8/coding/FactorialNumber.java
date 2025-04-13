package com.java8.coding;

import java.util.stream.IntStream;

public class FactorialNumber {
    public static void main(String [] args){
        int number=5;
        int reduce = IntStream.rangeClosed(1, number).reduce(1, (a, b) -> a * b);
        System.out.println(reduce);

    }
}
