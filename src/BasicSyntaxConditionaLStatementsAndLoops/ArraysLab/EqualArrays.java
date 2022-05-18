package Fundamentals.BasicSyntax.Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt)
               .toArray();
       int[] arr2 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt)
               .toArray();
       int sum = 0;
       int diff=0;
       boolean arraysAreEqual;
       if(arr.length!=arr.length){
           arraysAreEqual=false;
       }else {
           arraysAreEqual=true;
           for (int i = 0; i <arr.length ; i++) {
               sum+=arr[i];
               if(arr[i]!= arr2[i]){
                   arraysAreEqual = false;
                   diff = i;
                   break;
               }
           }
       }
       if(arraysAreEqual){
           System.out.println("Arrays are identical. Sum: "+ sum);

       }else {
           System.out.println("Arrays are not identical. Found difference at "+ (diff) + " index.");
       }
    }
}
