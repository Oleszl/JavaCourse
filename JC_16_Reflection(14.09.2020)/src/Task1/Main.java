package Task1;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {

        Class employeeClass = Class.forName("Task1.Employee");

        Field someField = employeeClass.getField("salary");
        System.out.println("Type of salary field is:" + someField.getType());

        Field[] allField = employeeClass.getDeclaredFields();
        for (Field allFiels: allField){
            System.out.println("Type of " + allFiels.getName() + "= " + allFiels.getType());
        }

        Method someMethod = employeeClass.getMethod("setSalary", double.class);

        System.out.println("Return type of method setSalary = " + someMethod.getReturnType() + ", " +
                "parameters type: " + Arrays.toString(someMethod.getParameterTypes()));

        Constructor constructor = employeeClass.getConstructor(String.class,String.class,double.class);
        System.out.println("Constructor has " + constructor.getParameterCount() + "parameters, their types are:" +
                Arrays.toString(constructor.getParameterTypes()));
    }
}
