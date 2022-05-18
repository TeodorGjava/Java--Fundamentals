package MethodsLab.exc;

import java.util.Scanner;

public class Middle {
    public static void printMiddle(String a){
        char ch;
        char ch1;
        if(a.length()%2==0){
            ch = a.charAt(a.length()/2-1);
            ch1 =a.charAt(a.length()/2);
            System.out.println(ch+""+ch1);
        }else {
            System.out.println(a.charAt(a.length()/2));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printMiddle(sc.nextLine());
    }
}
