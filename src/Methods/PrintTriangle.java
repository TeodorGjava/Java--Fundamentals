package MethodsLab;

import java.util.Scanner;

public class PrintTriangle {
    public static void print(int a,int b){
        for (int i = a; i <=b ; i++) {
            System.out.print(i +" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <n ; i++) {
            print(1,i);
        }
        print(1,n);
        for (int i = n-1; i >=1 ; i--) {
print(1,i);
        }

    }
}
