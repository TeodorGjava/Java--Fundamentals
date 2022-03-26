package BasicSyntaxConditionaLStatementsAndLoops.Lab;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while (n%2!=0){
            System.out.println("Please write an even number.");
            if(n%2==0){
                break;
            }

        }
        System.out.println("The number is: "+n);

    }
}
