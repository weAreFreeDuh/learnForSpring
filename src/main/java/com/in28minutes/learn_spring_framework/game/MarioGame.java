package com.in28minutes.learn_spring_framework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole{

    public void up(){
        System.out.println("MarioGame Jump1");
    }

    public void down(){
        System.out.println("MarioGame down1");
    }

    public void left(){
        System.out.println("MarioGame left1");
    }

    public void right(){
        System.out.println("MarioGame right1");
    }
}
