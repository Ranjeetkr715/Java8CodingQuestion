package com.java8.coding;

public class CreatingThreadUsingJava8 {

    public static void main(String [] args){
        new Thread(()-> System.out.println("hello world")).start();
    }
}
