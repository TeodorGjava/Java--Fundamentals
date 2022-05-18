package Fundamentals.BasicSyntax.Arrays;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] mainArray = new int[n];
        for (int i = 1; i <2 ; i++) {
            for (int j = i-1; j <n ; j++) {
                int[] arr = new int[j+1];
                arr[j]= i *j;

                if(j==0){

                System.out.print(i);
                }else {
                    mainArray[0] = 1;
                    arr[i] = i * j;


                }
                for (int k = 0; k <arr.length ; k++) {
                    mainArray[j] = mainArray[j]*(j-k)/(k-1);

                        System.out.print(mainArray[k] + " ");
                        mainArray[k]= mainArray[k] *(j-k)/(k+1);


                }
                System.out.println();
            }}
        for (int i = 0; i <n ; i++) {

            mainArray[i]=1;
            for (int j = 0; j <=i ; j++) {
                System.out.print(mainArray[i]+ " ");
                mainArray[i]= mainArray[i]*(i-j)/(j+1);
            }
            System.out.println();
        }
        }
    }

