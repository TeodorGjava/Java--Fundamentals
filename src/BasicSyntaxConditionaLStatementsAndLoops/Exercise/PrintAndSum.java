package BasicSyntaxConditionaLStatementsAndLoops.Exercise;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        int y = Integer.parseInt(sc.nextLine());
        int sum= 0;
        for (int i = x; i <= y; i++) {
            sum += i;
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Sum: "+sum);
    }
}
