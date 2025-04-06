package com.java8.coding;

public class SimpleRunnablExample  {
    public static void main(String [] args){
        Runnable r = ()-> System.out.println("Hello Runnable class");
        Thread t = new Thread(r);
        t.start();
    }


}
