package Homework_5_2;

import java.util.Random;

/*
Написать иерархию классов Фигура: Треугольник, Прямоугольник, Круг.
Реализовать функцию подсчета площади для каждого типа фигуры и подсчет
периметра (используя абстрактный класс/методы). Создать массив из 5 разных фигур.
Вывести на экран сумму периметра всех фигур в массиве
*/

public class Rectangle extends Figure {
    // объявление сторон прямоугольника
    int a;
    int b;
    // переменные для вычисления периметра и площади
    int p;
    int s;
    Random random = new Random();
    // конструктор прямоугольника
    public Rectangle() {
        this.a = random.nextInt(10) + 1;
        this.b = random.nextInt(10) + 1;
        System.out.println("Создан прямоугольник со сторонами: " + this.a + " " + this.b + " " + this.a + " " + this.b);
    }
    // метод вычисления периметра
    @Override
    public double perimeter() {
        p = (a + b) * 2;
        return p;
    }
    // метод вычисления площади
    @Override
    public double area() {
        s = a * b;
        return s;
    }
    // переопределение метода для вывода в массиве читаемого названия созданной фигуры
    @Override
    public String toString() {
        return "Прямоугольник";
    }
}
