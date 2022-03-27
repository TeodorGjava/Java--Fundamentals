package BasicSyntaxConditionaLStatementsAndLoops.ArraysLab.Exc;

import java.util.Arrays;
import java.util.Scanner;

public class ArrRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i <n ; i++) {
            int last = arr[0];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j]= arr[j+1];
            }
            arr[arr.length-1]=last;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
