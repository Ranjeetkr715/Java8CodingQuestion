package com.java8.coding;

import java.util.stream.IntStream;

public class Print10evenNumber {
    public static void main(String [] args){
        IntStream.rangeClosed(1,10).map(a->a*2).forEach(System.out::println);
    }
}
