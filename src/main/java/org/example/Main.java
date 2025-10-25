package org.example;

public class Main {
    public static void main(String[] args) {
        // task 1
        Dog dog = new Dog("Milo");
        Cat cat = new Cat("Rocky");
        System.out.println(dog.getName() + " says: " + dog.makeSound());
        System.out.println(cat.getName() + " says: " + cat.makeSound());

        // task 2
        Point p = new Point(10, 20);
        p.printCoordinates();

        p.moveTo(13, 25);
        p.printCoordinates();

        // task 3
        Smartphone phone = new Smartphone("Samsung Galaxy S25 ULTRA", 47.0105, 28.8638);

        phone.printCoordinates();
        phone.makeCall();
        phone.receiveCall();

        // task 4
        Car car1 = new Car(23000, 2016, 250);
        Car car2 = new Car(21000, 2022, 190);
        Car car3 = new Car(19000, 2019, 165);

        System.out.println("car1 vs car2 = " + car1.compareTo(car2));
        System.out.println("car1 vs car3 = " + car1.compareTo(car3));
        System.out.println("car2 vs car3 = " + car2.compareTo(car3));
    }
    }