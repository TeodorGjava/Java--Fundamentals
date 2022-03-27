package BasicSyntaxConditionaLStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int n1 = 1;

        for (int i = 1; i <=n; i++) {
            //System.out.print(i);

            for (int j = 1; j<=i; j++) {
                System.out.printf("%d ",i);

            }System.out.println();
        }
    }
}
