package ru.oop.task3;

import java.util.List;

/**
 * <b>Задача 3:</b><br>
 * То же самое, что и задача 2, но добраться нужно с пересадками<br>
 * Можно определить транспортные средства списком:<br>
 * {@code List.of(new Car(person), new Bus("43", person),
 * new Bus("50", person));}
 * <ul>
 *   <li>Код не должен превышать 12 строк</li>
 *   <li>Запрещено реализовывать конструкторы и методы, кроме moveTo(Person person, Position destination)</li>
 *   <li>Запрещено добавлять новые методы в класс Main</li>
 *   <li>Разрешено создавать новые классы и интерфейсы</li>
 * </ul>
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
public class MainTask3 {

    /**
     * Переехать из текущего места в заданную точку
     * на любом, заранее определённом транспорте
     */
    public void moveTo(Person person, Position destination, List<Transport> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            person.walk(list.get(i).getPosition());
            list.get(i).drive(person, list.get(i + 1).getPosition());
        }
        if (!list.isEmpty()) {
            person.walk(list.get(list.size() - 1).getPosition());
            list.get(list.size() - 1).drive(person, destination);
        }
        person.walk(destination);
        assert person.getPosition() == destination;
    }
}
