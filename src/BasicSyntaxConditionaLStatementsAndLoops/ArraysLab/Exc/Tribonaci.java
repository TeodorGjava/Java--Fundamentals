package BasicSyntaxConditionaLStatementsAndLoops.ArraysLab.Exc;

import java.util.Scanner;

public class Tribonaci {
    static int fib(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return 0;
        }
        if (n == 3) {
            return 1;
        } else return fib(n - 1) + fib(n - 2) + fib(n - 3);
    }private static int[] print(int n){
        int[] arr = new int[n + 3];
        for (int i = 3; i <n+3 ; i++) {
            arr[i]= fib(i);
        }
        for (int i = 3; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        print(num);
    }
}






