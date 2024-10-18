package ru.oop.task3;

/**
 * Машина - это транспорт
 */
public class Car implements Transport {

    public Car(Person person) {
    }

    /**
     * Переопределение метода получения местоположения
     */
    @Override
    public Position getPosition() {
        return null;
    }

    /**
     * Так как машина - это транспорт, она может ездитm
     */
    @Override
    public void drive(Position position) {

    }
}
