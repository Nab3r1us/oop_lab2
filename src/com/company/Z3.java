package com.company;

import java.util.Scanner;

public class Z3 {
    void getResult() {
        System.out.println("Введите слово (например: Один):");
        Scanner in = new Scanner(System.in);
        String number = in.next();
        System.out.print("\nОтвет: ");
        number = number.toLowerCase();
        switch (number) {
            case ("ноль"):
                System.out.println("0");
                break;
            case ("один"):
                System.out.println("1");
                break;
            case ("два"):
                System.out.println("2");
                break;
            case ("три"):
                System.out.println("3");
                break;
            case ("четыре"):
                System.out.println("4");
                break;
            case ("пять"):
                System.out.println("5");
                break;
            case ("шесть"):
                System.out.println("6");
                break;
            case ("семь"):
                System.out.println("7");
                break;
            case ("восемь"):
                System.out.println("8");
                break;
            case ("девять"):
                System.out.print("9");
                break;
            default:
                System.out.print("Некоректное число");
        }
    }
}
