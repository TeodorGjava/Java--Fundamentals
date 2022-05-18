package MethodsLab;

import java.util.Scanner;

public class EvenOdds {

    public static int evenSum(int n) {
        int sumEven = 0;
        int oddsum = 0;
        while (n != 0) {
            int current = n % 10;
            if (current % 2 == 0) {
                sumEven += current;
            } else {
                oddsum += current;
            }
            n = n / 10;
        }
        return sumEven * oddsum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(evenSum(n));

    }
}
