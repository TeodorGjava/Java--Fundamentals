package Fundamentals.BasicSyntax.Arrays;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        chexck(sc);
    }

    private static void chexck(Scanner sc) {
        String[] arr = sc.nextLine().split(" ");
        String[] arr2 = sc.nextLine().split(" ");
        for (String s : arr2) {
            for (String value : arr) {
                if (s.equals(value)) {
                    System.out.print(s + " ");
                }
            }
        }
    }
}