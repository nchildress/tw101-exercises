package com.thoughtworks.tw101.exercises.exercise7;
import java.util.Scanner;

public class GuessNumber {

    private Scanner userGuess;
    private int currentGuess;

    public GuessNumber() {
        userGuess = new Scanner(System.in);
        currentGuess = 0;
    }

    public int getInput() {
        System.out.println("Enter your guess: ");
        currentGuess = userGuess.nextInt();
        return currentGuess;
    }

}
