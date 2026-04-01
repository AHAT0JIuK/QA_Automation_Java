package Homework_4_2;

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

public class ATM {
    // объявление переменных
    int twenties;
    int fifties;
    int hundred;

    {
        System.out.println("Создается банкомат...");
    }

    public ATM(int twenties, int fifties, int hundred) {
        this.twenties = twenties;
        this.fifties = fifties;
        this.hundred = hundred;
    }

    // пополнение
    public void replenishment(int x, int y, int z) {
        twenties += x;
        fifties += y;
        hundred += z;
    }

    // снятие
    public void withdrawal(int x, int y, int z) {
        twenties -= x;
        fifties -= y;
        hundred -= z;
    }

    // сейф
    public void safe(int x, int y, int z) {
        System.out.println("В сейфе банкомата находится:\n" + x + " купюр номиналом 20 фертингов;\n" + y + " купюр номиналом 50 фертингов;\n" + z + " купюр номиналом 100 фертингов.");
    }
}

