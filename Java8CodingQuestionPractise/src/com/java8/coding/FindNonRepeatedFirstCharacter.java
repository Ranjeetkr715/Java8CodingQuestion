package com.java8.coding;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FindNonRepeatedFirstCharacter {
    public static void main(String [] args){
        String input = "swiss";
        Character character = input.chars().mapToObj(ch -> (char) ch).filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch)).findFirst().get();
        System.out.println(character);

        String input1 = "cxkjgdfbcmxscc";
        Character character1 = input1.chars().mapToObj(ch -> (char) ch).filter(ch -> input1.indexOf(ch) == input1.lastIndexOf(ch)).findFirst().get();
        System.out.println(character1);

    }
}
