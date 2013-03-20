package edu.javacourse.ui;

import javax.swing.JFrame;

public class OvalApplication
{
    public static void main(String[] args) {
        // Создаем графическое окно
        OvalFrame of = new OvalFrame();
        // Задаем правидо, по которому приложение завершиться при 
        // закрытии этой формы
        of.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Делаем окно видимым
        of.setVisible(true);
    }
}
