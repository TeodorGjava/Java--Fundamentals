package BasicSyntaxConditionaLStatementsAndLoops.ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class StrToIntArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lineNums = sc.nextLine();
        //split with " "(space)
        String[] numsAsString = lineNums.split(" ");
        int[] nums = new int[numsAsString.length];
        for (int i = 0; i < numsAsString.length; i++) {
            nums[i] = Integer.parseInt(numsAsString[i]);

        }
        //for each loops thru all elements
        for(int n : nums){
            System.out.print(n+ " ");
        }

    }
}
