// 1. Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
// - сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";
// - совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.

import java.util.Scanner;
public class task1 {
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод данных от пользователя
        System.out.print("Введите первое целое число (a): ");
        int a = scanner.nextInt();
        System.out.print("Введите второе целое число (b): ");
        int b = scanner.nextInt();

        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Выполнение операций с числами и вывод результатов
        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        // Проверка деления на ноль
        if (b != 0) {
            System.out.println("Деление: " + ((double) a / b));
        } else {
            System.out.println("Деление на ноль невозможно");
        }
        System.out.println("Умножение: " + (a * b));

        scanner.close();
    }
}
}