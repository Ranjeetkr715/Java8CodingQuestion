package com.java8.realtimeQuestion;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeListMainMethod {
    public static void main(String [] args){
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


       //How many male and female employees are there in the organization?
        //!st Way
        long male = employeeList.stream().filter(g -> g.getGender().equals("Male")).count();
        System.out.println(male);
        long female = employeeList.stream().filter(g -> g.getGender().equals("Female")).count();
        System.out.println(female);
        System.out.println("======================================");
        //2nd Way
        Map<String, Long> noOfMaleAndFemale = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(noOfMaleAndFemale);


        System.out.println("**********************************************************************************************");

        // Print the name of all departments in the organization?
        List<String> collectionOfDepartment = employeeList.stream().map(emp -> emp.getDepartment()).distinct().collect(Collectors.toList());
        System.out.println(collectionOfDepartment);

        System.out.println("**********************************************************************************************");

       // What is the average age of male and female employees?
        Map<String, Double> averageAgeOfMaleAndFemale = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
         System.out.println(averageAgeOfMaleAndFemale);

        System.out.println("**********************************************************************************************");

         //Get the details of highest paid employee in the organization?
        Employee employee = employeeList.stream().max(Comparator.comparing(Employee::getSalary)).get();
        System.out.println(employee);

        System.out.println("**********************************************************************************************");
       //Get the names of all employees who have joined after 2015?
       employeeList.stream().filter(a -> a.getYearOfJoining()>2015).map(b->b.getName()).forEach(System.out::println);

        System.out.println("**********************************************************************************************");
       //Count the number of employees in each department?
        Map<String, Long> noOfEmployee = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(noOfEmployee);

        System.out.println("**********************************************************************************************");

        //What is the average salary of each department?
        Map<String, Double> averageOfDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(averageOfDepartment);

        System.out.println("**********************************************************************************************");

        //Get the details of youngest male employee in the product development department?
        Employee youngestMale = employeeList.stream().filter(em -> em.getGender().equals("Male") && em.getDepartment().equals("Product Development")).sorted(Comparator.comparing(Employee::getAge)).findFirst().get();
        System.out.println(youngestMale);

        System.out.println("**********************************************************************************************");
        //Who has the most working experience in the organization?
       System.out.println(employeeList.stream().min(Comparator.comparing(Employee::getYearOfJoining)).get());

        System.out.println("**********************************************************************************************");
        //How many male and female employees are there in the sales and marketing team?
        Map<String, Long> noOfFemaleAndMaleEmployee = employeeList.stream().filter(em -> em.getDepartment().equals("Sales And Marketing")).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(noOfFemaleAndMaleEmployee);

        System.out.println("**********************************************************************************************");
        //What is the average salary of male and female employees?
        Map<String, Double> averageSalaryOfMaleAndFemale = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(averageSalaryOfMaleAndFemale);

        System.out.println("**********************************************************************************************");
        // List down the names of all employees in each department?
        Map<String, List<Employee>> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        for(Map.Entry<String,List<Employee>> map: collect.entrySet()) {
            System.out.println("=================");
            System.out.println(map.getKey());
            System.out.println("==================");
//            System.out.println(map.getKey() + "   " + map.getValue());
            for (Employee emp : map.getValue()){
                System.out.println(emp.getName());
            }
        }

        System.out.println("**********************************************************************************************");
        // What is the average salary and total salary of the whole organization?
        DoubleSummaryStatistics doubleSummaryStatistics = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Average Salary " + doubleSummaryStatistics.getAverage());
        System.out.println("Sum Of salary " + doubleSummaryStatistics.getSum());

        System.out.println("**********************************************************************************************");
        // Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
        employeeList.stream().filter(emp-> emp.getAge() > 25).map(e ->e.getName()).forEach(System.out::println);
        System.out.println("==================");
        employeeList.stream().filter(emp-> emp.getAge() <= 25).map(e ->e.getName()).forEach(System.out::println);


        System.out.println("**********************************************************************************************");
        // Who is the oldest employee in the organization? What is his age and which department he belongs to?
        Employee employee1 = employeeList.stream().max(Comparator.comparing(Employee::getAge)).get();
        System.out.println(employee1.getName() +"  "+ employee1.getAge() + "   "+employee1.getDepartment());
    }
}
