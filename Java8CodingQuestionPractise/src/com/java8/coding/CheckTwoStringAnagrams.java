package com.java8.coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckTwoStringAnagrams {
    public static void main(String [] args){
        String s1 = "RaceCar";
        String s2 = "CarRace";
        String collect1 = Stream.of(s1.split("")).map(a -> a.toUpperCase()).sorted().collect(Collectors.joining());
        String collect2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        if(collect1.equals(collect2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not an Anagram");
        }
    }
}
