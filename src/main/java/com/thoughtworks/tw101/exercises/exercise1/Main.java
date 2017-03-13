package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for(int oddNumber = 1; oddNumber < 100; oddNumber+=2){
            System.out.println(oddNumber);
            sum += oddNumber;
        }
        System.out.println(sum);
    }
}
