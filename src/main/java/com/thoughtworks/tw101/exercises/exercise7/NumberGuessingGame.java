package com.thoughtworks.tw101.exercises.exercise7;

public class NumberGuessingGame {
    private PickRandomNumber pickRandomNumber;
    private GuessNumber guessNumber;

    public NumberGuessingGame() {
        pickRandomNumber = new PickRandomNumber();
        guessNumber = new GuessNumber();
    }

    public void init() {
        pickRandomNumber.generate();
    }

    public void startGuessing() {
        int guess = guessNumber.getInput();
        while( pickRandomNumber.checkGuess(guess) == false){
            guess = guessNumber.getInput();
        }
    }

}
