package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        final int SIZE = 10;
        Integer[] masInteger = {5, 8, 7, 59, 51, 2, 6, 9, 99, 4484};


        Arrays.sort(masInteger, Collections.reverseOrder());
        System.out.println(Arrays.toString(masInteger));

        Arrays.sort(masInteger);
        System.out.println(Arrays.toString(masInteger));


    }
}
