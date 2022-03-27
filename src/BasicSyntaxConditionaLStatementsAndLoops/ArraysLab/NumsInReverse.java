package BasicSyntaxConditionaLStatementsAndLoops.ArraysLab;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class NumsInReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int n = Integer.parseInt(sc.nextLine());
        Integer[] nums = new Integer[n];
        for (int i = 0; i <n ; i++) {
            int input = Integer.parseInt(sc.nextLine());
            nums[i] = input;
        }
        for (int i = nums.length-1; i >=0 ; i--) {
            System.out.printf("%d ",nums[i]);
        }
    */
        String lineNums = sc.nextLine();

        String[] numsAsString = lineNums.split(" ");
        int[] nums = new int[numsAsString.length];
        for (int i = 0; i < numsAsString.length; i++) {
            nums[i] = Integer.parseInt(numsAsString[i]);
    }
        //reversing order
        for (int i = 0; i <nums.length/2 ; i++) {
            //if length = 5; length - 1 - 0= 4
            //                  length - 1 - 2 =3
            //
            int index = nums.length-1-i;
            nums[i] = nums[index];
            nums[index] = index;
        }
        for (int i = 0; i <nums.length ; i++) {
            System.out.println(nums[i] + "|");
        }

}}
