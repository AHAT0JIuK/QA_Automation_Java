package Homework_3_OM;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task_3_6 {

/*
Пользователь с клавиатуры вводит размер массива (просто целое число).
После того, как размер массива задан, заполнить его используя Math.random().
Проверить, является ли массив возрастающей последовательностью (каждое
следующее число больше предыдущего).
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
            array[i] = random.nextInt(3);
        }
        // вывод массива
        System.out.println("Массив:" + Arrays.toString(array));
        /*
        проверка на то, что массив является возрастающей последовательностью.
        сравниваю в цикле элемент со следующим, соответственно у нас n-1 таких пар.
        Поэтому останавливаю цикл на предпоследнем элементе.
        Если количество пар удовлетворяющее этому условию равно количеству всех пар, значит последовательность возрастающая.
        */
        int k = 0;
        for (int i = 0; i < n - 1; i++) {
            if (array[i + 1] > array[i]) {
                k += 1;
            }
        }
        if (k == n - 1) {
            System.out.print("Массив является возрастающей последовательностью");
        }
    }
}
