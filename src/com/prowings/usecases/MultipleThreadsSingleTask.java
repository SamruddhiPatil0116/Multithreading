package com.prowings.usecases;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is running.");
    }
}

class MultipleThreadsSingleTask {
    public static void main(String[] args) {
        
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

