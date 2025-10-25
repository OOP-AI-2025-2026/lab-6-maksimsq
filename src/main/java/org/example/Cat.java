package org.example;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        return "Meow Meow Meow";
    }
}