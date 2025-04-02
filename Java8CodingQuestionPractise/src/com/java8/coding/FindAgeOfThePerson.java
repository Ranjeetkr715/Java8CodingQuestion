package com.java8.coding;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FindAgeOfThePerson {
    public static void main(String [] args){
        LocalDate birthDay = LocalDate.of(1996, 02, 12);
        LocalDate currentDate= LocalDate.now();
         System.out.println(ChronoUnit.YEARS.between(birthDay,currentDate));
    }
}
