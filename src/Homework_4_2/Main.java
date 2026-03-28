package Homework_4_2;

import java.util.Random;
import java.util.Scanner;

/*
Создать класс, описывающий банкомат.
Набор купюр, находящихся в банкомате, должен задаваться тремя свойствами:
количеством купюр номиналом 20, 50 и 100.
Сделать метод для добавления денег в банкомат.
Сделать функцию, снимающую деньги, которая принимает сумму денег,
а возвращает булевое значение - успешность выполнения операции.
При снятии денег, функция должна распечатывать каким количеством купюр
какого номинала выдаётся сумма. Создать конструктор с тремя параметрами -
количеством купюр каждого номинала
*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // объявление переменных для внесения
        int depositTwenties;
        int depositFifties;
        int depositHundred;
        // объявление переменной для снятия
        boolean success;
        int withdrawalAmount;
        // объявление вспомогательных переменные для подсчёта возможности выдачи суммы купюрами находящимися в банкомате
        int supposedCountFifties;
        int supposedCountHundred;
        // объявление переменной для задания работы циклов банкомата
        int n = 50;
        //заполнение банкомата купюрами
        Random random = new Random();
        ATM atm = new ATM(random.nextInt(499) + 1, random.nextInt(199) + 1, random.nextInt(99) + 1);
        // вывод в консоль начального содержимого сейфа банкомата
        atm.safe(atm.twenties, atm.fifties, atm.hundred);
        // банкомат
        for (int i = 0; i < n; i++) {
            System.out.println("Какой банковской операцией банкомата воспользуетесь?\n1. Положить наличные.\n2. Cнять наличные.\n3. Прекратить обслуживание.");
            int transaction = scanner.nextInt(); // переменная для определения выбора команды банкомату
            if ((transaction >= 1) & (transaction <= 3)) {
                // пополнение банкомата
                if (transaction == 1) {
                    System.out.println("На сколько будем пополнять банкомат? (ввести количество вносимых купюр номиналом 20, 50 и 100 через пробел)");
                    depositTwenties = scanner.nextInt();
                    depositFifties = scanner.nextInt();
                    depositHundred = scanner.nextInt();
                    atm.replenishment(depositTwenties, depositFifties, depositHundred);
                    atm.safe(atm.twenties, atm.fifties, atm.hundred);
                }
                // снятие наличных
                if (transaction == 2) {
                    // обявил переменные тут, чтобы для следующей операции по выдаче они были равны 0
                    int countHundred = 0;
                    int countFifties = 0;
                    int countTwenties = 0;
                    System.out.println("Сколько наличных хотите снять? (ввести желаемую сумму целиком)");
                    withdrawalAmount = scanner.nextInt();
                    if ((atm.twenties * 20 + atm.fifties * 50 + atm.hundred * 100) >= withdrawalAmount) { // проверка на то, что в банкомате есть желаемая сумма
                        supposedCountFifties = withdrawalAmount / 50;
                        supposedCountHundred = withdrawalAmount / 100;
                        // проверки на то, что введеная сумма может быть выдана купюрами номиналом 20, 50 и 100
                        if ((withdrawalAmount > 30 | withdrawalAmount == 20) & (withdrawalAmount % 20 == 0 | (withdrawalAmount - supposedCountFifties * 50) % 20 == 0 | (withdrawalAmount - supposedCountHundred * 100) % 10 == 0)) {
                            // алгоритм выдачи купюр от больших к меньшим. здесь считаю количество купюр номиналом 100
                            for (int j = 1; j <= atm.hundred; j++) {
                                if (j * 100 <= withdrawalAmount) {
                                    countHundred++;
                                } else {
                                    // здесь убираю одну купюру номиналом 100, если нужно остаток выдать купюрами номиналом 50 и 20. Пример при вводе 1710, чтобы алгортим посчитал 16 купюр номиналом 100 и перешел дальше
                                    if (withdrawalAmount - countHundred * 100 == 10 | withdrawalAmount - countHundred * 100 == 30) {
                                        countHundred--;
                                    }
                                    break;
                                }
                            }
                            // здесь считаю количество купюр номиналом 50
                            for (int j = 1; j <= atm.fifties; j++) {
                                if (j * 50 <= withdrawalAmount - countHundred * 100) {
                                    countFifties++;
                                } else {
                                    break;
                                }
                            }
                            // здесь считаю количество купюр номиналом 20
                            for (int j = 1; j <= atm.twenties; j++) {
                                if (j * 20 <= withdrawalAmount - countHundred * 100 - countFifties * 50) {
                                    countTwenties++;
                                } else {
                                    // здесь убираю одну купюру номиналом 50 и пересчитываю купюры номиналом 20. Были какие-то проблемы с выдачей 180
                                    if (withdrawalAmount - countHundred * 100 - countFifties * 50 - countTwenties * 20 == 10 & atm.fifties > 0) {
                                        countTwenties = 0;
                                        countFifties--;
                                        for (int k = 1; k <= atm.twenties; k++) {
                                            if (k * 20 <= withdrawalAmount - countHundred * 100 - countFifties * 50) {
                                                countTwenties++;
                                            }
                                        }
                                    } else {
                                        // здесь идёт подсчёт в случае отсутствия купюр номиналом 50 в банкомате. были проблемы с логикой, что счётчик 50ок уходил в минус
                                        if (withdrawalAmount - countHundred * 100 - countFifties * 50 - countTwenties * 20 == 10) {
                                            countTwenties = 0;
                                            for (int k = 1; k <= atm.twenties; k++) {
                                                if (k * 20 <= withdrawalAmount - countHundred * 100 - countFifties * 50) {
                                                    countTwenties++;
                                                }
                                            }
                                        }
                                    }
                                    break;
                                }
                            }
                            if (withdrawalAmount == countHundred * 100 + countFifties * 50 + countTwenties * 20) {
                                success = true;
                                System.out.println(success);
                                System.out.println("Вот ваши наличные:\n" + countTwenties + " купюр номиналом 20 фертингов;\n" + countFifties + " купюр номиналом 50 фертингов;\n" + countHundred + " купюр номиналом 100 фертингов.");
                                atm.withdrawal(countTwenties, countFifties, countHundred);
                                atm.safe(atm.twenties, atm.fifties, atm.hundred);
                            } else {
                                success = false;
                                System.out.println(success);
                                System.out.println("В банкомате не хватает купюр для выдачи Вашей суммы наличными.");
                            }
                        } else {
                            success = false;
                            System.out.println(success);
                            System.out.println("Банкомат не может выдать эту сумму полностью т.к. расчитан на купюры номиналом 20, 50 и 100 фертингов. Укажите сумму для снятия подходящую этим условиям.");
                        }
                    } else {
                        success = false;
                        System.out.println(success);
                        System.out.println("В банкомате нет сколько наличных. Укажите другую сумму для снятия или сначала положите деньги в банкомат.");
                    }
                }
                // прекращение обслуживания банкоматом
                if (transaction == 3) {
                    System.out.println("Спасибо за то, что воспользовались нашим банкоматом!");
                    System.exit(0);
                }
            } else {
                // сообщение если введено число вне диапазона от 1 до 3
                System.out.println("Данная банковская операция не поддерживается нашим банкоматом!");
            }
            // после n циклов банкомат завершает свою работу, прощание на последнем цикле
            if (i == n - 1) {
                System.out.println("Спасибо за то, что воспользовались нашими услугами!");
            }
        }
    }
}
