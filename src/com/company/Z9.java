package com.company;

import java.util.Scanner;

public class Z9 {
    void getResult() {
        Scanner in = new Scanner(System.in);
        System.out.println("\nВведите строки:");
        System.out.print("s1: ");
        String s1 = in.next();
        System.out.print("s2: ");
        String s2 = in.next();
        System.out.print("s3: ");
        String s3 = in.next();
        System.out.print("s4: ");
        String s4 = in.next();
        System.out.print("s5: ");
        String s5 = in.next();
        if (s4.equals(s5))
            System.out.println(s1 + ", " + s2);
        else
            System.out.println(s1 + ", " + s3);
    }
}
