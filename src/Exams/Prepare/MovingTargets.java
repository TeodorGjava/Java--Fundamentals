package Exams.Prepare;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTargets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String[] command = sc.nextLine().split("\\s+");
        while (!command[0].equals("End")) {
            switch (command[0]) {
                case "Shoot":
                    int index = Integer.parseInt(command[1]);
                    int power = Integer.parseInt(command[2]);
                    if (power >= 0 && index < list.size()) {
                        list.set(index, list.get(index) - power);
                        if (list.get(index) <= 0) {
                            list.remove(index);
                        }
                    }
                    break;
                case "Add":
                    index = Integer.parseInt(command[1]);
                    int value = Integer.parseInt(command[2]);
                    if (index < list.size() && index >= 0) {
                        list.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    index = Integer.parseInt(command[1]);
                    int radius = Integer.parseInt(command[2]);
                    if (radius > 0) {
                        int start = index - radius;
                        int end = index + radius;
                        if (index < list.size() && start >= 0 && end < list.size()) {
                            list.subList(start, end + 1).clear();
                        } else {
                            System.out.println("Strike missed!");
                        }
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }
            command = sc.nextLine().split("\\s+");
        }
        getPrintListWithRegex(list);
    }
    private static void getPrintListWithRegex(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i < list.size() - 1) {
                System.out.print(list.get(i) + "|");
            } else {
                System.out.print(list.get(i));
            }
        }
    }
}
