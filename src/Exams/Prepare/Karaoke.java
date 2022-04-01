package Exams.Prepare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Karaoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> people = Arrays.stream(sc.nextLine().split("[,]\\s+")).collect(Collectors.toList());
        List<String> songs = Arrays.stream(sc.nextLine().split("[,]\\s+")).collect(Collectors.toList());
        String[] line = sc.nextLine().split("[,]\\s+");
        String command = line[0];
        while (!command.equals("dawn")){
            String song = line[1];
            String award = line[2];


            line=sc.nextLine().split(",");
        }

    }
}
