package com.thoughtworks.tw101.exercises.exercise8;

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
        while(!pickRandomNumber.checkGuess(guess)) {
            guess = guessNumber.getInput();
        }
    }

    public void showGuesses() {
        System.out.print("Guessed Numbers: ");
        for(int number : pickRandomNumber.getGuessedNumbers()){
            System.out.print(number + ", ");
        }
    }

}
