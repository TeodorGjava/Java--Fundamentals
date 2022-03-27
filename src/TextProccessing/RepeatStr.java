package TextProccessing;

import java.util.Scanner;

public class RepeatStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        for (int i = 0; i <input.length ; i++) {
            for (int j = 0; j <input[i].length() ; j++) {
                System.out.print(input[i]);
            }
        }
    }
}
