package Homework_3_OM;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task_3_7 {

/*
Пользователь с клавиатуры вводит размер массива (просто целое число).
После того, как размер массива задан, заполнить его используя Math.random().
Имеется массив из неотрицательных чисел(любой). Представьте что массив
представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} - > 999). Задача
добавить единицу к этому “числу” и на выходе получить исправленный массив.
Массив не содержит нуля в начале, кроме самого числа 0.
 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // ввод размера массива
        System.out.print("Введите размер массива:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        // заполнение массива
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(9)+1;
        }
        // вывод массива
        System.out.println("Массив:" + Arrays.toString(array));
        // вывод зашифрованного числа
        int x = 0;
        for (int i = 0; i < n; i++) {
            x += array[i] * Math.pow(10, n - 1 - i);
        }
        System.out.println("Число зашифрованное в массиве = " + x);
        // вычисление числа для преобразования и вывода его массивом
        int y = x + 1;
        System.out.println("Число для зашифровки в массив = " + y);
        // вычисление количества элементов нового массива. сделано потому что количество цифр в числе может измениться
        double z = y;
        int m = 0;
        while (z > 1) {
            m++;
            z = z / 10;
        }
        // заполнение  и вывод нового массива
        int[] arrayNew = new int[m];
        for (int i = 0; i < m; i++) {
            arrayNew[i] = (int) (y / Math.pow(10, m - 1 - i));
            y -= (int) (arrayNew[i] * Math.pow(10, m - 1 - i));
        }
        System.out.print("Массив полученный из нового числа:" + Arrays.toString(arrayNew));
    }
}
