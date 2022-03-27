package BasicSyntaxConditionaLStatementsAndLoops.DataTypes;

import java.util.Scanner;

public class upper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char x = input.charAt(0);
        int z = x;

        if (z<=90){
            System.out.println("upper-case");
        }else{
            System.out.println("lower-case");
        }
    }
}
