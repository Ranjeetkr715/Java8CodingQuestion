package com.java8.realtimeQuestion;

public interface A {
    void display();

    default void getSalary(){
        m1();
        System.out.println("Hello Interface A");
    }

    default void m1(){
        System.out.println("Calling A");
    }
}
