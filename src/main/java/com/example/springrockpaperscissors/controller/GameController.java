package com.example.springrockpaperscissors.controller;

import com.example.springrockpaperscissors.model.ComputerChoice;
import com.example.springrockpaperscissors.model.GameResponse;
import com.example.springrockpaperscissors.model.Rules;
import com.example.springrockpaperscissors.model.UserChoice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@Controller
public class GameController {
    @GetMapping("/rules")
    public ResponseEntity getRules() {
        return new ResponseEntity(new Rules(), HttpStatus.OK);
    }

    @PostMapping("/play")
    public ResponseEntity play(@RequestBody UserChoice userChoice, @RequestParam("explain") boolean explain) {
        ComputerChoice cc = new ComputerChoice();
        Rules rules = new Rules();
        GameResponse response = new GameResponse();
        if (Objects.equals(cc.getChoice(), "ROCK") && Objects.equals(userChoice.getChoice().toUpperCase(), "PAPER")) {
            response.setWin(true);
        } else if (Objects.equals(cc.getChoice(), "PAPER") && Objects.equals(userChoice.getChoice().toUpperCase(), "SCISSORS")) {
            response.setWin(true);
        } else if (Objects.equals(cc.getChoice(), "SCISSORS") && Objects.equals(userChoice.getChoice().toUpperCase(), "ROCK")) {
            response.setWin(true);
        } else {
            response.setWin(false);
        }
        if (explain) {
            if (Objects.equals(cc.getChoice(), userChoice.getChoice().toUpperCase())) {
                response.setExplain(rules.getDRAW());
            } else if (response.isWin()) {
                if (Objects.equals(userChoice.getChoice().toUpperCase(), "ROCK")) {
                    response.setExplain(rules.getWINNER_ROCK());
                } else if (Objects.equals(userChoice.getChoice().toUpperCase(), "PAPER")) {
                    response.setExplain(rules.getWINNER_PAPER());
                } else {
                    response.setExplain(rules.getWINNER_SCISSORS());
                }
            } else {
                if (Objects.equals(cc.getChoice(), "ROCK")) {
                    response.setExplain(rules.getWINNER_ROCK());
                } else if (Objects.equals(cc.getChoice(), "PAPER")) {
                    response.setExplain(rules.getWINNER_PAPER());
                } else {
                    response.setExplain(rules.getWINNER_SCISSORS());
                }
            }
        } else {
            response.setExplain(null);
        }
        response.setTestComputerChoice(cc.getChoice());
        return new ResponseEntity(response, HttpStatus.OK);
    }
}
