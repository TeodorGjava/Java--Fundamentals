package TextProccessing.lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class digitsLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String regexnumbers = "(?<digits>[\\d]+)";
        String regexLetters = "(?<letters>[a-zA-Z]+)";
        String regex = "(?<chars>[\\W])";
        Pattern numbers = Pattern.compile(regexnumbers);
        Pattern letters = Pattern.compile(regexLetters);
        Pattern chars = Pattern.compile(regex);

        Matcher matcherNums = numbers.matcher(input);
        while (matcherNums.find()){
            System.out.print(matcherNums.group());
        }
        System.out.println();
        Matcher matcherLett = letters.matcher(input);
        while (matcherLett.find()){
            System.out.print(matcherLett.group());
        }
        System.out.println();
        Matcher matcherChars = chars.matcher(input);
        while (matcherChars.find()){
            System.out.print(matcherChars.group());
        }
    }
}
