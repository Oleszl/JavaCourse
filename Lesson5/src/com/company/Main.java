package com.company;

public class Main {

    public static void main(String[] args) {

        Integer i = 1995833;
        Boolean b = Boolean.FALSE;
        Short s = 1528;

        System.out.println("Integer = " + i + " Boolean = "+b +" Short = " +s);



        System.out.println("Максимальне значення int =" + Integer.MAX_VALUE);
        System.out.println("Мінімальне значення int =" +Integer.MIN_VALUE);
        System.out.println("Мінімальне значення byte =" + Byte.MIN_VALUE);


        System.out.println("Максимальне значення int ="+task2());
        System.out.println("Мінімальне значення int ="+task2()+1);



        task3();
    }

    public static int task2(){
        int x=0;
        for (int i=0;i<Integer.MAX_VALUE;i++){
            if (i>0){
                x=i;
            }
        }
        return x;
    }
    public static void task3() {
        int[] array = new int[10];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("Завдання №3");

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);
            System.out.print(array[i] + " ");
        }


        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
            else if (array[i] > max)
                max = array[i];
        }
                System.out.println("\nМаксимальний елемент масиву = " + max + "");
        System.out.println("Мінімальний елемент масиву = " + min + "");
        System.out.println("Мінімальний елемент масиву = " + min + "");
    }
}
