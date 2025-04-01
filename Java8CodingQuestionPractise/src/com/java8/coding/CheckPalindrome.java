package com.java8.coding;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CheckPalindrome {
    public static void main(String [] args){
        String str = "ROTATOR";
        boolean noneMatch = IntStream.rangeClosed(0, str.length() - 1).noneMatch(i -> str.charAt(i) != str.charAt(str.length() - 1 - i));
        System.out.println(noneMatch);
    }
}
