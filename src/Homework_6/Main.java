package Homework_6;

import java.util.Random;

/*
Создать класс с как минимум 4 разными методами,
в каждом методе добавить проверку на исключительные ситуации, используя:
1. try- catch;
2. try-catch, где catch будет несколько;
3. try -catch, с использованием multi - catch;
4. try-catch-finally.
Продемонстрировать обработку исключительных ситуаций на примерах.
 */

public class Main {

    public static void main(String[] args) {
        try {
            // сценарий для появления в консоли ошибки Index out 4 of bounds for length 3
            int[] array = {1, 2, 3};
            array[4] = 4;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("1. Произошла ошибка при обращении к индексу массива вне его диапазона.");
        }
        // вызов второго метода
        exceptionTwo();
    }

    public static void exceptionTwo() {
        try {
            // сценарий для появления в консоли ошибок "/ by zero" и "Index out 4 of bounds for length 3"
            Random random = new Random();
            int[] array = {1, 2, 3};
            array[0] = array[0] / random.nextInt(2);
            array[4] = 4;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("2. Произошла ошибка при обращении к индексу массива вне его диапазона.");
        } catch (ArithmeticException e) {
            System.out.println("2. Произошла ошибка при делении на ноль.");
        }
        // вызов третьего метода
        exceptionThree();
    }

    public static void exceptionThree() {
        try {
            // сценарий для появления в консоли ошибок "/ by zero" и "Index out 4 of bounds for length 3"
            Random random = new Random();
            int[] array = {2, 4, 6};
            array[0] = array[0] / random.nextInt(2);
            array[4] = 4;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("3. Произошла ошибка: " + e);
        }
        // вызов четвертого метода
        exceptionFour();
    }

    public static void exceptionFour() {
        try {
            // сценарий для появления в консоли ошибки Index out 4 of bounds for length 3
            int[] array = {2, 4, 6};
            array[4] = 4;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("4.1. Произошла ошибка при обращении к индексу массива вне его диапазона.");
        } finally {
            System.out.println("4.2. Выполнение блока finally при восзпроизведении ошибки.");
        }
    }
}
