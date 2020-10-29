package com.company;

import java.io.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.time.*;
import java.util.Date;

public class Main {

    public Main() throws ClassNotFoundException, IOException {
    }

    public static void main(String[] args) throws ClassNotFoundException, IOException, NoSuchFieldException, IllegalAccessException {
        Date date = new Date();
        System.out.println(localDate(date));
        System.out.println(localDateTime(date));

        Xiaomi xiaomi = new Xiaomi("Redmi note 5", 6000);
        Iphone iphone = new Iphone("X", 20000);

        Class iphoneClass = Class.forName("com.company.Iphone");

        Field[] fields = iphoneClass.getDeclaredFields();


        try (BufferedWriter writer = new BufferedWriter
                (new FileWriter("text.txt"))) {
            for (Field field : fields) {
                if (field.isAnnotationPresent(SaveToFile.class))
                    field.setAccessible(true);
                writer.write(String.valueOf(field.get(iphone)) + " ");

            }
        }

        Class xiaomiClass = Class.forName("com.company.Xiaomi");

        Field[] fields1 = xiaomiClass.getDeclaredFields();


        try (BufferedWriter writer = new BufferedWriter
                (new FileWriter("text.txt", true))) {
            for (Field field : fields1) {
                if (field.isAnnotationPresent(SaveToFile.class))
                    field.setAccessible(true);
                writer.write(String.valueOf(field.get(xiaomi)) + " ");

            }
        }

    }


    public static LocalDate localDate(Date date) {
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return localDate;
    }

    public static LocalDateTime localDateTime(Date dateToConvert) {
        return Instant.ofEpochMilli(dateToConvert.getTime())
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }
}
