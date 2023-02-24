package org.example.practice7;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5");
        int value = scanner.nextInt();
        do {
            System.out.println("Enter 5");
            value = scanner.nextInt();
        }
        while (value!=5);
        System.out.println("You have entered 5");


    }



}
