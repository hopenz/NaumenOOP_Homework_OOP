package ru.oop.task3;

/**
 * Интерфейс транспорта, наследуется от интерфейса Positioned
 */
public interface Transport extends Positioned {

    /**
     * Транспорт можеть ездить
     */
    void drive(Person person, Position position);
}
