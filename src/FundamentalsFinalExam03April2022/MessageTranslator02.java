package FundamentalsFinalExam03April2022;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageTranslator02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <n ; i++) {
            String input = sc.nextLine();
            String regex = "([!])(?<command>[A-Z][a-z]{2,})\\1[:][\\[](?<message>[A-z]{8,})[]]";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if(matcher.matches()){
                String command = matcher.group("command");
                String message = matcher.group("message");
                char[] ch = message.toCharArray();
                System.out.print(command+": ");
                for (char c : ch) {
                    System.out.print((int) c + " ");
                }
                System.out.println();
            }else{
                System.out.println("The message is invalid");
            }
        }
    }
}
