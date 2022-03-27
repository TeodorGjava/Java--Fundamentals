package Regex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String regex = "[>]{2}(?<name>[\\w]+)[<]{2}(?<price>[\\d.]+)[!](?<qant>[\\d]+)";
        Pattern pat = Pattern.compile(regex);
        double sum =0;
        List<String> things = new LinkedList<>();

        while (!line.equals("Purchase")) {
            Matcher matcher = pat.matcher(line);
            while (matcher.find()){
                String name = matcher.group("name");
                double price = Double.parseDouble(matcher.group("price"));
                double quant= Double.parseDouble(matcher.group("qant"));
                things.add(name);
                sum += price*quant;
            }
            line = sc.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String thing :things
             ) {
            System.out.println(thing);
        }
        System.out.printf("Total money spend: %.2f", sum);
    }
}
