package DataTypesAndVariables.moreEx;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <count ; i++) {
            String input = sc.nextLine();
            String[] parts = input.split(" ");
            String part1 = parts[0];
            String part2= parts[1];
            long num1 = Long.parseLong(part1);
            long num2 = Long.parseLong(part2);
            long biggest = Math.max(num1,num2);
            int sum = 0;
            while (biggest!=0){
                sum += biggest%10;
                biggest/=10;
            }
            System.out.println(Math.abs(sum));
        }
    }
}
