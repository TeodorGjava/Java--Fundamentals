package Exams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> inv = Arrays.stream(sc.nextLine().split(", ")).collect(Collectors.toList());
        String[] command = sc.nextLine().split(" ");
        while (!command[0].equals("Craft!")) {
            switch (command[0]) {
                case "Collect":
                    if (inv.contains(command[2])) {
                        break;
                    } else {
                        inv.add(command[2]);
                    }
                    break;
                case "Drop":
                    if (inv.contains(command[2])) {
                        inv.remove(command[2]);
                    } else {
                        break;
                    }
                    break;
                case "Combine":
                    String[] items = command[command.length - 1].split("[:]");
                    for (int j = 0; j < items.length; j++) {
                        if (inv.contains(items[0])) {
                            inv.add(inv.indexOf(items[0]) + 1, items[1]);
                            break;
                        }
                    }
                    break;
                case "Renew":
                    if (inv.contains(command[2])) {
                        inv.add(command[2]);
                        inv.remove(0);
                    }
                    break;
            }
            command = sc.nextLine().split(" ");
        }
        for (int i = 0; i < inv.size(); i++) {
            if (i == inv.size() - 1) {
                System.out.print(inv.get(i));
            } else {
                System.out.print(inv.get(i) + ", ");
            }
        }
    }
}
