package BasicSyntaxConditionaLStatementsAndLoops.moreEx;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuffer x = new StringBuffer();
                x.append(input);
                x.reverse();
        System.out.println(x);
    }
}
