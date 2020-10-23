package com.company;

public class Collection {
    Number[] array = {14, 7, 8, 9, 3, 2, 7, 8, 2, 10};

    Task1 task1 = new Task1();
    Task2 task2 = new Task2();

    public class Task1 implements Iterator {
        int index = 0;

        @Override
        public boolean hasNext() {


            if (index < array.length) {
                return true;

            }
            return false;
        }

        @Override
        public Number next() {
            Number element = array[index];
            index++;
            return element;
        }

    }

    public class Task2 implements Iterator {
        int index = array.length - 1;

        @Override
        public boolean hasNext() {
            if (index >= 0) {
                return true;
            }
            return false;
        }

        @Override
        public Number next() {
            Number element = array[index];
            index -= 2;
            return element;
        }

    }

    public static class task5 implements Iterator {


        Collection collection = new Collection();
        int index = collection.array.length - 1;

        @Override
        public boolean hasNext() {


            if (index < collection.array.length) {
                return true;

            }
            return false;
        }

        @Override
        public Number next() {
            Number element = collection.array[index];
            index -= 2;
            return element;
        }

    }

}










