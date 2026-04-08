package Homework_5_2;

import java.util.Random;

/*
Написать иерархию классов Фигура: Треугольник, Прямоугольник, Круг.
Реализовать функцию подсчета площади для каждого типа фигуры и подсчет
периметра (используя абстрактный класс/методы). Создать массив из 5 разных фигур.
Вывести на экран сумму периметра всех фигур в массиве
*/

public class Circle extends Figure {
    int r;
    // переменные для вычисления периметра и площади
    double p;
    double s;
    Random random = new Random();
    // конструктор круга
    public Circle() {
        this.r = random.nextInt(10) + 1;
        System.out.println("Создан круг с радиусом: " + this.r);
    }
    // метод вычисления периметра
    @Override
    public double perimeter() {
        p = 2 * Math.PI * r;
        return p;
    }
    // метод вычисления площади
    @Override
    public double area() {
        s = Math.PI * Math.pow(r, 2);
        return s;
    }
    // переопределение метода для вывода в массиве читаемого названия созданной фигуры
    @Override
    public String toString() {
        return "Круг";
    }
}
