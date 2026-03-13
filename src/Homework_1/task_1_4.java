package Homework_1;

public class task_1_4 {

    public static void main(String[] args) {

        double n = 2.012;

        String okrugl = String.format("%.0f",n);

        System.out.println("Округление вещественного числа " + n + " до ближайшего целого равно " + okrugl);
    }

}
