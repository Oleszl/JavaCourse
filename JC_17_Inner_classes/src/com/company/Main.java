package com.company;

public class Main {

    public static void main(String[] args) {
        Collection collection = new Collection();
        while (collection.task1.hasNext()) {
            if (collection.task1.index % 2 != 0) {
                collection.array[collection.task1.index] = 0;
            }
            System.out.print(collection.task1.next() + " ");
        }

        System.out.println("\nTask 2:");

        for (int i = collection.task2.index; i >= 0; i -= 2) {
            System.out.print(collection.task2.next() + " ");
        }


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
                index += 5;
                return element;
            }

            public void task4() {
                while (hasNext()) {

                    System.out.print(next() + " ");
                }
            }
        };

        System.out.println("\n Task 4: ");
        iterator2.task4();

        System.out.println("\nTask 5:  ");
        Collection.task5 task5 = new Collection.task5();

        for (int i = task5.index; i >= 0; i -= 2) {
            Integer integer = (Integer) task5.next();
            if (integer % 2 == 0)
                task5.collection.array[i] = 99;
            System.out.print(task5.collection.array[i] + " ");
        }

    }
}
