package org.example.prectice5;

public class Practice5 {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread1.start();
        System.out.println("Hello from main thread!");
        myThread2.start();
    }
}

class MyThread extends Thread {
    public void run() {
        for(int i = 0; i <5; i++) {
            System.out.println("Hello from MyThread " + i);
        }
    }
}
