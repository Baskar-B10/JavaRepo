package com.testSkills;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FilterBySecondMaxSalary {

    private  String name;
    private double salary;
    private int id;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public FilterBySecondMaxSalary(String name, double salary, int id, String gender) {
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.gender = gender;
    }

    public static void main(String[] args) {
        FilterBySecondMaxSalary e1= new FilterBySecondMaxSalary("Bass",10000,1,"Male");
        FilterBySecondMaxSalary e2= new FilterBySecondMaxSalary("Madhu",12000,2,"Female");
        FilterBySecondMaxSalary e3= new FilterBySecondMaxSalary("Divya",13000,3,"Female");
        FilterBySecondMaxSalary e4= new FilterBySecondMaxSalary("radhi",12500,4,"Female");
        List<FilterBySecondMaxSalary> list= new ArrayList<FilterBySecondMaxSalary>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

    Optional<Double> maxSalarySecond=list.stream()
                .filter(e-> e.getGender().equals("Female"))
                .map(FilterBySecondMaxSalary::getSalary)
                .sorted(Comparator.reverseOrder()).skip(1).findFirst();


        System.out.println(maxSalarySecond);

        Optional<String> c=list.stream().
                filter(e-> e.getSalary()== maxSalarySecond.get())
                .map(FilterBySecondMaxSalary::getName).findFirst();

        System.out.println(c.get());

    }
}
