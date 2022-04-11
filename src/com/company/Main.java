package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int menu = -1;
        Scanner in = new Scanner(System.in);
        System.out.print("Задание (0-9): ");
        menu = in.nextInt();
        switch (menu) {
            case 1:
                Z1 z1 = new Z1();
                z1.getResult();
                break;
            case 2:
                Z2 z2 = new Z2();
                z2.getResult();
                break;
            case 3:
                Z3 z3 = new Z3();
                z3.getResult();
                break;
            case 4:
                Z4 z4 = new Z4();
                z4.getResult();
                break;
            case 5:
                Z5 z5 = new Z5();
                z5.getResult();
                break;
            case 6:
                Z6 z6 = new Z6();
                z6.getResult();
                break;
            case 7:
                Z7 z7 = new Z7();
                z7.getResult();
                break;
            case 8:
                Z8 z8 = new Z8();
                z8.getResult();
                break;
            case 9:
                Z9 z9 = new Z9();
                z9.getResult();
                break;
            default:
                System.out.println("Wrong case!");
        }
    }
}
