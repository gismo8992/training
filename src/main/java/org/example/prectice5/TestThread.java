package org.example.prectice5;

import java.util.Scanner;

public class TestThread extends Thread {
    public static void main(String[] args) {
        NewTest newTest = new NewTest();
        newTest.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        newTest.shutdown();
    }
}

class NewTest extends Thread{
    private volatile boolean running = true;
    public void run() {
        while (running) {
            System.out.println("hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void shutdown() {
        this.running = false;
    }
}
