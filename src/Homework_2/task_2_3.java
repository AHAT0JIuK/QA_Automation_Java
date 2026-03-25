package Homework_2;

public class task_2_3 {

/*
Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
 */

    public static void main(String[] args) {
        System.out.println("Квадраты чисел от 10 до 20 включительно:");

        for (int i = 10; i <= 20; i++) {
            int s = i * i;
            System.out.println("Квадрат числа " + i + " равен " + s);
        }
    }
}
