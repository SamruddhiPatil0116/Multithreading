package com.prowings.usecases;

public class SingleThreadSingleTask {
    public static void main(String[] args) {
        System.out.println("Single thread starts");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }
        System.out.println("Single thread ends");
    }
}
