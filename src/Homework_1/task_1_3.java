package Homework_1;

public class task_1_3 {

    public static void main(String[] args) {

        short n = 268;

        System.out.println("Сумма цифр трехзначного числа n = " + (n / 100 + (n - n / 100 * 100) / 10 + n % 10));
    }

}
