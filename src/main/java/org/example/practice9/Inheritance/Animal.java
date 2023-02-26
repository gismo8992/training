package org.example.practice9.Inheritance;

public abstract class Animal {
    public String name;
    public void eat() {
        System.out.println("I'm eating");
    }
    public void speak() {
        System.out.println("I'm speaking");
    }
    public void showName() {
    }

    public abstract void speaking();
}
