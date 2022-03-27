package FinalExamPrepar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Pattern pat1 = Pattern.compile("([=\\/])(?<name>[A-Z][A-Za-z]{2,})\\1");

        Matcher mat1 = pat1.matcher(input);
        List<String> list = new ArrayList<>();
        boolean isFound = mat1.find();
        while (isFound){
            list.add(mat1.group("name"));
            isFound = mat1.find();
        }


        System.out.println("Destinations: "+ String.join(", ", list));
        System.out.println("Travel Points: "+list.stream()
                .mapToInt(String::length)
                .sum());
    }


}
