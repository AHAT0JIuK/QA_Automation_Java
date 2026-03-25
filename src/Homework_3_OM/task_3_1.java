package Homework_3_OM;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task_3_1 {

/*
Пользователь с клавиатуры вводит размер массива (просто целое число).
После того, как размер массива задан, заполнить его используя Math.random().
Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
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
        // вывод массива в прямом порядке
        Arrays.sort(array);
        System.out.println("Массив в прямом порядке:" + Arrays.toString(array));
        /*
        т.к. на этот момент массив отсортирован по возрастанию меняю местами попарно элементы массива:
        1ый - последний, 2ой - предпоследний и так далее до среднего элемента массива.
        Потом останавливаюсь т.к. все элементы переставлены, а средний элемент всегда одинаковый в обоих порядках.
        */
        for (int i = 0; i < n / 2; i++) {
            int a = array[n - 1 - i];
            array[n - 1 - i] = array[i];
            array[i] = a;
        }
        System.out.print("Массив в обратном порядке:" + Arrays.toString(array));
    }
}
