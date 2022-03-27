package DataTypesAndVariables;

import java.util.Scanner;

public class integerOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());
        int d = Integer.parseInt(sc.nextLine());
        int sum = ((a+b)/ c)*d;
        System.out.println(sum);
    }
}
