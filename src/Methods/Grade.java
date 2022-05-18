package MethodsLab;

import java.util.Scanner;

public class Grade {
    public static void grade(double n) {
        if (n <= 2.99) {
            System.out.println("Fail");
        } else if (n > 2.99 && n <= 3.49) {
            System.out.println("Poor");
        } else if (n > 3.49 && n <= 4.49) {
            System.out.println("Good");
        } else if (n >= 4.50 && n <= 5.49) {
            System.out.println("Very good");
        } else if (n >= 5.50) {
            System.out.println("Excellent");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = Double.parseDouble(sc.nextLine());
        grade(n);
    }
}
