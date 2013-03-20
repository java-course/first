package edu.javacourse.robot;

public class RobotManager
{
    public static void main(String[] args) {
        // Объявление массива и создание
        Robot[] rbts = new Robot[10];

        // Обратите внимание на запись rbts.length - это свойство
        // (неизменяемое) возращает размер массива
        for (int i = 0; i < rbts.length; i++) {
            // Создаем обхект типа Robot
            rbts[i] = new Robot(i * 10, i * 10);
        }

        // Еще один цикл, который вызывает печать координат у каждого робота
        for (int i = 0; i < rbts.length; i++) {
            rbts[i].printCoordinates();
        }
    }
}
