package Homework_4_1;

import java.util.Random;
import java.util.Scanner;

/*
Создать класс CreditCard c полями номер счета, текущая сумма на счету.
Добавьте метод, который позволяет начислять сумму на кредитную карточку.
Добавьте метод, который позволяет снимать с карточки некоторую сумму.
Добавьте метод, который выводит текущую информацию о карточке.
Напишите программу, которая создает три объекта класса CreditCard у которых заданы
номер счета и начальная сумма.
Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с третьей.
Выведите на экран текущее состояние всех трех карточек.
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCard;
        int replenishmentAmount;
        int withdrawalAmount;
        int[] easter_egg = new int[3];
        //заполнение данных о кредитных картах
        Random random = new Random();
        CreditCard creditCard1 = new CreditCard();
        creditCard1.accountNumber = "42288528339452491470";
        creditCard1.balance = (random.nextInt(9) + 1) * 10000;
        CreditCard creditCard2 = new CreditCard();
        creditCard2.accountNumber = "58100403434821223172";
        creditCard2.balance = (random.nextInt(9) + 1) * 10000;
        CreditCard creditCard3 = new CreditCard();
        creditCard3.accountNumber = "26553824391618778544";
        creditCard3.balance = (random.nextInt(9) + 1) * 10000;
        // вывод в консоль начального баланса по картам
        creditCard1.info(1, creditCard1.accountNumber, creditCard1.balance);
        creditCard2.info(2, creditCard2.accountNumber, creditCard2.balance);
        creditCard3.info(3, creditCard3.accountNumber, creditCard3.balance);
        // банкомат
        for (int i = 0; i < 5; i++) {
            System.out.println("Какой банковской операцией банкомата воспользуетесь?\n1. Пополнить карту.\n2. Cнять наличные.\n3. Узнать баланс карты.\n4. Прекратить обслуживание.");
            int transaction = scanner.nextInt();
            if ((transaction >= 1) & (transaction <= 4)) {
                // пополнение карты
                if (transaction == 1) {
                    System.out.println("Какую карту и на сколько нужно пополнить? (ввести номер карты и сумму пополнения через пробел)");
                    numberCard = scanner.nextInt();
                    replenishmentAmount = scanner.nextInt();
                    if (numberCard == 1) {
                        creditCard1.balance = creditCard1.replenishment(creditCard1.balance, replenishmentAmount);
                        creditCard1.info(numberCard, creditCard1.accountNumber, creditCard1.balance);
                    }
                    if (numberCard == 2) {
                        creditCard2.balance = creditCard2.replenishment(creditCard2.balance, replenishmentAmount);
                        creditCard2.info(numberCard, creditCard2.accountNumber, creditCard2.balance);
                    }
                    if (numberCard == 3) {
                        creditCard3.balance = creditCard3.replenishment(creditCard3.balance, replenishmentAmount);
                        creditCard3.info(numberCard, creditCard3.accountNumber, creditCard3.balance);
                    }
                }
                // снятие наличных с карты
                if (transaction == 2) {
                    System.out.println("С какой карты и сколько нужно снять? (ввести номер карты и сумму снятия через пробел)");
                    numberCard = scanner.nextInt();
                    withdrawalAmount = scanner.nextInt();
                    if (numberCard == 1) {
                        if (creditCard1.balance - withdrawalAmount >= 0) {
                            creditCard1.balance = creditCard1.withdrawal(creditCard1.balance, withdrawalAmount);
                            creditCard1.info(numberCard, creditCard1.accountNumber, creditCard1.balance);
                        } else {
                            System.out.println("На выбранной карте недостаточно средств");
                        }
                    }
                    if (numberCard == 2) {
                        if (creditCard2.balance - withdrawalAmount >= 0) {
                            creditCard2.balance = creditCard2.withdrawal(creditCard2.balance, withdrawalAmount);
                            creditCard2.info(numberCard, creditCard2.accountNumber, creditCard2.balance);
                        } else {
                            System.out.println("На выбранной карте недостаточно средств");
                        }
                    }
                    if (numberCard == 3) {
                        if (creditCard3.balance - withdrawalAmount >= 0) {
                            creditCard3.balance = creditCard3.withdrawal(creditCard3.balance, withdrawalAmount);
                            creditCard3.info(numberCard, creditCard3.accountNumber, creditCard3.balance);
                        } else {
                            System.out.println("На выбранной карте недостаточно средств");
                        }
                    }
                }
                // запрос баланса карты
                if (transaction == 3) {
                    System.out.println("Баланс какой карты нужно показать? (ввести номер карты)");
                    numberCard = scanner.nextInt();
                    if (numberCard == 1) {
                        creditCard1.info(numberCard, creditCard1.accountNumber, creditCard1.balance);
                    }
                    if (numberCard == 2) {
                        creditCard2.info(numberCard, creditCard2.accountNumber, creditCard2.balance);
                    }
                    if (numberCard == 3) {
                        creditCard3.info(numberCard, creditCard3.accountNumber, creditCard3.balance);
                    }
                }
                // прекращение обслуживания банкоматом
                if (transaction == 4) {
                    System.out.println("Спасибо за то, что воспользовались нашим банкоматом!");
                    System.exit(0);
                }
            } else {
                // сообщение если введено число вне диапазона от 1 до 4
                System.out.println("Данная банковская операция не поддерживается нашим банкоматом!");
            }
            /*
            пасхалка - тестовый сценарий. После совершения последовательно двух операций пополнения и последующего снятия,
            в консоли отображается текущее состояние всех трех карточек
            */
            easter_egg[0] = easter_egg[1];
            easter_egg[1] = easter_egg[2];
            easter_egg[2] = transaction;
            if ((easter_egg[0] == 1) & (easter_egg[1] == 1) & (easter_egg[2] == 2)) {
                System.out.println("Поздравляю! Вы совершили тестовый сценарий.");
                creditCard1.info(1, creditCard1.accountNumber, creditCard1.balance);
                creditCard2.info(2, creditCard2.accountNumber, creditCard2.balance);
                creditCard3.info(3, creditCard3.accountNumber, creditCard3.balance);
            }
            // после 5 циклов банкомат завершает свою работу, прощание на последнем цикле
            if (i == 4) {
                System.out.println("Спасибо за то, что воспользовались нашими услугами!");
            }
        }
    }
}
