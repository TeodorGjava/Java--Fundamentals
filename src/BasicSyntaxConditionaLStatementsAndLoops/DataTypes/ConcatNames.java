package BasicSyntaxConditionaLStatementsAndLoops.DataTypes;

import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fname = sc.nextLine();
        String lname = sc.nextLine();
        String delim = sc.nextLine();
        System.out.printf("%s%s%s",fname,delim,lname);
    }
}
