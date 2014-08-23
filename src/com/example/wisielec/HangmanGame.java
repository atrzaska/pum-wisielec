package com.example.wisielec;

import java.util.Random;

public class HangmanGame {
    private final String[] proverbs = {
            "between the devil and the deep sea",
            "a burnt child dreads fire",
            "a friend in need is a friend indeed",
            "empty vessels make the most noise",
            "great talkers are little doers",
            "an ounce of discretion is worth a pound of wit",
            "faint heart never won fair lady" };

    private final String currentProverb;

    private int lives = 11;

    private String guessedLetters;

    private boolean isWon = false;
    private boolean isOver = false;

    public String getGuessedLetters() {
        return guessedLetters;
    }

    public HangmanGame() {
        Random random = new Random();
        int randomNumber = random.nextInt(proverbs.length);

        currentProverb = proverbs[randomNumber];
        this.guessedLetters = this.generateGuessMeString(currentProverb);
    }

    private String generateGuessMeString(String proverb) {
        String output = proverb.replaceAll("\\w", "_");
        return output;
    }

    public void guessLetter(Character letter) {
        String letterAsString = letter.toString();

        if(guessedLetters.contains(letterAsString)) {
            return;
        }

        if (this.isOver()) {
            return;
        }

        if(currentProverb.contains(letterAsString)) {
            StringBuilder sb = new StringBuilder(guessedLetters);

            for(int i = 0; i < currentProverb.length(); i++) {
                Character c = currentProverb.charAt(i);

                if (c == letter) {
                    sb.setCharAt(i, letter);
                }
            }

            guessedLetters = sb.toString();


            if(guessedLetters.equalsIgnoreCase(currentProverb)) {
                this.isWon = true;
                this.isOver = true;
            }

        } else {
            lives--;

            if(lives == 0) {
                this.isOver = true;
            }
        }
    }

    public boolean isWon() {
        return isWon;
    }

    public int numLives() {
        return lives;
    }

    public boolean isOver() {
        return isOver;
    }
}
