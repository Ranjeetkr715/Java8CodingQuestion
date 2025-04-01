package com.java8.coding;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWordOfString {
    public static void main(String [] args){
        String str = "Java Concept Of The Day";
        System.out.println(Stream.of(str.split(" ")).map(a-> new StringBuffer(a).reverse()).collect(Collectors.joining(" ")));
    }
}
