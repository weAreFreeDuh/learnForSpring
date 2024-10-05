package com.in28minutes.learn_spring_framework;


import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.learn_spring_framework.game")
class GamingConfiguration {

//    @Bean
//    public GameRunner gameRunner(GamingConsole game){
//        System.out.println("Parameter = " + game);
//        var gameRunner = new GameRunner(game);
//        return gameRunner;
//    }

    public static void main(String[] args){

        var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);

        context.getBean(GameRunner.class).run();

        context.getBean(GamingConsole.class).up();
    }
}

public class App03GamingSpringBeans {

    public static void main(String[] args){

        var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);

        context.getBean(GamingConsole.class).up();

    }


}
