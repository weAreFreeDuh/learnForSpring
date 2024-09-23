package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// recode 는 자동으로 객체를 생성, getter, setter 자동생성
record Person (String name, String dog, Address address) {};

record Address (String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public  String name(){
        return "Ranga";
    }

    @Bean
    public  String junho(){
        return "junho";
    }

    @Bean
    public  String dog(){
        return "work! work!";
    }

    @Bean
    @Primary // 같은 생성자중에 대표를 정해줍니다.
    public Person person(){
        var person = new Person("name","dog",new Address("샛길","충청도"));

        return person;
    }

    @Bean
    public Person newPerson(){
        var person = new Person(name(),dog(),address());

        return person;
    }

    @Bean
    public Address address(){
        var address = new Address("동주길","인천");

        return address;
    }

}
