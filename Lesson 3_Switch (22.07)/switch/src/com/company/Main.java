package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String dayOfWeek = null;
        System.out.print("Введіть день тижня: ");
        dayOfWeek=scan.nextLine();
        scan.close();

        switch (dayOfWeek.toLowerCase()){
            case "понеділок":
                System.out.println("1.Сходити в магазин за покупками на тиждень\n" +
                        "2. Прибрати в квартирі\n" +"3. Зустрітися з друзями");
                break;
            case "вівторок":
                System.out.println("1. Ранкова зарядка та пробіжка\n"+
                        "2. Прибрати в квартирі\n"+"3. Провідати батьків");
                break;
            case "середа":
                System.out.println("1. Ранкова зарядка та пробіжка\n"+
                        "2. Сходити на вечір гри “мафія” з дресс-кодом");
                break;
            case "четвер":
                System.out.println("1. Ранкова зарядка та пробіжка\n"+
                        "2. Купити карамельний попкорн і піти в кіно");
                break;
            case "п\'ятниця":
                System.out.println("1. Ранкова зарядка та пробіжка\n"+"2. Піти на ковзанку");
                break;
            case "субота":
                System.out.println("Прибрати в квартирі");
                break;
            case "неділя":
                System.out.println("1. Ранкова зарядка та пробіжка\n"+"2. Провідати батьків");
                break;

            default:
                System.out.println("День тижня вказано невірно!");
        }
    }
}
