package Homework_3_MM;

import java.util.Scanner;

public class task_3_13 {

/*
Разработать консольную игру крестики-нолики. В игре участвуют 2 игрока.
Они по очереди вводят координаты клетки в которую хотят сделать ход.
После каждого хода, в консоли отрисовывается игровое поле с текущим состоянием.
Игра продолжается до победы одного из игроков или ничьи.
 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] game = new String[3][3];
        // вывод игрового поля
        System.out.println("Стартовое игровое поле:");
        for (int i = 0; i < 3; i++) {
            System.out.println("_____________" + "\t");
            for (int j = 0; j < 3; j++) {
                game[i][j] = " ";
                System.out.print("| " + game[i][j] + "\t");
            }
            System.out.println("|");
        }
        System.out.println("_____________");
        // 1 ход, ход 1го игрока (крестики)
        System.out.println("Ход №1. Куда игрок №1 сделает свой ход? (ввести два числа от 0 до 2 через пробел)");
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        game[i][j] = "x";
        // вывод игрового поля
        System.out.println("Состояние игрового поля:");
        for (i = 0; i < 3; i++) {
            System.out.println("_____________" + "\t");
            for (j = 0; j < 3; j++) {
                System.out.print("| " + game[i][j] + "\t");
            }
            System.out.println("|");
        }
        System.out.println("_____________");
        // 2 ход, ход 2го игрока (нолики)
        System.out.println("Ход №2. Куда игрок №2 сделает свой ход? (ввести два числа от 0 до 2 через пробел)");
        i = scanner.nextInt();
        j = scanner.nextInt();
        game[i][j] = "o";
        // вывод игрового поля
        System.out.println("Состояние игрового поля:");
        for (i = 0; i < 3; i++) {
            System.out.println("_____________" + "\t");
            for (j = 0; j < 3; j++) {
                System.out.print("| " + game[i][j] + "\t");
            }
            System.out.println("|");
        }
        System.out.println("_____________");
        // 3 ход, ход 1го игрока (крестики)
        System.out.println("Ход №3. Куда игрок №1 сделает свой ход? (ввести два числа от 0 до 2 через пробел)");
        i = scanner.nextInt();
        j = scanner.nextInt();
        game[i][j] = "x";
        // вывод игрового поля
        System.out.println("Состояние игрового поля:");
        for (i = 0; i < 3; i++) {
            System.out.println("_____________" + "\t");
            for (j = 0; j < 3; j++) {
                System.out.print("| " + game[i][j] + "\t");
            }
            System.out.println("|");
        }
        System.out.println("_____________");
        // 4 ход, ход 2го игрока (нолики)
        System.out.println("Ход №4. Куда игрок №2 сделает свой ход? (ввести два числа от 0 до 2 через пробел)");
        i = scanner.nextInt();
        j = scanner.nextInt();
        game[i][j] = "o";
        // вывод игрового поля
        System.out.println("Состояние игрового поля:");
        for (i = 0; i < 3; i++) {
            System.out.println("_____________" + "\t");
            for (j = 0; j < 3; j++) {
                System.out.print("| " + game[i][j] + "\t");
            }
            System.out.println("|");
        }
        System.out.println("_____________");
        // 5 ход, ход 1го игрока (крестики)
        System.out.println("Ход №5. Куда игрок №1 сделает свой ход? (ввести два числа от 0 до 2 через пробел)");
        i = scanner.nextInt();
        j = scanner.nextInt();
        game[i][j] = "x";
        // вывод игрового поля
        System.out.println("Состояние игрового поля:");
        for (i = 0; i < 3; i++) {
            System.out.println("_____________" + "\t");
            for (j = 0; j < 3; j++) {
                System.out.print("| " + game[i][j] + "\t");
            }
            System.out.println("|");
        }
        System.out.println("_____________");
        // после 5го хода возможна победа каким-либо игроком. поэтому далее после их ходов идут проверки на победу
        for (i = 0; i < 3; i++) {
            if (game[i][0] != " " && game[i][0] == game[i][1] && game[i][1] == game[i][2]) {
                System.out.println("1ый игрок победил!");
                System.exit(0);
            }
            if (game[0][i] != " " && game[0][i] == game[1][i] && game[1][i] == game[2][i]) {
                System.out.println("1ый игрок победил!");
                System.exit(0);
            }
        }
        if (game[0][0] != " " && game[0][0] == game[1][1] && game[1][1] == game[2][2]) {
            System.out.println("1ый игрок победил!");
            System.exit(0);
        }
        if (game[0][2] != " " && game[0][2] == game[1][1] && game[1][1] == game[2][0]) {
            System.out.println("1ый игрок победил!");
            System.exit(0);
        }
        // 6 ход, ход 2го игрока (нолики)
        System.out.println("Ход №6. Куда игрок №2 сделает свой ход? (ввести два числа от 0 до 2 через пробел)");
        i = scanner.nextInt();
        j = scanner.nextInt();
        game[i][j] = "o";
        // вывод игрового поля
        System.out.println("Состояние игрового поля:");
        for (i = 0; i < 3; i++) {
            System.out.println("_____________" + "\t");
            for (j = 0; j < 3; j++) {
                System.out.print("| " + game[i][j] + "\t");
            }
            System.out.println("|");
        }
        System.out.println("_____________");
        // проверки на победу
        for (i = 0; i < 3; i++) {
            if (game[i][0] != " " && game[i][0] == game[i][1] && game[i][1] == game[i][2]) {
                System.out.println("2ой игрок победил!");
                System.exit(0);
            }
            if (game[0][i] != " " && game[0][i] == game[1][i] && game[1][i] == game[2][i]) {
                System.out.println("2ой игрок победил!");
                System.exit(0);
            }
        }
        if (game[0][0] != " " && game[0][0] == game[1][1] && game[1][1] == game[2][2]) {
            System.out.println("2ой игрок победил!");
            System.exit(0);
        }
        if (game[0][2] != " " && game[0][2] == game[1][1] && game[1][1] == game[2][0]) {
            System.out.println("2ой игрок победил!");
            System.exit(0);
        }
        // 7 ход, ход 1го игрока (крестики)
        System.out.println("Ход №7. Куда игрок №1 сделает свой ход? (ввести два числа от 0 до 2 через пробел)");
        i = scanner.nextInt();
        j = scanner.nextInt();
        game[i][j] = "x";
        // вывод игрового поля
        System.out.println("Состояние игрового поля:");
        for (i = 0; i < 3; i++) {
            System.out.println("_____________" + "\t");
            for (j = 0; j < 3; j++) {
                System.out.print("| " + game[i][j] + "\t");
            }
            System.out.println("|");
        }
        System.out.println("_____________");
        // проверки на победу
        for (i = 0; i < 3; i++) {
            if (game[i][0] != " " && game[i][0] == game[i][1] && game[i][1] == game[i][2]) {
                System.out.println("1ый игрок победил!");
                System.exit(0);
            }
            if (game[0][i] != " " && game[0][i] == game[1][i] && game[1][i] == game[2][i]) {
                System.out.println("1ый игрок победил!");
                System.exit(0);
            }
        }
        if (game[0][0] != " " && game[0][0] == game[1][1] && game[1][1] == game[2][2]) {
            System.out.println("1ый игрок победил!");
            System.exit(0);
        }
        if (game[0][2] != " " && game[0][2] == game[1][1] && game[1][1] == game[2][0]) {
            System.out.println("1ый игрок победил!");
            System.exit(0);
        }
        // 8 ход, ход 2го игрока (нолики)
        System.out.println("Ход №8. Куда игрок №2 сделает свой ход? (ввести два числа от 0 до 2 через пробел)");
        i = scanner.nextInt();
        j = scanner.nextInt();
        game[i][j] = "o";
        // вывод игрового поля
        System.out.println("Состояние игрового поля:");
        for (i = 0; i < 3; i++) {
            System.out.println("_____________" + "\t");
            for (j = 0; j < 3; j++) {
                System.out.print("| " + game[i][j] + "\t");
            }
            System.out.println("|");
        }
        System.out.println("_____________");
        // проверки на победу
        for (i = 0; i < 3; i++) {
            if (game[i][0] != " " && game[i][0] == game[i][1] && game[i][1] == game[i][2]) {
                System.out.println("2ой игрок победил!");
                System.exit(0);
            }
            if (game[0][i] != " " && game[0][i] == game[1][i] && game[1][i] == game[2][i]) {
                System.out.println("2ой игрок победил!");
                System.exit(0);
            }
        }
        if (game[0][0] != " " && game[0][0] == game[1][1] && game[1][1] == game[2][2]) {
            System.out.println("2ой игрок победил!");
            System.exit(0);
        }
        if (game[0][2] != " " && game[0][2] == game[1][1] && game[1][1] == game[2][0]) {
            System.out.println("2ой игрок победил!");
            System.exit(0);
        }
        // 9 ход, ход 1го игрока (крестики)
        System.out.println("Ход №9. Куда игрок №1 сделает свой ход? (ввести два числа от 0 до 2 через пробел)");
        i = scanner.nextInt();
        j = scanner.nextInt();
        game[i][j] = "x";
        // вывод игрового поля
        System.out.println("Состояние игрового поля:");
        for (i = 0; i < 3; i++) {
            System.out.println("_____________" + "\t");
            for (j = 0; j < 3; j++) {
                System.out.print("| " + game[i][j] + "\t");
            }
            System.out.println("|");
        }
        System.out.println("_____________");
        // проверки на победу
        for (i = 0; i < 3; i++) {
            if (game[i][0] != " " && game[i][0] == game[i][1] && game[i][1] == game[i][2]) {
                System.out.println("1ый игрок победил!");
                System.exit(0);
            }
            if (game[0][i] != " " && game[0][i] == game[1][i] && game[1][i] == game[2][i]) {
                System.out.println("1ый игрок победил!");
                System.exit(0);
            }
        }
        if (game[0][0] != " " && game[0][0] == game[1][1] && game[1][1] == game[2][2]) {
            System.out.println("1ый игрок победил!");
            System.exit(0);
        }
        if (game[0][2] != " " && game[0][2] == game[1][1] && game[1][1] == game[2][0]) {
            System.out.println("1ый игрок победил!");
            System.exit(0);
        }
        System.out.println("К сожалению игра закончилась ничьей:-(");
    }
}
