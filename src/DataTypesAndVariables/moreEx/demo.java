package DataTypesAndVariables.moreEx;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        for (int i = 2; i <= input; i++) {
            boolean isPrime = true;
            for (int index = 2; index < i; index++) {
                if (i % index == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, isPrime);
        }

    }}
