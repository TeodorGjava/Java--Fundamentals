package Exams.Prepare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Treasure2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> chest = Arrays.stream(sc.nextLine().split("[|]")).collect(Collectors.toList());
        String[] command = sc.nextLine().split(" ");
        List<String> lost = new ArrayList<>();
        while (!command[0].equals("Yohoho!")) {
            switch (command[0]) {
                case "Loot":
                    for (int i = 0; i < command.length; i++) {
                        if (!chest.contains(command[i]) && i != 0) {
                            chest.add(0, command[i]);
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(command[1]);
                    if (index < chest.size() && index >= 0) {
                        String thing = chest.get(index);
                        chest.remove(index);
                        chest.add(thing);
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(command[1]);
                    if (count >= chest.size()) {
                        lost = chest;
                    } else {
                        for (int i = 0; i < count; i++) {
                            lost.add(i, chest.get(chest.size() - 1));
                            chest.remove(chest.size() - 1);
                        }
                        for (int i = lost.size() - 1; i >= 0; i--) {
                            if (i == 0) {
                                System.out.print(lost.get(i) + "\n");
                            } else {
                                System.out.print(lost.get(i) + ", ");
                            }
                        }
                    }
                    break;
            }
            command = sc.nextLine().split(" ");
        }
        if (chest.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            double sumLen = 0;
            for (int i = 0; i < chest.size(); i++) {
                sumLen += chest.get(i).length();
            }
            double avg = sumLen / chest.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.", avg);
        }
    }
}
