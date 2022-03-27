package BasicSyntaxConditionaLStatementsAndLoops.ArraysLab.Exc;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean isFound= false;
        for (int i = 0; i <arr.length ; i++) {
            int leftSum = 0;
            for (int j = 0; j <i ; j++) {
                leftSum+=arr[j];
            }
            int rightSum = 0;
            for (int j = arr.length-1; j >i ; j--) {
                rightSum+=arr[j];
            }
            if(leftSum==rightSum&&!isFound){
                System.out.print(i);
                isFound=true;
            }
        }
        if(!isFound){
            System.out.println("no");
        }
    }
}
