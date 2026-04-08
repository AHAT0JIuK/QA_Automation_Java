package Homework_7;

import java.util.Scanner;

/*
Ввести 3 строки с консоли.
Вывести на консоль те строки, длина которых меньше средней, а также их длину.
*/

public class task_7_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три строки через Enter");
        String lineOne = scanner.nextLine();
        String lineTwo = scanner.nextLine();
        String lineThree = scanner.nextLine();
        // вычисление средней длины введенных строк
        int averageLengthLine = (lineOne.length() + lineTwo.length() + lineThree.length()) / 3;
        // вспомогательный массив для вычисления строк длина которых меньше средней и их вывода
        String[] array = new String[3];
        array[0] = lineOne;
        array[1] = lineTwo;
        array[2] = lineThree;
        for (int i = 0; i < 3; i++) {
            if (array[i].length() < averageLengthLine) {
                System.out.println("Вывод строки длина которой меньше средней - \"" + array[i] + "\" с длиной равной " + array[i].length() + " символов");
            }
        }
    }
}
