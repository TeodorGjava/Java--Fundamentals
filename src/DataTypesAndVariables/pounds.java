package DataTypesAndVariables;

import java.util.Scanner;

public class pounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dollars = Double.parseDouble(sc.nextLine());
        double pound = dollars*1.36;
        System.out.printf("%.3f",pound);
    }
}
