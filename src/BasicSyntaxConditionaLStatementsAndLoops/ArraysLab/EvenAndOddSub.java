package Fundamentals.BasicSyntax.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt)
                .toArray();
        int even = 0;
        int odd = 0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]%2==0){
                even+=nums[i];
            }else {
                odd +=nums[i];
            }
        }
        System.out.println(even-odd);
    }
}
