package oop_practice.cat_dog.dog;

import oop_practice.cat_dog.animal.Animal;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("I'am a Dog. My name is " + super.getName() + ". Gav");
    }
}
