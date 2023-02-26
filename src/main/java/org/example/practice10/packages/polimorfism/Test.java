package org.example.practice10.packages.polimorfism;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Dog dog1 = new Dog();
        animal1.eat();
        dog1.eat();
        Animal animal2 = new Dog();
        animal2.eat(); /* наследник имеет доступ только к методам родителя. Методы, определенные в классе Dog недоступны
        для вызова */
        animal2.run(); // вызывается переопределенный метод потомка, а не родителя
        System.out.println();
        Animal animal3 = new Animal();
        Dog dog3 = new Dog();
        Cat cat3 = new Cat();

        test(animal3);
        test(dog3);
        test(cat3);
    }
    public static void test(Animal animal) {
        animal.eat();
    }
}
