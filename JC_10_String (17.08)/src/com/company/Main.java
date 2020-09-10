package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(palindrom());


        replaceVowels();
        wordsCount();
        checkCountOfWordsInSentences();
    }

    public static boolean palindrom() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Palindrom Value: ");
        String value = scan.nextLine();

        if (value == null)
            return false;
        if (value.length() > 5)
            return false;

        int n = value.length();
        for (int i = 0; i < (n / 2); ++i) {
            if (value.charAt(i) != value.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void replaceVowels() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Replace Value: ");
        String value = scan.nextLine();
        System.out.println("Before replace: " + value);
        System.out.println("After replace: " + value.replaceAll("[aeiouy]", "-"));

    }

    public static void wordsCount() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write sentences: ");
        String value = scan.nextLine();
        int count = 0;

        if (value.length() != 0) {
            count++;

            for (int i = 0; i < value.length(); i++) {
                if (value.charAt(i) == ' ') {
                    count++;
                }
            }
        }

        System.out.println("Your string value contains " + count + " words");
    }

    public static void checkCountOfWordsInSentences(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Write sentences: ");
        String value = scan.nextLine();
        int count = 0;

        if (value.length() != 0) {
            count++;

            for (int i = 0; i < value.length(); i++) {
                if (value.charAt(i) == ' ') {
                    count++;
                }
            }
        }

        System.out.println("Your string value contains " + count + " sentences");
    }

}
