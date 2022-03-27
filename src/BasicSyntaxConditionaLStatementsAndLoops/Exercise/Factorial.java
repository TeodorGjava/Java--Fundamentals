package BasicSyntaxConditionaLStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int allfackt = 0;
        int n = Integer.parseInt(input);
        int num = n;
        for (int i = 0; i <input.length() ; i++) {
            int dig = n%10;
            n/=10;
            int fact= 1;
            for (int j = 1; j <=dig ; j++) {
                fact *=  j;
            }
            allfackt+=fact;

        }if (num==allfackt){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

        // len =
        //for (int i = 0; i <  ; i++) {

        //}

        //int factorial = 1;
        //for (int i = 1; i <=n ; i++) {
        //    factorial= factorial*i;

       // }
        //System.out.println(n + " "+ factorial);

    }

}
