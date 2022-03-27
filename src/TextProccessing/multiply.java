package TextProccessing;

import java.util.Scanner;

public class multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int x = Integer.parseInt(sc.nextLine());
        int reminder = 0;
        StringBuilder strBuilder = new StringBuilder();
        for (int i = a.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(String.valueOf(a.charAt(i)));
            int product = digit * x + reminder;
            if (i == 0) {
                strBuilder.insert(0, product);
            } else {
                int digitToAdd = product % 10;
                reminder= product/10;
                strBuilder.insert(0,digitToAdd);
            }
        }
        while(strBuilder.charAt(0)=='0'&&strBuilder.length()>1){
            strBuilder.deleteCharAt(0);
        }
        System.out.println(strBuilder.toString());
    }
}
