package Regex;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Barincome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Pattern pattern = Pattern.compile("^%(?<customer>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|" +
                "(?<count>\\d+)\\|[^|$%.]*?(?<price>[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?)\\$");
        List<Double> stock = new LinkedList<>();
        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                String client = matcher.group("customer");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                System.out.printf("%s: %s - %.2f%n" ,client,product,count*price);
                stock.add(count*price);
            }

            input = sc.nextLine();
        }
        double sum = 0;
        for (Double x:stock
             ) {
            sum+=x;
        }
        System.out.printf("Total income: %.2f",sum);
    }
}
