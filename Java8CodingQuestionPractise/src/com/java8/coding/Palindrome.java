package com.java8.coding;

import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String [] args){
        String str = "madam";
        boolean b = IntStream.range(0, str.length()).allMatch(i -> str.charAt(i) == str.charAt(str.length() - 1 - i));
        System.out.println(b);

        String str1 = "A man a plan a canal Panama".replace(" ","").toLowerCase();
        boolean word = IntStream.range(0, str.length()).allMatch(i -> str.charAt(i) == str.charAt(str.length() - 1 - i));
        System.out.println(word);


    }
}
