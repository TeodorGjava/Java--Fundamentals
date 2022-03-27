package Exams.Prepare;

import java.util.Arrays;
import java.util.Scanner;

public class Jorka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] targets = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String input = sc.nextLine();
        int totalShots = 0;
        while (!input.equals("End")) {
            int shot = Integer.parseInt(input);
            if (isValid(targets, shot)) {
                int shotTarget = targets[shot];
                if (shotTarget != -1) {
                    targets[shot] = -1;
                    totalShots++;
                    targetHit(targets, shotTarget);
                }


            }
            input = sc.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", totalShots);
        printArr(targets);

    }
    private static void targetHit(int[] targets, int shotTarget) {
        for (int i = 0; i < targets.length; i++) {
            if (targets[i] != -1) {
                if (targets[i] > shotTarget) {
                    targets[i] -= shotTarget;
                } else if (targets[i] <= shotTarget) {
                    targets[i] += shotTarget;
                }
            }
        }
    }
    private static boolean isValid(int[] targets, int shot) {
        return shot < targets.length && shot >= 0;
    }
//method print arr
    private static void printArr(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "");
            if (i < array.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    private static int[] nextIntArr(Scanner sc) {
        return new int[0];
    }
}
