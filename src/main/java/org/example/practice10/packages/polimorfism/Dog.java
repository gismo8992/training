package org.example.practice10.packages.polimorfism;

public class Dog extends Animal{
    public void bark() {
        System.out.println("Dog is barking");
    }
    @Override
    public void run() {
        System.out.println("Dog is running");
    }

    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }
}
