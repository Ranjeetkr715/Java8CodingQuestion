package com.java8.coding;

import java.util.stream.Stream;

public class InfiniteLoopWithLimit20 {
    public static void main(String [] args){
        Stream.iterate(0,n -> n+2).limit(10).forEach(System.out::println);
         System.out.println("======================================");
        Stream.iterate(0,a -> a<10, a -> a+2).forEach(System.out::println);
    }
}
