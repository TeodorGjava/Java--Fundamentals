package BasicSyntaxConditionaLStatementsAndLoops.Lab;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //new passed();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int num=1;
        System.out.println(num);
        for (int i = 0; i <n ; i++) {
            if(n%2==1){
                num+=2;
                System.out.println(num);
            }
        }
    }
}
