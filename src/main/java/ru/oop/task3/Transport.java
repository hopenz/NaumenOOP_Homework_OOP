package ru.oop.task3;

/**
 * Интерфейс транспорта, наследуется от интерфейса Positioned
 */
public interface Transport extends Positioned {

    /**
     * Транспорт можеть ездить
     */
    public void drive(Position position);
}
