package ru.javarush.snake;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class SnakeSectionFactory {
    @Autowired
    private SnakeSection section;

    @Bean
    @Qualifier("listSnakeSections")
    public ArrayList<SnakeSection> listSnakeSections(){
        ArrayList<SnakeSection> list = new ArrayList<>();
        list.add(section);
        return list;
    }

//    вариант с бином в этом классе вместо поля с @Autowired
//    @Bean
//    public SnakeSection snakeSectionMiddle(){
//        Properties p = new Properties();
//        try {
//            p.load(new FileReader("src\\main\\resources\\room.properties"));
//            p.list(System.out);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return new SnakeSection(
//                Integer.parseInt(p.getProperty("defaultSnakeSectionX")),
//                Integer.parseInt(p.getProperty("defaultSnakeSectionY"))
//        );
//    }
}
