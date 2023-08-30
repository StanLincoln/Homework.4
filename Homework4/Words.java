package Homework4;

//        №1
//        Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
//        Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
//        Например:
//        ввод - mama, papa
//        вывод - mapa

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое слово: ");
        String word1 = scanner.next();

        System.out.print("Введите второе слово: ");
        String word2 = scanner.next();

        if (word1.length() % 2 == 0 && word2.length() % 2 == 0) {
            int halfLength1 = word1.length() / 2;
            int halfLength2 = word2.length() / 2;

            String halfWord1 = word1.substring(0, halfLength1);
            String halfWord2 = word2.substring(halfLength2);

            System.out.println("Результат: " + halfWord1 + halfWord2);
        } else {
            System.out.println("Оба слова должны состоять из четного количества букв.");
        }
    }
}

