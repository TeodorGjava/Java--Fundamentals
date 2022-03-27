package DataTypesAndVariables.moreEx;

import java.util.Scanner;

public class Spice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yield = Integer.parseInt(sc.nextLine());
        int harvest = 0;
        int count = 0;
        for (int i = yield; i >=100 ; i-=10) {
            harvest+=i-26;
            count ++;
        }
        harvest-=26;
        System.out.println(count);
        System.out.println(harvest);
    }
}
