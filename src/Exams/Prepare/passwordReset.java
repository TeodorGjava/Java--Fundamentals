package Exams.Prepare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class passwordReset {
    //Siiceercaroetavm!:?:ahsott.:i:nstupmomceqr
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String[] command = sc.nextLine().split(" ");
        while (!command[0].equals("Done")) {
            switch (command[0]) {
                case "TakeOdd":
                    String temp = "";
                    for (int i = 1; i < first.length(); i+=2) {
                        temp += first.charAt(i);
                    }
                    first = temp;
                    System.out.println(temp);
                    break;
                case "Cut":
                    int index = Integer.parseInt(command[1]);
                    int len = Integer.parseInt(command[2]);
                    String firstPart = first.substring(0, index);
                    String secondPart = first.substring(index + len);
                    first = firstPart + secondPart;
                    System.out.println(first);
                    break;
                case "Substitute":
                    String subString = command[1];
                    String subStitute = command[2];
                    String tempo = "";
                    if (first.contains(String.valueOf(subString))) {
                        tempo = first.replaceAll(subString, subStitute);
                        first=tempo;
                        System.out.println(tempo);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            command = sc.nextLine().split(" ");
        }
        System.out.println("Your password is: " + first);
    }

}
