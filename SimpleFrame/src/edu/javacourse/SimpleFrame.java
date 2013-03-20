package edu.javacourse;

// Мы ИМПОРТИРОВАЛИ класс из пакета
import javax.swing.JFrame;

public class SimpleFrame {

    public static void main(String[] args) {
        // Создали экземпляр класса - объект
        JFrame sf = new JFrame();
        // Установим заголовок
        sf.setTitle("First window");
        // Установим свойсво - завершить приложение при закрытии окна
        sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Выставим координаты и размеры 
        // Верхний левый угол - первые два числа 100 и 100
        // Ширина и высота - вторы два числа 400 и 200
        sf.setBounds(100, 100, 400, 200);
        // Отобразим окно, сделав его видимым
        sf.setVisible(true);
        // Теперь у нас на экране появилось окно, которым
        // можно управлять - перетаскивать, менять размеры.
        // Разве не красиво ?
    }
}
