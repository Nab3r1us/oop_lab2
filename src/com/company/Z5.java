package com.company;

import java.util.Arrays;
import java.util.Random;

public class Z5 {
    void getResult() {
        int[] B = new int[25];
        int tmp;

        Random r = new Random();

        System.out.println("\nИсходный массив:");

        for (int i = 0; i < B.length; i++) {
            B[i] = r.nextInt(100);
            System.out.print(B[i] + " ");
        }

        Arrays.sort(B);

        System.out.println("\n\nНовый массив:");

        for (int i = 0; i < B.length; i++)
            System.out.print(B[i] + " ");
    }
}
