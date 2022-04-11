package com.company;

import java.util.Scanner;

public class Z2 {
    void getResult() {
        System.out.println("Введите 0-9:");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.print("\nОтвет: ");
        switch (number) {
            case (0):
                System.out.println("Ноль");
                break;
            case (1):
                System.out.println("Один");
                break;
            case (2):
                System.out.println("Два");
                break;
            case (3):
                System.out.println("Три");
                break;
            case (4):
                System.out.println("Четыре");
                break;
            case (5):
                System.out.println("Пять");
                break;
            case (6):
                System.out.println("Шесть");
                break;
            case (7):
                System.out.println("Семь");
                break;
            case (8):
                System.out.println("Восемь");
                break;
            case (9):
                System.out.print("Девять");
                break;
            default:
                System.out.print("Некоректное число");
        }
    }
}
