package Homework_3_MM;

import java.util.Random;
import java.util.Scanner;

public class task_3_9 {

/*
Создаём квадратную матрицу, размер вводим с клавиатуры.
Заполняем случайными числами в диапазоне от 0 до 50.
И выводим на консоль (в виде матрицы).
Вывести нечетные элементы находящиеся под главной диагональю (включительно).
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
        // вывод нечетных элементов находящихся под главной диагональю (включительно)
        System.out.print("Нечетные элементы стоящие под главной диагональю, включая саму главную диагональ: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j <= i) & (array[i][j] % 2 == 1)) {
                    System.out.print((array[i][j]) + " ");
                }
            }
        }
    }
}
