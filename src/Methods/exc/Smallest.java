package MethodsLab.exc;

import java.util.Scanner;

public class Smallest {
    private static void smallest(int a,int b, int c){
        if(a>=b&&b>=c){
            System.out.println(c);
        }else if(b>=a&&c>=a){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());
    smallest(a,b,c);
    }
}
