package com.company;

public class Main {

    public static void main(String[] args) {
        Collection collection = new Collection();
        collection.task1.task1();

        collection.task2.task2();

        var iterator1 = new Iterator() {
            int index = collection.array.length - 1;

            @Override
            public boolean hasNext() {
                if (index >= 0) {
                    return true;
                }
                return false;
            }

            @Override
            public Number next() {
                Number element = collection.array[index];
                index -= 3;
                return element;
            }

            void task3() {

                System.out.println();
                for (int i = index; i >= 0; i -= 3) {
                    System.out.print(next() + " ");
                }
            }
        };

        System.out.print("\n Task 3: ");
        iterator1.task3();

        var iterator2 = new Iterator() {

            int index = 0;

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
                index+=5;
                return element;
            }

            public void task4(){
                while (hasNext()) {

                    System.out.print(next() + " ");
                }
            }
        };

        System.out.println("\n Task 4: ");

        iterator2.task4();

        System.out.println("\nTask 5:  ");
        Collection.task5 task5 = new Collection.task5();
        task5.task5();
    }




    }

