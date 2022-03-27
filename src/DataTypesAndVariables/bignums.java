package DataTypesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class bignums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        BigDecimal sum = new BigDecimal(0);
        for (int i = 1; i <=n ; i++) {
            BigDecimal num = new BigDecimal(sc.nextLine());
            sum = sum.add(num);
        }
        System.out.println(sum);


    }
}
