package BasicSyntaxConditionaLStatementsAndLoops.ArraysLab.Exc;

import java.util.Scanner;

public class Password {
    public static boolean checkLen(String x) {
        if (x.length() < 6 || x.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        } else {
            return true;
        }
    }
    public static boolean checkChars(String x) {
        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            if (ch < 48 || ch > 57 && ch < 65 || ch > 90 && ch < 97 || ch > 122) {
                System.out.println("Password must consist only of letters and digits");
                return false;
            }
        }
        return true;
    }




    public static boolean checkNums(String x) {
        int count = 0;
        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            if (48 <= ch && 57 >= ch) {
                count++;
            }
        }
        if (count <= 2) {
            System.out.println("Password must have at least 2 digits");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        boolean checkc = checkChars(x);
        boolean checkl = checkLen(x);
        boolean checkn = checkNums(x);

        if (checkc && checkl && checkn) {
            System.out.println("Password is valid");

        }
    }
}

