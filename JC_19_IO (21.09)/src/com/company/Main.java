package com.company;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "Oles", 15000);
        Employee emp2 = new Employee(2, "Nazar", 17000);
        Employee emp3 = new Employee(3, "Orest", 12000);
        Methods method = new Methods();

        method.serialize(emp1);
        method.deserialize();

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        method.serializeList(employeeList);
        method.deserializeList();




    }
}
