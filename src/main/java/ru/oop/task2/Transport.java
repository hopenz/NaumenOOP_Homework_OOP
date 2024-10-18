package ru.oop.task2;

/**
 * Интерфейс транспорта
 */
public interface Transport {
    /**
     * Весь транспорт может ехать до места назначения
     */
    public void drive(Position position);
}
