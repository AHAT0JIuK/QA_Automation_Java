package Homework_3_OM;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task_3_3 {

/*
Пользователь с клавиатуры вводит размер массива (просто целое число).
После того, как размер массива задан, заполнить его используя Math.random().
Найти индексы минимального и максимального элементов и вывести в консоль.
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
            array[i] = random.nextInt(100);
        }
        // вывод массива
        System.out.println("Массив:" + Arrays.toString(array));
        // поиск и вывод индекса минимального элемента массива
        int min = array[0];
        int indxMin = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
                indxMin = i;
            }
        }
        System.out.println("Индекс минимального элемента массива:" + indxMin);
        // поиск и вывод индекса максимального элемента массива
        int max = array[0];
        int indxMax = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
                indxMax = i;
            }
        }
        System.out.print("Индекс максимального элемента массива:" + indxMax);
    }
}
