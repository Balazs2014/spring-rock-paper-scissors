package com.example.springrockpaperscissors.model;

public class UserChoice {
    private String choice;
    private boolean explain = false;

    public UserChoice(String choice, boolean explain) {
        this.choice = choice;
        this.explain = explain;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public boolean isExplain() {
        return explain;
    }

    public void setExplain(boolean explain) {
        this.explain = explain;
    }
}
