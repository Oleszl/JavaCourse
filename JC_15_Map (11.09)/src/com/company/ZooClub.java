package com.company;

import java.util.*;

public class ZooClub {

    Map<Person, List<Animal>> map;

    public ZooClub() {
        map= new HashMap<>();
    }

    public void addClubMember() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name:");
        String name = scanner.nextLine();
        System.out.println("Input age:");
        int age = scanner.nextInt();

        map.put(new Person(name,age),new ArrayList<>());
    }



    public void addAnimalToClubMember(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name:");
        String name = scanner.nextLine();
        System.out.println("Input age:");
        int age = scanner.nextInt();

        Person person = new Person(name,age);

        scanner.nextLine();

        if (map.containsKey(person)) {

            System.out.println("Input animal type: ");
            String animalType = scanner.nextLine();
            System.out.println("Input animal name: ");
            String animalName = scanner.nextLine();
            map.get(person).add(new Animal(animalType, animalName));
        } else {
            System.out.println("Error this person doesn\'t exist!");
        }
    }

    public void showZooClub() {
        System.out.println(map);
    }

    public void deleteMemberFromZooClub(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name:");
        String name = scanner.nextLine();
        System.out.println("Input age:");
        int age = scanner.nextInt();

        Person person = new Person(name,age);

        if (map.containsKey(person)){
            map.remove(person);
            System.out.println("Person successfully deleted!");
        }
        else
            System.out.println("This person doesn\'t exist");
    }

    public void deleteAnimalFromPerson(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name:");
        String name = scanner.nextLine();
        System.out.println("Input age:");
        int age = scanner.nextInt();

        Person person = new Person(name,age);

        if (map.containsKey(person)){
            scanner.nextLine();
            System.out.println("Input animal type: ");
            String animalType = scanner.nextLine();
            System.out.println("Input animal name: ");
            String animalName = scanner.nextLine();
            Animal animal = new Animal(animalType,animalName);
            map.get(person).remove(map.get(person).indexOf(animal));
        }
        else System.out.println("Animal doesn\'t exist");
    }

    public void deleteAnimalFromAllPerson(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input animal type: ");
        String animalType = scanner.nextLine();


        Set<Person> keySet = map.keySet();
        for (Person key : keySet) {
            ListIterator<Animal> iter = map.get(key).listIterator();
            while (iter.hasNext()) {
                Animal animal = (Animal) iter.next();
                if (animal.getAnimalType().equals(animalType) ) {
                    iter.remove();
                }
            }
        }
        }



}
