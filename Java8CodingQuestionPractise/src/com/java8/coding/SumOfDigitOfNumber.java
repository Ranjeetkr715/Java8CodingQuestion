package com.java8.coding;

import java.io.InputStream;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumOfDigitOfNumber {
    public static void main(String [] args){
        int i = 15623;
        Integer collected = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(collected);
    }
}
