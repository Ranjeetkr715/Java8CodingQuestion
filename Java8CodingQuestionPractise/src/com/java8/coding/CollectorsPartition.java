package com.java8.coding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsPartition {
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        Map<Boolean, List<Integer>> booleanListMap = list.stream().collect(Collectors.partitioningBy(a -> a % 2 == 0));
        System.out.println(booleanListMap);
    }
}
