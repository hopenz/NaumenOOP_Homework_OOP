package ru.oop.task2;

/**
 * Автобус - это транспорт
 */
public class Bus implements Transport, Positioned{

    /**
     * Конструктор автобуса с номером и человеком
     */
    public Bus(String number, Person driver) {
    }

    /**
     * Автобус, как и весь транспорт, может ехать
     */
    @Override
    public void drive(Position position) {
        //bla-bla-bla
    }

    /**
     * Получение местоположения
     * @return
     */
    @Override
    public Position getPosition() {
        return null;
    }
}
