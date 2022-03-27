package TextProccessing.lab;

import java.util.Scanner;

public class ReverseStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.equals("end")) {
            StringBuilder reversed = new StringBuilder(input);
            reversed.reverse();
            System.out.println(input+" = "+reversed);
            input = sc.nextLine();
        }
    }
}
