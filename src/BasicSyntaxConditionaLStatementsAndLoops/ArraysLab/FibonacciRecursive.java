package Fundamentals.BasicSyntax.Arrays;

import java.util.Scanner;

public class FibonacciRecursive {
    public static int fibb(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else {
            return fibb(n-1)+fibb(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(fibb(n));
    }
}
