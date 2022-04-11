package com.company;

public class Z1 {
    double sum = 0;

    void getResult() {
        for (double i = 1; i <= 10000; i++) {
            sum += i % 2 == 0 ? -(1. / i) : 1. / i;
        }
        System.out.println("\nОтвет: " + String.valueOf(sum));
    }
}
