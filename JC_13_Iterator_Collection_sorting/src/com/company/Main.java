package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        VerkhovnaRada vr = new VerkhovnaRada();


        showMenu();
        test(vr);



    }
    public static void test(VerkhovnaRada vr){
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        do {
            System.out.println("Введіть номер: ");
            value = scanner.nextInt();
             vr = new VerkhovnaRada();
            Fraction f = new Fraction("q");
            switch (value) {
                case 1:
                    vr.addFraction();
                    break;
                case 2:
                    vr.removeFraction();
                    break;
                case 3:
                    vr.showAllFraction();
                    break;
                case 4:
                    vr.deleteAllDelegateFromFraction();


                    break;
                case 5:
                    //vr.printDelegatgeFromSomeFraction();
                    break;
                case 6:
                    vr.addDelegateToFraction();
                    break;
                case 7:
                    vr.removeDelegateFromFraction();
                    break;
                case 8:
                    f.bribeCheck();
                    break;
                case 9:
                    f.maxDelegateBribe();
                    break;
                case 10:
                    f.showAllDelegate();
                    break;
            }
        }
        while (value != 10);
    }

    public static void showMenu() {
        System.out.println("1. Введіть 1 щоб додати фракцію\n" +
                "2. Введіть 2 щоб видалити конкретну фракцію\n" +
                "3. Введіть 3 щоб вивести всі фракції\n" +
                "4. Введіть 4 щоб очистити конкретну фракцію \n" + "" +
                "5. Введіть 5 щоб вивести конкретну фракцію\n " +
                "6. Введіть 6 щоб додати депутата в фракцію\n" +
                "7. Введіть 7 щоб видалити депутата з фракції\n" +
                "8. Введіть 8 щоб вивести список хабарників\n" +
                "9. Введіть 9 щоб вивести найбільшого хабарника");
    }
}
