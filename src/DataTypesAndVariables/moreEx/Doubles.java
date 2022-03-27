package DataTypesAndVariables.moreEx;

import java.util.Scanner;

public class Doubles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = Double.parseDouble(sc.nextLine());
        double n2 = Double.parseDouble(sc.nextLine());
        double delta = 0.000001;
        double sum = Math.abs(n1-n2);
        if (sum<=delta){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
