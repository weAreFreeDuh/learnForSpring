package com.in28minutes.learn_spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole{

    public void up(){
        System.out.println("Jump1");
    }

    public void down(){
        System.out.println("down1");
    }

    public void left(){
        System.out.println("left1");
    }

    public void right(){
        System.out.println("right1");
    }

}
