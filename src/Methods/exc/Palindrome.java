package MethodsLab.exc;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    private static boolean check(String arr){
        boolean isEqual= false;
        String[] arr1 = new String[arr.length()];
        String[] arr2 = new String[arr.length()];
        for (int i = 0; i <arr.length() ; i++) {
            arr1[i]=String.valueOf(arr.charAt(i));

        }
        for (int j = 0; j<arr.length(); j++) {
            arr2[j]= arr1[arr1.length-j-1];
        }

        if (Arrays.equals(arr1, arr2)){
            isEqual=true;
        }
       return isEqual;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.equals("END")){
            System.out.println(check(input));
        input=sc.nextLine();

        }
    }
}
