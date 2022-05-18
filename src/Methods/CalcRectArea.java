package MethodsLab;

import java.util.Scanner;

public class CalcRectArea {
    public static void area(int a , int b){
        System.out.println(a*b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        area(Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
    }
}
