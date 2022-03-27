package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // (?<month>[A-Z][a-z]{2})
        // id na grupa month = id 1 glavna bukva tochno 2 malki
        //?: skipva purvata grupa
        // regex grupa se pravi sus ()
        // zadavane na dopustimi stojnosti (Jan|Feb|Mar|Apr|May|June|July)- boolean
        //Simvola "?" che moje da se sreshtne moje i da ne se
        String regex = "\\b(?<day>\\d{2})([-.\\/])(?<month>[A-Z][a-z]{2})\\2(?<year>[0-9]{4})";
        Pattern pattern = Pattern.compile(regex);
         String input = sc.nextLine();
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            String day = matcher.group("day");
            String month = matcher.group("month");
            String year = matcher.group("year");
            System.out.printf("Day: %s, Month: %s, Year: %s%n",day,month,year);
        }
    }
}
