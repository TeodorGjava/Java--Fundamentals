package MethodsLab.exc;

import java.util.Scanner;

public class NxN {
    public static void nxn(int n){
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]= n;
        }
        for(int k = 0; k<n;k++){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nxn(Integer.parseInt(sc.nextLine()));
    }
}
