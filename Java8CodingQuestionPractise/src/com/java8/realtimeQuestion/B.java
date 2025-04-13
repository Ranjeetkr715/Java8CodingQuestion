package com.java8.realtimeQuestion;

public interface B {
    void display();

    default void getSalary(){
        m2();
        System.out.println("Hello Interface B");
    }

    default void m2(){
        System.out.println("Calling B");
    }
}
