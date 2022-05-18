package MethodsLab.exc;

import java.util.Scanner;

public class TopInteger {
    private static void isTop(String n) {

        int num = Integer.parseInt(n);
        for (int i = 1; i <= num; i++) {
            boolean isTop = false;
                int a = i % 10;
                int b = i / 10;
                if ((a + b) % 8 == 0) {
                    if (a % 2 != 0 || b % 2 != 0) {
                        isTop = true;
                }
            }
            if (isTop) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        isTop(sc.nextLine());
    }
}
