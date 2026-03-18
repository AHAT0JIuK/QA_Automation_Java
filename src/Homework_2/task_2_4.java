package Homework_2;

public class task_2_4 {

/*
Необходимо, чтоб программа выводила на экран вот такую последовательность: 7 14 21 28 35 42 49 56 63 70 77 84 91 98.
В решении используйте цикл while.
 */

    public static void main(String[] args) {
        int i = 1;
        System.out.print("Последовательность:");

        while (i < 100) {
            if (i % 7 == 0) {
                System.out.print(" " + i);
            }
            i++;
        }
    }
}
