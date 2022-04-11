package com.company;

import java.util.Random;

public class Z6 {
    void getResult() {
        int[] C = new int[20];
        float sum = 0;

        Random r = new Random();

        System.out.println("\nИсходный массив:");

        for (int i = 0; i < C.length; i++) {
            C[i] = r.nextInt(100);
            System.out.print(C[i] + " ");
        }

        for (int i = 0; i < C.length; i++) {
            sum += C[i];
        }

        System.out.print("\n\nСреднее значение: " + (sum / C.length));
    }
}
