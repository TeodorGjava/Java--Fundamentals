package Fundamentals.BasicSyntax.Arrays;

import java.util.Scanner;

public class Train {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Calc(sc, n);
    }

    private static void Calc(Scanner sc, int n) {
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
            sum+=arr[i];
        }
        for (int j : arr) {
            System.out.print(j + " ");

        }
        System.out.println();
        System.out.println(sum);
    }
}
