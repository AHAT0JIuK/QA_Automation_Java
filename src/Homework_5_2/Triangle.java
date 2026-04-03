package Homework_5_2;

import java.util.Random;

/*
Написать иерархию классов Фигура: Треугольник, Прямоугольник, Круг.
Реализовать функцию подсчета площади для каждого типа фигуры и подсчет
периметра (используя абстрактный класс/методы). Создать массив из 5 разных фигур.
Вывести на экран сумму периметра всех фигур в массиве
*/

public class Triangle extends Figure {
    // объявление переменных для трех сторон треугольника
    int a;
    int b;
    int c;
    // вспомогательные переменные для определения величины третьей стороны
    int count;
    int j = 0;
    int minSide;
    int maxSide;
    // переменные для вычисления периметра и площади
    int p;
    double halfP;
    double s;
    Random random = new Random();
    // конструктор треугольника
    public Triangle() {
        // генерирую стороны a и b
        this.a = random.nextInt(10) + 1;
        this.b = random.nextInt(10) + 1;
        // выясняю какая из сторон максимальная и минимальная
        if (this.a < this.b) {
            minSide = this.a;
            maxSide = this.b;
        } else {
            minSide = this.b;
            maxSide = this.a;
        }
        // генерирую сторону c так чтобы выполнялись условия: a + b > c, a + c > b, b + c > a
        for (int i = maxSide - minSide + 1; i < maxSide + minSide; i++) {
            count++; // вычисляю количество возможных целых чисел с удовлетворящиюх условиям: a + b > c, a + c > b, b + c > a
        }
        // заполняю массив этими числами, чтобы взять из них случайное для стороны c
        int[] cSide = new int[count];
        for (int i = maxSide - minSide + 1; i < maxSide + minSide; i++) {
            cSide[j] = i;
            j++;
        }
        this.c = cSide[random.nextInt(count)];
        System.out.println("Создан треугольник со сторонами: " + this.a + " " + this.b + " " + this.c);

    }
    // метод вычисления периметра
    @Override
    public double perimeter() {
        p = a + b + c;
        return p;
    }
    // метод вычисления площади
    @Override
    public double area() {
        halfP = (double) (a + b + c) / 2;
        s = Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));
        return s;
    }
    // переопределение метода для вывода в массиве читаемого названия созданной фигуры
    @Override
    public String toString() {
        return "Треугольник";
    }
}
