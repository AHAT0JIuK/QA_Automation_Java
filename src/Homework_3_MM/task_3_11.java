package Homework_3_MM;

import java.util.Random;
import java.util.Scanner;

public class task_3_11 {

/*
Создаём квадратную матрицу, размер вводим с клавиатуры.
Заполняем случайными числами в диапазоне от 0 до 50.
И выводим на консоль (в виде матрицы).
Посчитать сумму четных элементов стоящих над побочной диагональю (не включительно)
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
        // подсчет суммы четных элементов стоящих над побочной диагональю (не включительно)
        int s = 0;
        for (int i = 0; i < n; i++) {
            for (int j = n-2-i; j > -1; j--) {
                if (array[i][j] % 2 == 0) {
                    s += array[i][j];
                }
            }
        }
        System.out.print("Cумма четных элементов стоящих над побочной диагональю не включая ее = " + s);
    }
}
