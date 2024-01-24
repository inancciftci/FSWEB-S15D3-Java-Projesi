package com.inanc.company;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Collection<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "İnanç", "Çiftci"));
        employees.add(new Employee(2, "Tuğsem", "Hope"));
        employees.add(new Employee(3, "Ayten", "Çiftci"));
        employees.add(new Employee(4, "Aziz", "Çiftci"));
        employees.add(new Employee(5, "İrem", "Bahtiyar"));
        employees.add(new Employee(1, "İnanç", "Çiftci"));
        employees.add(new Employee(2, "Tuğsem", "Hope"));

        Collection<Employee> duplicateEmployees = new LinkedList<>();
        HashMap<Integer, Employee> uniqueEmployees = new HashMap<>();

        Iterator<Employee> iterator = employees.iterator();
        while(iterator.hasNext()){
            Employee currentEmployee = iterator.next();

            if(!uniqueEmployees.containsKey(currentEmployee.getId())) {
                uniqueEmployees.put(currentEmployee.getId(), currentEmployee);
            } else {
                duplicateEmployees.add(currentEmployee);
                iterator.remove();
            }
        }

        System.out.println(employees);
        System.out.println(duplicateEmployees);
        System.out.println(uniqueEmployees);
    }

}
