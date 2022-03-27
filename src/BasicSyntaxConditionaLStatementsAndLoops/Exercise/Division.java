package BasicSyntaxConditionaLStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int num=0;
        boolean isdiv= true;
        if (n % 10 == 0) {
            num = 10;
        } else if (n % 7 == 0) {
            num = 7;
        } else if (n % 6 == 0) {
            num = 6;
        } else if (n % 3 == 0) {
            num = 3;
        } else if (n % 2 == 0) {
num = 2;
        } else {
isdiv=false;
        }
if (isdiv){
    System.out.printf("The number is divisible by %d", num);
}else {
    System.out.println("Not divisible");
}

    }
}
