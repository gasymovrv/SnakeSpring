package ru.javarush.snake;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    private static ApplicationContext ctx = new ClassPathXmlApplicationContext("spring_context.xml");
    public static Room game = ctx.getBean(Room.class);

    public static void main(String[] args) {
        game.run();
    }
}
