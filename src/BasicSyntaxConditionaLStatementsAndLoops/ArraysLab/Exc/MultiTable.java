package BasicSyntaxConditionaLStatementsAndLoops.Lab;

import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int x = Integer.parseInt(sc.nextLine());
        if (x<=10){
        for (int i = x; i <=10 ; i++) {
            int sum = i*n;
            System.out.printf("%s X %s = %s\n",n,i,sum);
        }}else {
            System.out.printf("%s X %s = %s\n",n,x,n*x);
        }
    }
}
