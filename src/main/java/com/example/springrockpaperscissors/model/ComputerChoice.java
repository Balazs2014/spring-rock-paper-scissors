package com.example.springrockpaperscissors.model;

import java.util.Random;

public class ComputerChoice {
    private final String[] choices = { "ROCK", "PAPER", "SCISSORS" };
    private String choice;

    public ComputerChoice() {
        Random rnd = new Random();
        int result = rnd.nextInt(3);
        choice = choices[result];
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }
}
