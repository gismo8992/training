package org.example.practice9;

public class PracticeObjectClass {
    public static void main(String[] args) {
        Human human1 = new Human("Bob", 19);
        System.out.println(human1);
        human1.toString();

    }
}

class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return name + " " + age;
}}
