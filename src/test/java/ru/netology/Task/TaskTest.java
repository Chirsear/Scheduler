package ru.netology.Task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    @Test

    public void testSimpleTaskFounded() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Позвонить");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testSimpleTaskNotFounded() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Набрать");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testEpicTaskFounded() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Хлеб");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testEpicTaskNotFounded() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Ветчина");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testMeetingTaskFounded() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Завтра в обед"
        );

        boolean actual = meeting.matches("Завтра");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testMeetingTaskNotFounded() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Завтра в обед"
        );

        boolean actual = meeting.matches("Календарь");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

}