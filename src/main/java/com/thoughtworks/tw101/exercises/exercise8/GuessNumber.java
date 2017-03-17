package com.thoughtworks.tw101.exercises.exercise8;
import java.util.InputMismatchException;
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
        try {
            currentGuess = Integer.parseInt(userGuess.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please enter an integer between 1 and 100.");
            currentGuess = getInput();
        }
        return currentGuess;
    }

}
