package com.java8.realtimeQuestion;

public class DiamondProblemMainWhenMethodPublicMethod implements A,B{

    @Override
    public void display() {
        System.out.println("hello Diamond problem");
    }

    @Override
    public void getSalary() {
        A.super.getSalary();
     System.out.println("Hello World");
    }

    public static void main(String [] args){
        DiamondProblemMainWhenMethodPublicMethod diamondProblemMainWhenMethodPublicMethod= new DiamondProblemMainWhenMethodPublicMethod();
        diamondProblemMainWhenMethodPublicMethod.display();

        diamondProblemMainWhenMethodPublicMethod.getSalary();
    }

}
