package BasicSyntaxConditionaLStatementsAndLoops.ArraysLab.Exc;

import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <=n/2 ; i++) {
            System.out.println(i);
            for (int j = i; j >n ; j--) {
                System.out.println(j);
            }

        }
    }
}
