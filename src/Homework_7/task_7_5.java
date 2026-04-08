package Homework_7;

import java.util.Scanner;

/*
Вывести на консоль новую строку,
в которой задублирована каждая буква из начальной строки.
Например, "Hello" -> "HHeelllloo"
*/

public class task_7_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String string = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(string);
        // вычисление длины введенной строки
        int lengthString = string.length();
        // в цикле добавляю после каждого нечетного символа следующим символом его дубль
        for (int i = 0; i < lengthString; i = i + 2) {
            stringBuilder.insert(i + 1, stringBuilder.charAt(i));
            //  т.к. длина строки по прохождению цикла изменяется в конце каждого шага заново считаю ее
            lengthString = stringBuilder.length();
        }
        // вывод задублированной строки
        System.out.println("Задублированная строка \"" + stringBuilder + "\"");
    }
}
