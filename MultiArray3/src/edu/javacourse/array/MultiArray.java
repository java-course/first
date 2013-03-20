package edu.javacourse.array;

public class MultiArray
{
    public static void main(String[] args) {
        // Объявим конcтанту для размера массива
        int SIZE = 5;
        // Создаем массив, в котором есть другие массивы 
        // Причем массивы не создаются - они равны NULL
        char[][] graph = new char[SIZE][];

        // Цикл по элементам массива - все они пока равны NULL
        for (int i = 0; i < graph.length; i++) {
            // Проверяем равенство NULL - это правда
            System.out.println(graph[i] == null);
        }

        for (int i = 0; i < graph.length; i++) {
            // Создаем случайное число от 25 до 75 для указания размера массива
            int size = (int)(Math.round(Math.random()*50) + 25);
            // Теперь создаем массив нужного размера
            graph[i] = new char[size];
        }
        
        // Цикл по элементам массива - все они теперь проинициализированы
        for (int i = 0; i < graph.length; i++) {
            // Выводим размеры массивов, которые мы создали
            System.out.println(graph[i].length);
        }
        
    }
}
