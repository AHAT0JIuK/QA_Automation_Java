package Homework_7;

import java.util.Scanner;

/*
Ввести 3 строки с консоли.
Найти слово, состоящее только из различных символов.
Если таких слов несколько, найти первое из них.
*/

public class task_7_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три строки через Enter");
        String lineOne = scanner.nextLine();
        String lineTwo = scanner.nextLine();
        String lineThree = scanner.nextLine();
        // переменные для определения состояния слова из различных символов
        boolean heterogramLineOne = false;
        boolean heterogramLineTwo = false;
        boolean heterogramLineThree = false;
        // вычисление длин введенных строк
        int lengthLineOne = lineOne.length();
        int lengthLineTwo = lineTwo.length();
        int lengthLineThree = lineThree.length();
        // перевод значений переменных из строк в массив
        char[] lineToArrayOne = lineOne.toCharArray();
        char[] lineToArrayTwo = lineTwo.toCharArray();
        char[] lineToArrayThree = lineThree.toCharArray();
        /* выясняю состоит ли первая строка только из различных символов,
        если есть повторяемые символы, то принудительно завершаю циклы
        */
        for (int i = 0; i < lengthLineOne; i++) {
            for (int j = i + 1; j < lengthLineOne; j++) {
                if (lineToArrayOne[j] == lineToArrayOne[i]) {
                    heterogramLineOne = false;
                    break;
                } else {
                    heterogramLineOne = true;
                }
            }
            if (!heterogramLineOne) {
                break;
            }
        }
        /* выясняю состоит ли вторая строка только из различных символов,
        если есть повторяемые символы, то принудительно завершаю циклы
        */
        for (int i = 0; i < lengthLineTwo; i++) {
            for (int j = i + 1; j < lengthLineTwo; j++) {
                if (lineToArrayTwo[j] == lineToArrayTwo[i]) {
                    heterogramLineTwo = false;
                    break;
                } else {
                    heterogramLineTwo = true;
                }
            }
            if (!heterogramLineTwo) {
                break;
            }
        }
        /* выясняю состоит ли третья строка только из различных символов,
        если есть повторяемые символы, то принудительно завершаю циклы
        */
        for (int i = 0; i < lengthLineThree; i++) {
            for (int j = i + 1; j < lengthLineThree; j++) {
                if (lineToArrayThree[j] == lineToArrayThree[i]) {
                    heterogramLineThree = false;
                    break;
                } else {
                    heterogramLineThree = true;
                }
            }
            if (!heterogramLineThree) {
                break;
            }
        }
        // вывод первой введеной строки из неповторяющихся символов
        if (heterogramLineOne) {
            System.out.println("Первой введеной строкой из неповторяющихся символов является \"" + lineOne + "\"");
        } else {
            if (heterogramLineTwo) {
                System.out.println("Первой введеной строкой из неповторяющихся символов является \"" + lineTwo + "\"");
            } else {
                if (heterogramLineThree) {
                    System.out.println("Первой введеной строкой из неповторяющихся символов является \"" + lineThree + "\"");
                } else {
                    System.out.println("Ни одна из введеных строк не является строкой из не повторяющихся символов!:-(");
                }
            }
        }
    }
}
