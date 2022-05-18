package Fundamentals.BasicSyntax.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split(" ");
        for (int i = 0; i <arr.length/2; i++) {
            int index = arr.length-1-i;
            String current = arr[i];
            arr[i]= arr[index];
            arr[index] = current;
        }

        for (String n:arr
             ) {
            System.out.print(n+" ");

        }
    }
}
