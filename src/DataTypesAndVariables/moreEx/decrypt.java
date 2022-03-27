package DataTypesAndVariables.moreEx;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class decrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = Integer.parseInt(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());
        String result = "";
        for (int i = 0; i <n ; i++) {
            String ch = sc.nextLine();
            char ch1 = ch.charAt(0);
            int num = (int)ch1 +key;
            char x = (char) num;
            result+=x;
        }
        System.out.println(result);

    }
}
