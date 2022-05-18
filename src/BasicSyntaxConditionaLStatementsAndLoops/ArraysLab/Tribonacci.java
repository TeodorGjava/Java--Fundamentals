package Fundamentals.BasicSyntax.Arrays;

import java.util.Scanner;

public class Tribonacci {
    static int fib(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return 0;
        }
        if (n == 3) {
            return 1;
        } else return fib(n - 1) + fib(n - 2) + fib(n - 3);
    }private static void print(int n){
        int[] arr = new int[n + 3];
        for (int i = 3; i <n+3 ; i++) {
            arr[i]= fib(i);
        }
        for (int i = 3; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        print(Integer.parseInt(sc.nextLine()));
    }
}
