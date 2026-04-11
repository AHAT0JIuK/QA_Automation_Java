package Homework_8.Homework_8_3;

/*
На вход поступает массив строк, верните Map<String, Boolean>,
где каждая отдельная строка является ключом, и ее значение равно true,
если эта строка встречается в массиве 2 или более раз.
Пример:
wordMultiple(["a", "b", "a", "c", "b"])→{"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"])→{"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"])→{"c": true}
*/

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // ввод массива строк
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массив строк через пробел");
        String string = scanner.nextLine();
        // преобразование строки в массив
        String[] wordMultiple = string.split(" ");
        // вычисление длины полученного массива
        int lengthArray = wordMultiple.length;
        // заполняю вспомогательную коллекцию строками для избавления от дубликатов
        Set<String> supportCollection = new HashSet<>();
        supportCollection.addAll(Arrays.asList(wordMultiple).subList(0, lengthArray));
        // вычисление размера вспомогательной коллекции
        int sizeSupportCollection = supportCollection.size();
        // заполняю вспомогательный массив с уникальными строковыми значениями потому что в коллекции HashSet нельзя обращаться к элементу по индексу
        String[] supportArray = supportCollection.toArray(new String[sizeSupportCollection]);
        // вычисление размера вспомогательного массива
        int sizeSupportArray = supportArray.length;
        // заполнние и вывод итоговой хэш-мапы
        Map<String, Boolean> doubleMap = new HashMap<>();
        int countDouble = 0;
        for (int i = 0; i < sizeSupportArray; i++) {
            for (int j = 0; j < lengthArray; j++) {
                if (supportArray[i].contains(wordMultiple[j])) {
                    countDouble++;
                }
            }
            if (countDouble > 1) {
                doubleMap.put(supportArray[i], true);
            } else {
                doubleMap.put(supportArray[i], false);
            }
            countDouble = 0;
        }
        System.out.println(doubleMap);
    }
}
