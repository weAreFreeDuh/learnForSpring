package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.SuperContreaGame;

public class AppGamingRunner {

    public static void main(String[] args){

        //var game = new MarioGame();

        // Object Creation
        var game = new SuperContreaGame();


        // Object Creation + Wiring of Dependencies
        // Game is a Dependency of GameRunner
        var gameRunner = new GameRunner(game);

        gameRunner.run();

    }
}
