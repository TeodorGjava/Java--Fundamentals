package FinalExamPrepar;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Pattern pattern = Pattern.compile("([#|])(?<product>[A-Za-z\\s]+)\\1(?<date>[0-9]{2}[\\/][0-9]{2}\\/[0-9]{2})\\1(?<cals>[\\d]{1,5})\\1");
        Matcher matcher = pattern.matcher(input);
        List<String> productList = new ArrayList<>();
        int sumCal = 0;
        while (matcher.find()){
            String product = matcher.group("product");
            String date = matcher.group("date");
            int calories =Integer.parseInt(matcher.group("cals"));
           sumCal+=calories;
            productList.add(String.format("Item: %s, Best before: %s, Nutrition: %d", product,date,calories));
        }
        int days = sumCal/2000;
        System.out.println("You have food to last you for: "+ days+" days!");
    productList.forEach(System.out::println);
}}
