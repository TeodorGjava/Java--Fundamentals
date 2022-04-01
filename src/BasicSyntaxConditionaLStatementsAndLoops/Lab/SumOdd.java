package BasicSyntaxConditionaLStatementsAndLoops.Lab;

import java.util.Scanner;

public class SumOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        int num= 1;

        for (int i = 0; i <n; i++,num+=2) {
            System.out.println(num);
            sum+=num;
        }
        System.out.println("Sum: "+sum);
    }
}
