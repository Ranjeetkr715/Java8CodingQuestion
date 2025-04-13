package com.java8.coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHigestSalary {
    public static void main(String [] args){
        List<Integer> listOfSalary = Arrays.asList(2000,4200,1500,5432);
        Integer integer = listOfSalary.stream().sorted().skip(1).findFirst().get();
        System.out.println(integer);

        Integer integer1 = listOfSalary.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(integer1);
    }
}
