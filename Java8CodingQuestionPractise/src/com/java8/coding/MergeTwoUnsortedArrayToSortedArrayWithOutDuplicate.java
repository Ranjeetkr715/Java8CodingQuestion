package com.java8.coding;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArrayToSortedArrayWithOutDuplicate {
    public static void main(String [] args){
        int[] a = new int[] {4, 2, 5, 1};
        int[] b = new int[] {8, 1, 9, 5};

        int[] mergeWithOutDuplicate = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).distinct().sorted().toArray();
        System.out.println(Arrays.toString(mergeWithOutDuplicate));
    }
}
