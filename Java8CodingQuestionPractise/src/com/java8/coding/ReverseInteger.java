package com.java8.coding;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseInteger {
    public static void main(String [] args){
        int[] array = new int[] {5, 1, 7, 3, 9, 6};
        System.out.println(Arrays.toString(IntStream.rangeClosed(1, array.length).map(a -> array[array.length - a]).toArray()));

    }
}
