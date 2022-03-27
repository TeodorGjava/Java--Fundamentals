package DataTypesAndVariables;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int input = Integer.parseInt(word);
        int sum = 0;
        int num = 0;
        for (int i = 0; i < word.length() ; i++) {
            num = input%10;
            sum +=num;
            input/=10;

        }
        System.out.println(sum);
    }
}
