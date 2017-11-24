package ru.javarush.snake;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    private static ApplicationContext ctx = new ClassPathXmlApplicationContext("spring_context.xml");
    public static Room game = (Room)ctx.getBean("room");

    public static void main(String[] args) {
        game.run();
    }
}
