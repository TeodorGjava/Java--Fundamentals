package DataTypesAndVariables;

import java.util.Scanner;

public class sumChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;

        for (int i = 0; i <n ; i++) {
            String ch = sc.nextLine();
            int x = ch.charAt(0);
            sum+=x;

        }
        System.out.println("The sum equals: "+sum);
    }
}
