package edu.javacourse.array;

public class SumArray
{
    public static void main(String[] args) {
        // Вы можете использовать инициализацию вот в таком виде
        // Перечисляете элементы массива чеерз запятую
        int[] sample = {12, 56, 7, 34, 89, 43, 23, 9};
        
        // До расчета суммы переменная для ее хранения содержит 0
        int summa= 0;
        // Выполняем проход по всем элементам и прибавляем каждый к сумме
        for(int i=0; i< sample.length; i++) {
            summa += sample[i];
        }
        System.out.println("TOTAL:" + summa);
    }
}
