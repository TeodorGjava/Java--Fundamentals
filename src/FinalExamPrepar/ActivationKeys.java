package FinalExamPrepar;

import java.util.Locale;
import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder input = new StringBuilder(sc.nextLine());
        String command = sc.nextLine();
        while (!command.equals("Generate")){
            String[] line = command.split(">>>");
            switch (line[0]){
                case"Contains":
                    contains(input,line[1]);
                    break;
                case"Flip":
                    flip(input,line[1],Integer.parseInt(line[2]),Integer.parseInt(line[3]));
                    break;
                case"Slice":
                    slice(input,Integer.parseInt(line[1]),Integer.parseInt(line[2]));
                    break;
            }
            command = sc.nextLine();
        }
        System.out.println("Your activation key is: "+ input);
    }

    private static void slice(StringBuilder input, int start, int end) {
        input.replace(start,end,"");
        System.out.println(input);
    }

    private static void flip(StringBuilder input, String command, int start, int end) {
        StringBuilder str = new StringBuilder();
        String firstPart = input.substring(0,start);
        String secondPart = input.substring(end,input.length());
        String middle = input.substring(start,end);
        if(command.equals("Upper")){
            str.append(firstPart);
            str.append(middle.toUpperCase(Locale.ROOT));
            str.append(secondPart);
            input.setLength(0);
            input.append(str);
            System.out.println(input);
        }
        if(command.equals("Lower")){
            str.append(firstPart);
            str.append(middle.toLowerCase(Locale.ROOT));
            str.append(secondPart);
            input.setLength(0);
            input.append(str);
            System.out.println(input);
        }


    }

    private static void contains(StringBuilder key, String substring) {
    String thing = key.toString();
        if(thing.contains(substring)){
        System.out.println(thing+" contains "+substring);
    }else{
        System.out.println("Substring not found!");
    }
    }
}
