package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ZooClub zooClub = new ZooClub();

        showMenu();
        run(zooClub);
    }

    public static void showMenu() {
        System.out.println("List of the functions that you can use:");
        System.out.println("1. Add member to club\n" +
                "2. Add a pet to member of club\n" +
                "3. Delete a pet from member of club\n" +
                "4. Delete  member from club\n" +
                "5. Delete the pet from all member\n" +
                "6. Print Zoo club\n" +
                "7. Exit"
        );

    }

    public static void run(ZooClub zooClub) {

        int value = 0;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Choice operation that you want to use:");
            value = scanner.nextInt();
            switch (value) {
                case 1:
                    zooClub.addClubMember.get();
                    break;

                case 2:
                    zooClub.addAnimalToClubMember.get();
                    break;

                case 3:
                    zooClub.deleteAnimalFromPerson();

                    break;
                case 4:
                    zooClub.deleteMemberFromZooClub();
                    break;

                case 5:
                   // zooClub.deleteAnimalFromPerson();

                    break;

                case 6:
                    zooClub.showZooClub();
                    break;

                case 7:
                    System.exit(1);
                    break;
            }
        }
        while (value != 10);
    }
}
