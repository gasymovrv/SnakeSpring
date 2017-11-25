package ru.javarush.snake;
/**
 * Создает новую мышь
 * используя настройки бина mouse
 * и lookup-method фактори-бина mouseGenerate
 * (см. spring_context.xml)
 */
public interface MouseGenerate {
    Mouse createMouse();
}
