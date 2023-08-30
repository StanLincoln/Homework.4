package Homework4;
//        №2
//        Реализовать программу, выводящую на экран результаты:
//        Сложения двух чисел
//        Вычитания двух чисел
//        Умножения двух чисел
//        Деления двух чисел
//        Каждая из арифметических операций должна быть реализована как отдельный метод.

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа:  ");
        int myInt1 = scanner.nextInt();
        int myInt2 = scanner.nextInt();

        System.out.println("Сумма чисел = " + add(myInt1, myInt2));
        System.out.println("Разница чисел = " + subtrack(myInt1, myInt2));
        System.out.println("Произведение чисел = " + multiply(myInt1, myInt2));
        System.out.println("Деление чисел = " + divide(myInt1, myInt2));
    }

    static int add(int myInt1, int myInt2) {
        return myInt1 + myInt2;
    }

    static int subtrack(int myInt1, int myInt2) {
        return myInt1 - myInt2;
    }

    static int multiply(int myInt1, int myInt2) {
        return myInt1 * myInt2;
    }

    static int divide(int myInt1, int myInt2) {
       return myInt1/myInt2;
    }
}