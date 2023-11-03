package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        // Compare employees based on their names
        return this.name.compareTo(otherEmployee.getName());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                '}';
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("A", 1));
        employees.add(new Employee("B", 2));
        employees.add(new Employee("C", 3));
        employees.add(new Employee("D", 4));
        employees.add(new Employee("E", 5));

       
        Collections.sort(employees);

        
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}