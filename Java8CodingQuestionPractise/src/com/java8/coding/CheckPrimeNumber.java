package com.java8.coding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CheckPrimeNumber {
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> booleanListMap = list.stream().collect(Collectors.partitioningBy(a -> isPrime(a)));
        System.out.println(booleanListMap);

        Map<Boolean, List<Integer>> booleanListMap1 = IntStream.range(1,20).boxed().collect(Collectors.partitioningBy(b -> isPrime(b)));
        System.out.println(booleanListMap1);
    }

    private static boolean isPrime(Integer a) {
        if(a<2){
            return false;
        }
        return IntStream.rangeClosed(2, (int) Math.sqrt(a)).noneMatch(n -> a % n == 0);
    }
}
