package edu.javacourse.array;

public class ForEachExample
{
    public static void main(String[] args) {
        int[] sample = new int[5];

        System.out.println("До foreach");
        // выводим элементы в цикле foreach - их значение 0
        for (int t : sample) {
            System.out.println(t);
        }

        // Для инициализации элементов foreach не подходит
        for (int i = 0; i < sample.length; i++) {
            sample[i] = 99;
        }

        System.out.println("После foreach");
        // выводим элементы в цикле foreach - снова 0
        for (int t : sample) {
            System.out.println(t);
        }
    }
}
