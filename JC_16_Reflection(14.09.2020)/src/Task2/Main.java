package Task2;

import Task1.Employee;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Employee employee = new Employee("Vitaliy","Bodnar",10999);
        Class employeeClass = employee.getClass();

        Field nameField = employeeClass.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(employee,"Oleg");
        System.out.println(employee);

        Field salaryField =employeeClass.getField("salary");
        salaryField.setAccessible(true);
        salaryField.set(employee,99999.9);
        System.out.println(employee);

        Method myMethod = employeeClass.getMethod("myMethod", String.class);
        myMethod.invoke(employee,"Some text");

        Method myMethod2 = employeeClass.getMethod("myMethod", String.class, int.class);
        myMethod2.invoke(employee,"Some text 2",85);


    }
}
