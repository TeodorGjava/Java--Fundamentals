package MidExam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CoffeeLover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> coffees = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            List<String> commands = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
            String command = commands.get(0);
            switch (command) {
                case "Include":
                    coffees.add(commands.get(1));
                    break;
                case "Remove":
                    String firstOrLast = commands.get(1);
                    int numCoffees = Integer.parseInt(commands.get(2));
                    int count = coffees.size() - numCoffees;
                    if (numCoffees <= coffees.size()) {
                        switch (firstOrLast) {
                            case "first":
                                while (coffees.size() > count) {
                                    coffees.remove(0);
                                }
                                break;
                            case "last":
                                while (coffees.size() > count) {
                                    coffees.remove(coffees.size() - 1);
                                }
                                break;
                        }
                    }
                    break;
                case "Prefer":
                    int firstIndex = Integer.parseInt(commands.get(1));
                    int secondIndex = Integer.parseInt(commands.get(2));
                    if (firstIndex >= 0 && firstIndex < coffees.size() && secondIndex >= 0 && secondIndex < coffees.size()) {
                        String firstCoffee = coffees.get(firstIndex);
                        String secondCoffee = coffees.get(secondIndex);

                        coffees.set(firstIndex, secondCoffee);
                        coffees.set(secondIndex, firstCoffee);
                        break;
                    }
                    break;
                case "Reverse":
                    Collections.reverse(coffees);
                    break;
            }
        }
        System.out.println("Coffees:");
        System.out.println(String.join(" ", coffees));
    }
}
