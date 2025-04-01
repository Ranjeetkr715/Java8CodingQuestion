package com.java8.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringJoinConceptOfJava8 {
    public static void main(String [] args){
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String collectJoiningArray = listOfStrings.stream().collect(Collectors.joining(", ", "[", "]"));
        System.out.println(collectJoiningArray);

    }
}
