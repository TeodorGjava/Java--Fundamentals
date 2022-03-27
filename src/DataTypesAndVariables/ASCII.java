package DataTypesAndVariables;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        for (int i = a; i <=b ; i++) {
            char ch = (char) i;
            System.out.print(ch+" ");
        }
    }
}
