package com.company;

import java.util.Random;

public class Z4 {
    public static void maxX(int n) {
        System.out.println("\n\nМаксимальный элемент: " + n);
    }

    void getResult() {
        int[] A = new int[25];
        int max_index = 0, min_index = 0, tmp;

        Random r = new Random();

        System.out.println("\nИсходный массив:");

        for (int i = 0; i < A.length; i++) {
            A[i] = r.nextInt(100);
            System.out.print(A[i] + " ");

            if (A[min_index] > A[i])
                min_index = i;

            if (A[max_index] < A[i])
                max_index = i;
        }

        maxX(A[max_index]);

        tmp = A[min_index];
        A[min_index] = A[max_index];
        A[max_index] = tmp;

        System.out.println("\nНовый массив:");

        for (int i = 0; i < A.length; i++)
            System.out.print(A[i] + " ");
    }
}
