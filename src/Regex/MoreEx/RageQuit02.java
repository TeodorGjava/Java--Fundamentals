package Regex.MoreEx;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RageQuit02 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Pattern pattern = Pattern.compile("(?<thing>[\\D]+)(?<times>[\\d]+)");
        Matcher matcher = pattern.matcher(input);
        int unique= 0;
        StringBuilder letters = new StringBuilder();
        while (matcher.find()){
            String thing = matcher.group("thing").toUpperCase(Locale.ROOT);
            int times = Integer.parseInt(matcher.group("times"));
            str.append(thing.toUpperCase(Locale.ROOT).repeat(Math.max(0, times)));
            char[] arr = thing.toCharArray();
            for (char c : arr) {
                if (!letters.toString().contains(String.valueOf(c))) {
                    letters.append(c);
                }
            }
        }
        System.out.println("Unique symbols used: "+ letters.length());
        System.out.println(str);
    }
}
