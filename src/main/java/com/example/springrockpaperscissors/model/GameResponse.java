package com.example.springrockpaperscissors.model;

public class GameResponse {
    private String explain;
    private boolean win;
    private String testComputerChoice;

    public GameResponse() {
    }

    public GameResponse(String explain, boolean winner) {
        this.explain = explain;
        this.win = winner;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public void setTestComputerChoice(String testComputerChoice) {
        this.testComputerChoice = testComputerChoice;
    }

    public String getTestComputerChoice() {
        return testComputerChoice;
    }
}
