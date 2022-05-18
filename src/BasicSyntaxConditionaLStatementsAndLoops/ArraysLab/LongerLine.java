package Fundamentals.BasicSyntax.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LongerLine {
    private static void longer(double x1, double y1, double x2, double y2,double x3, double y3, double x4, double y4) {
        double first = Math.abs(Math.sqrt(Math.pow(x1 - y1, 2) + Math.sqrt(Math.pow(x2 - y2, 2))));
        double second = Math.abs(Math.sqrt(Math.pow(x3- y3, 2) + Math.sqrt(Math.pow(x4 - y4, 2))));
        if (first >= second) {
            closest(x1,y1,x2,y2);
        }else {
            closest(x3,y3,x4,y4);
        }

    }
    private static void closest(double a, double b, double c, double d) {
        double first = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double second = Math.sqrt(Math.pow(c, 2) + Math.pow(d, 2));
        if (first > second) {
            System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", c, d, a, b);
        } else{
            System.out.printf("(%.0f, %.0f)(%.0f, %.0f)",a,b,c,d);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        longer(Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),
                Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),
                Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),
                Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));

    }
}
