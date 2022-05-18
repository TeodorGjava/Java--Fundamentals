package MethodsLab.exc;

import java.util.Scanner;

public class FactorialDiv {
    public static void Factorials(double a, double b) {
        double fact1 = 1;
        double fact2 = 1;
        for (int i = 1; i <= a; i++) {
            fact1 = fact1 * i;
        }
        for (int i = 1; i <= b; i++) {
            fact2 = fact2*i;
        }
        double sum = fact1/fact2;
        System.out.printf("%.2f",sum);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Factorials(Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
    }
}
