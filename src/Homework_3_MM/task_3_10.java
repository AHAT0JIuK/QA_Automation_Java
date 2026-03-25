package Homework_3_MM;

import java.util.Random;
import java.util.Scanner;

public class task_3_10 {

/*
Создаём квадратную матрицу, размер вводим с клавиатуры.
Заполняем случайными числами в диапазоне от 0 до 50.
И выводим на консоль (в виде матрицы).
Проверить произведение элементов какой диагонали больше.
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
        // подсчет произведений элементов главной и побочной диагонали
        int p1 = 1;
        int p2 = 1;
        for (int i = 0; i < n; i++) {
            p2 *= array[i][n - 1 - i];
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    p1 *= array[i][i];
                }
            }
        }
        System.out.println("Произведение элементов главной диагонали = " + p1);
        System.out.println("Произведение элементов побочной диагонали = " + p2);
        if (p1 > p2) {
            System.out.println("Произведение элементов главной диагонали больше чем произведение элементов побочной диагонали!");
        } else {
            System.out.println("Произведение элементов побочной диагонали больше чем произведение элементов главной диагонали!");
        }
    }
}
