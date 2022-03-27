package BasicSyntaxConditionaLStatementsAndLoops.moreEx;

import java.math.BigDecimal;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        double sum = 0;
        for (int i = 0; i <n ; i++) {
            double num = Double.parseDouble(sc.nextLine());
            sum+=num;
        }
        BigDecimal sum1= new BigDecimal(Math.abs(sum));
        System.out.println(sum1);
    }
}
