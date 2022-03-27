package BasicSyntaxConditionaLStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        StringBuilder pass = new StringBuilder();
        pass.append(username);
        pass.reverse();
        String reversed = pass.toString();
        int count = 0;

        for (int i = 0; i <= 4; i++) {
            count++;
            String input = sc.nextLine();
            if (count >= 4 && !input.equals(reversed)) {

                System.out.println("User " + username + " blocked!");
                break;
            }
            if (input.equals(reversed)) {
                System.out.println("User " + username + " logged in.");
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
            }
        }


    }
}
