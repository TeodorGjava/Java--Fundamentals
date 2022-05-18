package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class mathPow {
    public static double pow(double a, double b){
        return Math.pow(a,b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        System.out.println(new DecimalFormat("0.####").format(pow(a,b)));
    }
}
