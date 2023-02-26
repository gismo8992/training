package org.example.practice9.Inheritance;

public class Dog extends Animal{

    @Override
    public void speaking() {
        System.out.println("I'm barking");
    }
    @Override
    public void showName() {
        System.out.println(name);
    }
}
