package com.java8.coding;

import java.io.InputStream;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArrayToSortedArray {
    public static void main(String [] args){
        int[] a = new int[] {4, 2, 7, 1};
        int[] b = new int[] {8, 3, 9, 5};
        int[] mergeArray = IntStream.concat(Arrays.stream(a).sorted(), Arrays.stream(b).sorted()).sorted().toArray();
        System.out.println(Arrays.toString(mergeArray));
    }
}
