package com.company;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ZooClub {

    Map<Person, List<Animal>> map;

    public ZooClub() {
        map= new HashMap<>();
    }


    Supplier<List<Animal>> addClubMember = () ->{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name:");
        String name = scanner.nextLine();
        System.out.println("Input age:");
        int age = scanner.nextInt();
        return map.put(new Person(name,age),new ArrayList<>());
    };


    Supplier<Map<Person, List<Animal>>> addAnimalToClubMember = () ->{
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
            System.out.println("Error this person doesn't exist!");
        }
        return map;

    };

    public void showZooClub() {
        System.out.println(map);
    }

    public void  deleteMemberFromZooClub(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name:");
        String name = scanner.nextLine();
        System.out.println("Input age:");
        int age = scanner.nextInt();

        Person person = new Person(name,age);

        map.entrySet().removeAll(map.entrySet().stream().filter(element -> {
            return element.getValue().toString().contains(person.toString());
        }).collect(Collectors.toList()));



    }

    public void deleteAnimalFromPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input animal type: ");
        String animalType = scanner.nextLine();
        System.out.println("Input animal name: ");
        String animalName = scanner.nextLine();
        Animal animal = new Animal(animalType,animalName);


        map.entrySet().removeAll(map.entrySet().stream().filter((element) -> {
            return element.getValue().toString().contains(animal.toString());
        }).collect(Collectors.toList()));
        System.out.println(map);

    }






}
