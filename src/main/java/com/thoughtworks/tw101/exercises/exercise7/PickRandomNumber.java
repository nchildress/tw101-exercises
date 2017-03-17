package com.thoughtworks.tw101.exercises.exercise7;

public class PickRandomNumber {

    private int secretNumber;

    public PickRandomNumber() {
        secretNumber = 0;
    }

    public void generate() {
        secretNumber = (int)((Math.random() + 0.01) * 100);
    }

    public boolean checkGuess(int guess) {
        boolean isCorrectGuess = false;
        if(guess == secretNumber) {
            System.out.println(guess + " is the number! You win!");
            isCorrectGuess = true;
        } else if(guess < secretNumber) {
            System.out.println(guess + " is lower than the number. Try again.");
        } else if(guess > secretNumber) {
            System.out.println(guess + " is higher than the number. Try again.");
        }
        return isCorrectGuess;
    }

}
