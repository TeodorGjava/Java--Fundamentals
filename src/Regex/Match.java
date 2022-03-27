package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Match {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";
        String names = sc.nextLine();

        Pattern patern = Pattern.compile(regex);
        Matcher matcher = patern.matcher(names);
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");

        }
    }
}
