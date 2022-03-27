package Exams.Prepare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Treasure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = Arrays.stream(sc.nextLine().split("[|]")).collect(Collectors.toList());
        String[] command = sc.nextLine().split(" ");
        while (!command[0].equals("Yohoho!")) {
            switch (command[0]) {
                case "Loot":
                    for (int i = 1; i <= command.length - 1; i++) {
                        if (!list.contains(command[i])) {
                            list.add(0, command[i]);
                        }
                    }
                    break;
                case "Drop":
                    if (Integer.parseInt(command[1]) < list.size() - 1 && Integer.parseInt(command[1]) >= 0) {
                        String thing = list.get(Integer.parseInt(command[1]));
                        list.remove(Integer.parseInt(command[1]));
                        list.add(thing);
                    }
                    break;
                case "Steal":
                    List<String> list2 = new ArrayList<>();
                    int count = Integer.parseInt(command[1]);
                    if (count < list.size()) {
                        for (int i = 0; i < count; i++) {
                            list2.add(0, list.get(list.size() - 1));
                            list.remove(list.size() - 1);
                        }
                    } else {
                        for (int i = 0; i < list.size(); i++) {
                            if (i == count) {
                                System.out.print(list.get(0));
                                list.remove(list.get(0));
                            } else {
                                System.out.print(list.get(0) + ", ");
                                list.remove(list.get(0));
                            }
                        }

                    }
                    for (int i = 0; i < list2.size(); i++) {
                        if (i == list2.size() - 1) {
                            System.out.print(list2.get(i));
                        } else {
                            System.out.print(list2.get(i) + ", ");
                        }
                    }
                    break;
            }
            command = sc.nextLine().split(" ");
        }
        double sumlenght = 0;
        double avg = 0;
        for (int i = 0; i < list.size(); i++) {
            sumlenght += list.get(i).length();
        }
        avg = sumlenght / list.size();
        if (list.size() == 0) {
            System.out.println("Failed treasure hunt.");
        } else {
            System.out.println();
            System.out.printf("Average treasure gain: %.2f pirate credits", avg);
        }
    }
}
