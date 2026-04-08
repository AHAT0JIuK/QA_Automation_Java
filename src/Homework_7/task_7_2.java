package Homework_7;

import java.util.Scanner;

/*
Ввести 3 строки с консоли.
Упорядочить и вывести строки в порядке возрастания значений их длины.
*/

public class task_7_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три строки через Enter");
        String lineOne = scanner.nextLine();
        String lineTwo = scanner.nextLine();
        String lineThree = scanner.nextLine();
        // вычисление длин введенных строк
        int lengthLineOne = lineOne.length();
        int lengthLineTwo = lineTwo.length();
        int lengthLineThree = lineThree.length();
        // объявление вспомогательных переменных для упорядочивания
        String shortLine;
        String averageLine;
        String longLine;
        // вычисление самой короткой и длинной строки и их вывод
        if (lengthLineOne < lengthLineTwo) {
            if (lengthLineOne < lengthLineThree) {
                shortLine = lineOne;
                if (lengthLineTwo < lengthLineThree) {
                    longLine = lineThree;
                    averageLine = lineTwo;
                } else {
                    longLine = lineTwo;
                    averageLine = lineThree;
                }
            } else {
                shortLine = lineThree;
                longLine = lineTwo;
                averageLine = lineOne;
            }
        } else {
            if (lengthLineOne < lengthLineThree) {
                shortLine = lineTwo;
                longLine = lineThree;
                averageLine = lineOne;
            } else {
                longLine = lineOne;
                if (lengthLineTwo < lengthLineThree) {
                    shortLine = lineTwo;
                    averageLine = lineThree;
                } else {
                    shortLine = lineThree;
                    averageLine = lineTwo;
                }
            }
        }
        System.out.println("Вывод строк по возрастанию их длины:\n" + shortLine + "\n" + averageLine + "\n" + longLine);
    }
}
