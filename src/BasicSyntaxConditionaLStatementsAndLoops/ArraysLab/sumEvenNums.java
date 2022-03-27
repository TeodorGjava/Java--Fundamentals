package BasicSyntaxConditionaLStatementsAndLoops.ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class sumEvenNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] nums = Arrays
                .stream(sc.nextLine().split(" "))
                        .mapToInt(e->Integer.parseInt(e))
                        .toArray();
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]%2==0){
                sum+=nums[i];
            }
        }
        System.out.println(sum);
    }
}
