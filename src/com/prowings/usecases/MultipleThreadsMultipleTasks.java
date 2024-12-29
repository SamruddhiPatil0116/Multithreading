package com.prowings.usecases;

class PrintNumbers extends Thread {
    public void run() {
        System.out.println("Task: Printing numbers...");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Number: " + i);
        }
    }
}

class PrintLetters extends Thread {
    public void run() {
        System.out.println("Task: Printing letters...");
        for (char c = 'A'; c <= 'C'; c++) {
            System.out.println("Letter: " + c);
        }
    }
}

class MultipleThreadsMultipleTasks {
    public static void main(String[] args) {
        Thread numberThread = new PrintNumbers();
        Thread letterThread = new PrintLetters();

        numberThread.start(); 
        letterThread.start(); 
    }
}
