package com.company;

import java.util.Random;

public class Z8 {
    void getResult() {
        Random r = new Random();

        System.out.println("\nТаблица 3х5:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++)
                System.out.print(r.nextInt(10) + " ");
            System.out.println();
        }
    }
}
