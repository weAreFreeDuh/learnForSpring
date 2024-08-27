package com.in28minutes.learn_spring_framework;


import com.in28minutes.learn_spring_framework.config.HelloWorldConfiguration;
import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.SuperContreaGame;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;
import java.util.Arrays;


public class App02HelloWorldSpring {

    public static void main(String[] args){

        // 1.Lanch a Spring Context

        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // 2.Configure the things that we want Spring to manage - @Configuration
        // HelloWorldConfiguration - @Configuration
        // name = @Bean
        // 3. Retrieving Beans managed by Spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("dog"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("newPerson"));
        System.out.println(context.getBean("address"));

        // print all Bean name
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    }
}
