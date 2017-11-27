package ru.javarush.snake;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Mouse {
    private int x;
    private int y;

    @Autowired
    public Mouse(@Value("#{T(java.lang.Math).random()*room.width}") int x,
                 @Value("#{T(java.lang.Math).random()*room.height}") int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
