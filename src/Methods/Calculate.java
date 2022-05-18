package MethodsLab;

import java.util.Scanner;

public class Calculate {
    public static void add(int a, int b){
        System.out.println(a+b);
    }
    public static void divide(int a, int b){
        System.out.println(a/b);
    }
    public static void subtract(int a, int b){
        System.out.println(a-b);
    }
    public static void multi(int a, int b){
        System.out.println(a*b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String comand = sc.nextLine();
        switch (comand){
            case"add":
                add(Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
                break;
            case"divide":
                divide(Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
                break;
            case"subtract":
                subtract(Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
                break;
            case"multiply":
                multi(Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
                break;
        }

    }
}
