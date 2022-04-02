package FinalExamPrepar;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> valid = new ArrayList<>();
        String input = sc.nextLine();
        Pattern pattern = Pattern.compile("(?<gr1>[@][A-z]+[@]{2}[A-z]+[@])|(?<gr2>[#][A-z]+[#]{2}[A-z]+[#])");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            String gr1 = matcher.group("gr1");
            String gr2 = matcher.group("gr2");
            if (gr1 != null) {
                valid.add(gr1);
            }
            if (gr2 != null) {
                valid.add(gr2);
            }

        }
        List<String> passedCheck = new ArrayList<>();

        for (int i = 0; i < valid.size(); i++) {
            StringBuilder one = new StringBuilder();
            StringBuilder two = new StringBuilder();
            String thing = valid.get(i);
            for (int j = 0; j < thing.length() / 2; j++) {
                one.append(thing.charAt(j));
                two.append(thing.charAt(thing.length() - j - 1));
            }
            if (one.toString().equals(two.toString())) {
                passedCheck.add(thing);
            }
        }
        if(!valid.isEmpty()) {
            System.out.printf("%d word pairs found!%n", valid.size());
            System.out.printf("The mirror words are:%n");
        }else{
            System.out.println("No word pairs found!");
            System.out.println("No mirror words!");
        }
        List<String> finalResult = new ArrayList<>();
        for (String s:passedCheck
             ) {
            Pattern pattern1 = Pattern.compile("[#@](?<word>[A-z]+)[@#]{2}(?<word2>[A-z]+)");
            Matcher matcher1 = pattern1.matcher(s);
            while (matcher1.find()){
                finalResult.add(matcher1.group("word")+" <=> "+matcher1.group("word2"));

            }
        }


        String last = String.join(", ",finalResult);
        System.out.println(last);


    }

}
