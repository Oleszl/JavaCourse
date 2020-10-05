package com.company;

import Task1.Employee;
import Task1.SalaryComparator;
import Task2.Commodity;
import com.sun.source.tree.Tree;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Employee> employeeSet = new LinkedHashSet<>();
        Employee employee1 = new Employee("Oles", "Sukmanovskyi", 25000);
        Employee employee2 = new Employee("Nazar", "Kovalchuk", 35000);
        Employee employee3 = new Employee("Oleg", "Bodnar", 14000);
        Employee employee4 = new Employee("Oleg2", "Bodnar2", 7000);
        Employee employee5 = new Employee("Oleg3", "Bodnar3", 2000);
        Employee employee6 = new Employee("Oleg4", "Bodnar4", 8950);

        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);
        employeeSet.add(employee4);
        employeeSet.add(employee5);
        employeeSet.add(employee6);

        TreeSet<Employee> treeSet = new TreeSet<>(employeeSet);

        List<Employee> list = new ArrayList<Employee>(treeSet);
        list.sort(new SalaryComparator());

        System.out.println("No Sorted list: " + employeeSet);
        System.out.println("Sorted list(lastname): " + treeSet);
        System.out.println("Sorted list(salary): " + list);




        //Tast 2
        Commodity commodity = new Commodity();

        showMenu();
        test(commodity);


    }

    public static void test(Commodity commodity) {
        int value = 0;
        do {
            System.out.println("Input number: ");

            Scanner scanner = new Scanner(System.in);
            value = scanner.nextInt();
            switch (value) {
                case 1:
                    commodity.addItem();
                    break;
                case 2:
                    commodity.removeItem();
                    break;
                case 3:
                    commodity.replaceItem();
                    break;
                case 4:
                    commodity.nameSort();
                    break;
                case 5:
                    commodity.heightSort();
                    break;
                case 6:
                    commodity.widthSort();
                    break;
                case 7:
                    commodity.weightSort();
                    break;
                case 8:
                    commodity.printItem();
                    break;

                case 9:
                    commodity.showAllList();
                    break;
                case 10:commodity.exit();
            }
        }
        while (value != 11);


    }

    public static void showMenu() {
        System.out.println("1. Input 1 to add an item\n" +
                "2. Input 2 to delete an item \n" +
                "3. Input 3 to replace an item \n" +
                "4. Input 4 to sort by name \n" + "" +
                "5. Input 5 to sort by height\n " +
                "6. Input 6 to sort by width \n" +
                "7. Input 7 to sort by weight \n" +
                "8. Input 8 to show i-element\n" +
                "9. Input 9 to show all item\n" +
                "10. Input 10 to exit!");
    }
}
