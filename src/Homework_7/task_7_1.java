package Homework_7;

import java.util.Scanner;

/*
Ввести 3 строки с консоли, найти самую короткую и самую длинную строки.
Вывести найденные строки и их длину.
*/

public class task_7_1 {

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
        // вычисление самой короткой и длинной строки и их вывод
        if (lengthLineOne < lengthLineTwo) {
            if (lengthLineOne < lengthLineThree) {
                System.out.println("Самая короткая строка - \"" + lineOne + "\" с длиной равной " + lengthLineOne + " символов");
                if (lengthLineTwo < lengthLineThree) {
                    System.out.println("Самая длинная строка - \"" + lineThree + "\" с длиной равной " + lengthLineThree + " символов");
                } else {
                    System.out.println("Самая длинная строка - \"" + lineTwo + "\" с длиной равной " + lengthLineTwo + " символов");
                }
            } else {
                System.out.println("Самая короткая строка - \"" + lineThree + "\" с длиной равной " + lengthLineThree + " символов");
                System.out.println("Самая длинная строка - \"" + lineTwo + "\" с длиной равной " + lengthLineTwo + " символов");
            }
        } else {
            if (lengthLineOne < lengthLineThree) {
                System.out.println("Самая короткая строка - \"" + lineTwo + "\" с длиной равной " + lengthLineTwo + " символов");
                System.out.println("Самая длинная строка - \"" + lineThree + "\" с длиной равной " + lengthLineThree + " символов");
            } else {
                System.out.println("Самая длинная строка - \"" + lineOne + "\" с длиной равной " + lengthLineOne + " символов");
                if (lengthLineTwo < lengthLineThree) {
                    System.out.println("Самая короткая строка - \"" + lineTwo + "\" с длиной равной " + lengthLineTwo + " символов");
                } else {
                    System.out.println("Самая короткая строка - \"" + lineThree + "\" с длиной равной " + lengthLineThree + " символов");
                }
            }
        }
    }
}
