package com.java8.realtimeQuestion;

import java.util.*;
import java.util.stream.Collectors;

public class StudentMainClass {
    public static void main(String [] args){
        Map<Integer, Student> map = new HashMap<>();
        map.put(1, new Student(1, "Ranjeet", "Delhi", 34000));
        map.put(2, new Student(2, "Amit", "Mumbai", 42000));
        map.put(3, new Student(3, "Suman", "Bangalore", 39000));
        map.put(4, new Student(4, "Neha", "Chennai", 36000));
        map.put(5, new Student(5, "Neha", "Chennai", 36000));

        //Write a program to sort a Map<Integer, Employee> based on the city field in descending order using Java Stream API.
        map.entrySet().stream().sorted((a, b) -> b.getValue().getCity().compareTo(a.getValue().getCity())).forEach(System.out::println);

        System.out.println("====================================================");

        //  How would you convert the sorted Stream of map entries into a LinkedHashMap to maintain the sorted order?
        LinkedHashMap<Integer, Student> collect = map.entrySet().stream().sorted((a, b) -> b.getValue().getCity().compareTo(a.getValue().getCity())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(collect);

        System.out.println("====================================================");
       //Modify the code to sort by city in descending order and then by salary in ascending order.
         map.entrySet().stream().sorted(Comparator.comparing((Map.Entry<Integer,Student> e) -> e.getValue().getCity()).reversed().thenComparing(e -> e.getValue().getSalary())).forEach(entry->System.out.println(entry.getKey() +"  "+ entry.getValue()));
        System.out.println("====================================================");

      //Given a list of Employee objects, group them by city using Stream API.
        map.keySet().stream().forEach(System.out::println);
        map.values().stream().forEach(System.out::println);

        map.values().stream().collect(Collectors.groupingBy(Student::getCity,Collectors.counting())).forEach((k,v)-> System.out.println(k +" "+v));
        Map<String, List<Student>> collect1 = map.values().stream().collect(Collectors.groupingBy(Student::getCity));
       System.out.println(collect1);

        System.out.println("====================================================");
      //Filter all employees with a salary greater than 35,000 and sort them by name.
        List<Map.Entry<Integer, Student>> collect2 = map.entrySet().stream().filter(a -> a.getValue().getSalary() > 35000).sorted(Comparator.comparing((Map.Entry<Integer, Student> e) -> e.getValue().getName())).collect(Collectors.toList());
        System.out.println(collect2);

        collect2.stream().map(entry -> entry.getKey() +" "+ entry.getValue()).forEach(System.out::println);

        System.out.println("====================================================");
       //Write code to find the employee with the highest salary using Stream API.
        Student student = map.values().stream().max(Comparator.comparing(st -> st.getSalary())).get();
        System.out.println(student);

        System.out.println("====================================================");
       //Count How Many Employees Are in Each City
        Map<String, Long> countByCity = map.values().stream().collect(Collectors.groupingBy(emp -> emp.city, Collectors.counting()));
        countByCity.forEach((city, count) -> System.out.println(city + ": " + count));

        System.out.println("====================================================");
     // Remove All Entries Where Salary < 35,000 Using Streams
        boolean b = map.entrySet().removeIf(sal -> sal.getValue().getSalary() < 35000);
        System.out.println(b);

        System.out.println("====================================================");
       //Convert Map Values to List of Names Sorted Alphabetically
        List<String> collect3 = map.values().stream().map(a -> a.getName()).sorted().collect(Collectors.toList());
        System.out.println(collect3);

        System.out.println("====================================================");

       //Convert List<Employee> to Map<Integer, Employee> (Key: id)
        List<Student> students = List.of(
                new Student(1, "Ranjeet", "Delhi", 34000),
                new Student(2, "Amit", "Mumbai", 42000),
                new Student(3, "Suman", "Bangalore", 39000)
        );

        Map<Integer, Student> collect4 = students.stream().collect(Collectors.toMap(emp -> emp.getId(), emp -> emp));
        System.out.println(collect4);

    }
}
