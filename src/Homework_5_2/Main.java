package Homework_5_2;

import java.util.Arrays;
import java.util.Random;

/*
Написать иерархию классов Фигура: Треугольник, Прямоугольник, Круг.
Реализовать функцию подсчета площади для каждого типа фигуры и подсчет
периметра (используя абстрактный класс/методы). Создать массив из 5 разных фигур.
Вывести на экран сумму периметра всех фигур в массиве
*/

public class Main {

    public static void main(String[] args) {
        double sumPerimeters;
        double sumArea;
        Random random = new Random();
        // заполнение массива фигурами
        Figure[] figures = new Figure[5];
        for (int i = 0; i < 5; i++) {
            int type = random.nextInt(3);
            if (type == 0) {
                figures[i] = new Triangle();
            } else if (type == 1) {
                figures[i] = new Rectangle();
            } else {
                figures[i] = new Circle();
            }
        }
        System.out.println("Массив из 5 фигур:" + Arrays.toString(figures));
        //вывод на экран суммы периметров
        sumPerimeters = figures[0].perimeter() + figures[1].perimeter() + figures[2].perimeter() + figures[3].perimeter() + figures[4].perimeter();
        System.out.println("Сумма периметра фигур из массива = " + sumPerimeters);
        //вывод на экран суммы площадей
        sumArea = figures[0].area() + figures[1].area() + figures[2].area() + figures[3].area() + figures[4].area();
        System.out.println("Сумма площадей фигур из массива = " + sumArea);
    }

}
