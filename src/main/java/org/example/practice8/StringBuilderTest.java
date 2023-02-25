package org.example.practice8;

public class StringBuilderTest {
    public static void main(String[] args) {
        String x = "Hello";
        System.out.println(x.toUpperCase());
        System.out.println(x);

        StringBuilder stringBuilder = new StringBuilder("Privet" + 5);
        System.out.println(stringBuilder);
        stringBuilder.append(" my").append(" firned."); // method chaining
        System.out.println(stringBuilder);

        String v = "mam";
        System.out.printf("Hello, %s", v);
        System.out.println();
        System.out.printf("Hello, %d \n", 15);
        System.out.printf("Hello, %16d \n", 1500000);
        System.out.printf("Hello, %16d \n", 1231);
        System.out.printf("Hello, %16d \n", 32);
        System.out.printf("Hello, %16d \n", 222331231);
        System.out.printf("String %1f \n", 45.213123123);
    }
}
