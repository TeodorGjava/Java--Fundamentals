package MethodsLab.exc;

import java.util.Scanner;

public class AddnSubt {
    public static int calc(int a, int b, int c) {
        return (a + b) - c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(calc(Integer.parseInt(sc.nextLine())
                , Integer.parseInt(sc.nextLine())
                , Integer.parseInt(sc.nextLine())));
    }
}
