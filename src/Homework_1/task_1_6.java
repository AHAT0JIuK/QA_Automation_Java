package Homework_1;

public class task_1_6 {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = 0;

        System.out.println("До перестановки значение a = " + a + ", а значение b = " + b);

        c = a;
        a = b;
        b = c;

        System.out.println("После перестановки значение a = " + a + ", а значение b = " + b);
    }

}
