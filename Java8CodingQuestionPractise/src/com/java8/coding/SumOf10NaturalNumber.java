package com.java8.coding;

import java.util.stream.IntStream;

public class SumOf10NaturalNumber {
    public static void main(String [] arg){
        int sum = IntStream.range(0,11).sum();
        System.out.println(sum);
    }
}
