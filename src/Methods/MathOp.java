package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOp {
    public static double calc(double a, String operator,double b){
        double result = 0;
        switch (operator){
            case "/":
                result= a/b;
                break;
                case "*":
                    result= a*b;
                break;
                case "-":
                    result= a-b;
                break;
                case "+":
                    result= a+b;
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        String op = sc.nextLine();
        int b = Integer.parseInt(sc.nextLine());
        System.out.println(new DecimalFormat("0.####").format(calc(a,op,b)));
    }
}
