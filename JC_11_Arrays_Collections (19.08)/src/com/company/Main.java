package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        final int SIZE = 10;
        Integer[] masInteger = new Integer[SIZE];

        for (int i = 0; i < SIZE; i++) {
            masInteger[i] = (int)(5+Math.random() * 80);
            System.out.print(masInteger[i]+ " ");

        }


        Arrays.sort(masInteger, Collections.reverseOrder());
        System.out.println("\n"+Arrays.toString(masInteger));

        Arrays.sort(masInteger);
        System.out.println(Arrays.toString(masInteger));


    }
}
