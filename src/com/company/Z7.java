package com.company;

import java.util.Random;

public class Z7 {
    void getResult() {
        int[] D = new int[30];
        int sum_0 = 0, sum_1 = 0;

        Random r = new Random();

        System.out.println("\nИсходный массив:");

        for (int i = 0; i < D.length; i++) {
            D[i] = r.nextInt(100);
            System.out.print(D[i] + " ");

            if (i % 2 == 0)
                sum_0 += D[i];
            else
                sum_1 += D[i];
        }

        System.out.println("\n\nCумма четных: " + sum_0);
        System.out.println("Cумма нечетных: " + sum_1);
    }
}
