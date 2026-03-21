package Homework_3_OM;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task_3_4 {

/*
Пользователь с клавиатуры вводит размер массива (просто целое число).
После того, как размер массива задан, заполнить его используя Math.random().
Найти и вывести количество нулевых элементов. Если нулевых элементов нет -
вывести сообщение, что их нет.
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
            array[i] = random.nextInt(5);
        }
        // вывод массива
        System.out.println("Массив:" + Arrays.toString(array));
        // вычисление количества нулевых элементов массива
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == 0) {
                k += 1;
            }
        }
        if (k > 0) {
            System.out.println("Количество нулевых элементов в массиве = " + k);
        } else {
            System.out.println("Нулевых элементов в массиве нет");
        }
    }
}
