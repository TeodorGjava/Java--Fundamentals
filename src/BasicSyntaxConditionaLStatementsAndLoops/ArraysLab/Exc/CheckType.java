package BasicSyntaxConditionaLStatementsAndLoops.ArraysLab.Exc;

import java.util.Scanner;

public class CheckType {
    public static void check(String s) {
        System.out.printf("$%s$", s);
    }

    public static void check(int s) {
        System.out.print(s * 2);
    }

    public static void check(double s) {
        System.out.printf("%.2f",s*1.5);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();

        switch (type) {
            case "int":
                check(Integer.parseInt(sc.nextLine()));
                break;
            case "string":
                check(sc.nextLine());
                break;
            case"real":
                check(Double.parseDouble(sc.nextLine()));
                break;
        }
    }
}

