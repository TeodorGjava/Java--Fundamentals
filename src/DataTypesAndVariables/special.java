package DataTypesAndVariables;

import java.util.Scanner;

public class special {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int x = num.length();
        System.out.println(x);
        int n = Integer.parseInt(num);


        for (int i = 1; i <=n ; i++) {
            int sum = 0;
            boolean isSpecial = false;
            if(i<=10){
            sum+=i;}else{
                int num1 = i%10;
                int num2=i/10;
                sum = num2+num1;
            }
            if (sum==11||sum==5||sum==7){
                System.out.println(i+ " -> True");
            }else {
                System.out.println(i+ " -> False");
            }
        }


    }
}
