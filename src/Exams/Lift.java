package Exams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = Integer.parseInt(sc.nextLine());

        List<Integer> cabins = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        for (int i = 0; i < cabins.size(); i++) {
            if (people == 0) {
                for (int j = 0; j < cabins.size(); j++) {
                    System.out.print(cabins.get(i) + " ");
                }
                break;
            }
            if (people < 0) {
                System.out.println("The lift has empty spots!");
                for (int j = 0; j < cabins.size(); j++) {
                    System.out.print(cabins.get(i) + " ");
                }
                break;
            }
            if (cabins.get(i) == 0) {
                cabins.set(i, 4);
                if (people < 4) {
                    System.out.println("The lift has empty spots!");
                    for (int j = 0; j < cabins.size(); j++) {
                        System.out.print(cabins.get(i) + " ");
                    }
                    people -= people;
                } else {
                    people -= 4;
                }
            } else {
                people -= 4 - cabins.get(i);
                cabins.set(i, 4);
            }
        }
        if (people > 0) {
            System.out.printf("There isn't enough space! %s people in a queue!\n", people);
            for (int i = 0; i < cabins.size(); i++) {
                System.out.print(cabins.get(i) + " ");
            }
        }
    }
}
