package com.testSkills;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeClass {
    private  String firstName;
    private String lastName;
    private int age;

    public EmployeeClass(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "EmployeeClass{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        EmployeeClass e1 = new EmployeeClass("Baskar","R",30);
        EmployeeClass e2 = new EmployeeClass("Madhu","B",27);
        EmployeeClass e3 = new EmployeeClass("Papa","B",1);
        List<EmployeeClass> list = new ArrayList<EmployeeClass>();
        list.add(e1);
        list.add(e2);
        list.add(e3);

       /*System.out.println(list.
               stream().
               filter(employeeClass -> employeeClass.getAge() >25).
               collect(Collectors.toList()));
 */
       System.out.println(list.stream().mapToInt(value -> value.getAge() ).sum());



    }
}
