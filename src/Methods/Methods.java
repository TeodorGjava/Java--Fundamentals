package MethodsLab;

import java.util.Scanner;

public class Methods {
    public static void check(int n){
        if(n>0){
            System.out.println("The number "+n+" is positive.");
        }else if(n==0){
            System.out.println("The number "+n+" is zero.");
        }else {
            System.out.println("The number "+n+" is negative.");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        check(n);
    }
}
