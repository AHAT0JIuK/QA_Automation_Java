package Homework_3_MM;

import java.util.Random;
import java.util.Scanner;

public class task_3_8 {

/*
Создаём квадратную матрицу, размер вводим с клавиатуры.
Заполняем случайными числами в диапазоне от 0 до 50.
И выводим на консоль (в виде матрицы).
Посчитать сумму четных элементов стоящих на главной диагонали.
 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // ввод размера массива
        System.out.print("Введите размер двумерного массива:");
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        // заполнение массива
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(51);
            }
        }
        // вывод массива
        System.out.println("Массив:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        // подсчёт суммы четных элементов стоящих на главной диагонали
        int s = 0;
        for (int i = 0; i < n; i++) {
            if (array[i][i] % 2 == 0) {
                s += array[i][i];
            }
        }
        // вывод суммы четных элементов стоящих на главной диагонали
        System.out.println("Сумма четных элементов стоящих на главной диагонали = " + s);
    }
}
