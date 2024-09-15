package com.testSkills;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterByEmployeeAge {
    public static void main(String[] args) {
        List<Employee> emplist= new ArrayList<Employee>();
        emplist.add(new Employee("Baskar",29));
        emplist.add(new Employee("Senthil",35));
        emplist.add(new Employee("Mahesh",41));
        emplist.add(new Employee("Surya",42));
        List<Employee> reults= new ArrayList<>();
        emplist.forEach(employee -> {
            if (employee.getAge() >40){
                reults.add(employee);
            }
        });

     emplist.stream().
                filter(employee -> employee.getAge() >40).
                collect(Collectors.toList()).forEach(System.out::println);

        reults.forEach(System.out::println);
    }

}

class Employee{

    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
