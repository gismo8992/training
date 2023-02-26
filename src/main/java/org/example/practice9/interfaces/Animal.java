package org.example.practice9.interfaces;

public class Animal implements Info{
    public int id;
    public Animal(int id) {
        this.id = id;
    }

    public void sleep() {
        System.out.println("I'm sleeping");
    }

    @Override
    public void showInfo() {
        System.out.println("ID is " + id);
    }
}
