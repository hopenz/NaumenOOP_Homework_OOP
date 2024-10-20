package ru.oop.task2;

/**
 * Интерфейс транспорта
 */
public interface Transport extends Positioned{
    /**
     * Весь транспорт может ехать до места назначения
     */
    void drive(Person person, Position position);
}
