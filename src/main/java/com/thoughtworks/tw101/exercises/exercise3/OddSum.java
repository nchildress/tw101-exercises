package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {
        int sum = 0;
        for(int low = start; low < end; low += 2){
            sum += low;
        }
        return sum;
    }
}
