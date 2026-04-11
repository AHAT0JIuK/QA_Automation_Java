package Homework_8.Homework_8_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
Пользователь вводит набор чисел в виде одной строки с клавиатуры.
Например: "1, 2, 3, 4, 4, 5". Избавиться от повторяющихся элементов в строке.
Вывести результат на экран. При решении использовать коллекции.
*/

public class task_8_1 {

    public static void main(String[] args) {
        // ввод набора чисел
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа одной строкой через пробел");
        String string = scanner.nextLine();
        // преобразование строки в массив
        String[] array = string.split(" ");
        // вычисление длины полученного массива
        int k = array.length;
        // заполнение коллекции сущностями из массива
        Set<String> numbers = new HashSet<>();
        numbers.addAll(Arrays.asList(array).subList(0, k));
        // вывод полученной коллекции в консоль
        System.out.println(numbers);
    }
}
