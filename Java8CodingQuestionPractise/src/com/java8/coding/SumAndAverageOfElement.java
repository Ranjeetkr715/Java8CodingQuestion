package com.java8.coding;

import java.util.Arrays;

public class SumAndAverageOfElement {
    public static void main(String [] args){
        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
        int sum = Arrays.stream(a).sum();
        System.out.println(sum);
        double average = Arrays.stream(a).average().getAsDouble();
        System.out.println(average);

    }
}
