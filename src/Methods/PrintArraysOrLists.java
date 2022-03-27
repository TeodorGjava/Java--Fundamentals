package Methods;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrintArraysOrLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        System.out.printf("%s",printArray(arr));
        int[] arr2 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(printArray(arr2));

    }
    public static String printArray(double[] arr){
        String printedArray="";
        for (int i = 0; i <arr.length ; i++) {
            printedArray+= arr[i]+" ";
        }
        return printedArray;



    }public static String printArray(int[] arr){
        String printedArray="";
        for (int i = 0; i <arr.length ; i++) {
            printedArray+= arr[i]+" ";
        }
        return printedArray;
    }
}
