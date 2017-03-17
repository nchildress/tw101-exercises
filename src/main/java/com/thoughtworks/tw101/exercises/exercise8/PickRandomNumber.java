package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;

public class PickRandomNumber {

    private int secretNumber;
    private ArrayList<Integer> guessedNumbers;

    private void addGuess(int guess){
        guessedNumbers.add(guess);
    }

    public ArrayList<Integer> getGuessedNumbers() {
        return guessedNumbers;
    }

    public PickRandomNumber() {
        secretNumber = 0;
        guessedNumbers = new ArrayList<>();
    }

    public void generate() {
        secretNumber = (int)((Math.random() + 0.01) * 100);
    }

    public boolean checkGuess(int guess) {
        boolean isCorrectGuess = false;
        addGuess(guess);
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
