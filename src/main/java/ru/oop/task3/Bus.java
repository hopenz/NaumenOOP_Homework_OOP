package ru.oop.task3;

/**
 * Автос - это транспорт
 */
public class Bus implements Transport {

    /**
     * Конструктор автобуса
     */
    public Bus(String number, Person person) {
    }

    /**
     * Переопределение метода, так как класс имплеминтирует интерфейс транспорта
     */
    @Override
    public Position getPosition() {
        return null;
    }

    /**
     * Автобус - это транспорт, тоже может ездить
     */
    @Override
    public void drive(Position position) {

    }
}
