package BasicSyntaxConditionaLStatementsAndLoops.ArraysLab.Exc;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int target = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < arr.length; i++) {
            int first = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (first + arr[j] == target)
                {
                    System.out.print(first + " " + arr[j]+"\n");
                    break;
                }
            }
        }
    }
}
