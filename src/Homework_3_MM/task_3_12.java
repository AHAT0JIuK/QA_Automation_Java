package Homework_3_MM;

import java.util.Random;
import java.util.Scanner;

public class task_3_12 {

/*
Создаём квадратную матрицу, размер вводим с клавиатуры.
Заполняем случайными числами в диапазоне от 0 до 50.
И выводим на консоль (в виде матрицы).
Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // ввод размера массива
        System.out.print("Введите размер двумерного массива:");
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        int[][] mirror = new int[n][n];
        // заполнение массива
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(51);
            }
        }
        // вывод массива
        System.out.println("Массив до транспонирования:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        // подсчет суммы четных элементов стоящих над побочной диагональю (не включительно)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mirror[i][j]=array[j][i];
            }
        }
        // вывод массива
        System.out.println("Массив после транспонирования:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mirror[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
