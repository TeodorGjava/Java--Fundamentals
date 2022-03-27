package BasicSyntaxConditionaLStatementsAndLoops.ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class Kamino {
    static void proba(int n, String s) {
        Scanner sc = new Scanner(System.in);
        String[] dna = new String[n];

        int bestSum = 0;
        int first = 1;
        int currentIndex = 1000;
        String bestLine = "";
        while (!s.equals("Clone them!")) {
            int firstIndex = 0;
            int sum = 0;
            int current = 0;
            int[] arr = Arrays.stream(s.split("[!]")).mapToInt(Integer::parseInt).toArray();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0 && arr[i + 1] == arr[i]) {
                    firstIndex = i;
                    if (firstIndex < currentIndex) {
                        currentIndex = firstIndex;
                        bestLine = s;
                    }
                    sum += arr[i];
                    if (sum > bestSum) {
                        bestSum = sum;
                    }
                }

            }
            first++;
            s = sc.nextLine();
        }
        System.out.printf("Best DNA sample %s with sum: %s.", first, bestSum);
        System.out.println(bestLine);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        proba(Integer.parseInt(sc.nextLine()), sc.nextLine());
    }
}
