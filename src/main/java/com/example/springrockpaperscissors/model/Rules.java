package com.example.springrockpaperscissors.model;

public class Rules {
    private final String WINNER_ROCK = "Rock wins against scissors";
    private final String WINNER_PAPER = "Paper wins against rock";
    private final String WINNER_SCISSORS = "Scissors wins against paper";
    private final String DRAW = "Same sign, it is a draw";

    public Rules() {
    }

    public String getWINNER_ROCK() {
        return WINNER_ROCK;
    }

    public String getWINNER_PAPER() {
        return WINNER_PAPER;
    }

    public String getWINNER_SCISSORS() {
        return WINNER_SCISSORS;
    }

    public String getDRAW() {
        return DRAW;
    }
}
