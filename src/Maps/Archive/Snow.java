package Fundamentals.BasicSyntax.Maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Snow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Map<String, LinkedHashMap<String,Integer>>dwarfs = new LinkedHashMap<>();
        while (!input.equals("Once upon a time")){
            String[] line = input.split(" <:> ");
            String name = line[0];
            String color = line[1];
            int physics = Integer.parseInt(line[2]);


            input= sc.nextLine();
        }
    }
}
