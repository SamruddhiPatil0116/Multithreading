package com.prowings.Threads;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}

public class main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
