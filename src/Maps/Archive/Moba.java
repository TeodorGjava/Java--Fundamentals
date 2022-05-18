package Fundamentals.BasicSyntax.Maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Moba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, LinkedHashMap<String, Integer>> players = new LinkedHashMap<>();
        String command = sc.nextLine();
        while (!command.equals("Season end")) {
            if (command.contains(" -> ")) {
                String[] line = command.split(" -> ");
                String name = line[0];
                String position = line[1];
                int power = Integer.parseInt(line[2]);
                if (!players.containsKey(name)) {
                    players.put(name, new LinkedHashMap<>());
                    players.get(name).put(position, power);
                } else {
                    players.get(name).put(position, power);
                }
            }
            if (command.contains("vs")) {
                boolean hasCommon = false;
                String[] line = command.split(" vs ");
                String player1 = line[0];
                String player2 = line[1];
                if (players.containsKey(player1) && players.containsKey(player2)) {
                    for (String position1 : players.get(player1).keySet()
                    ) {
                        for (String position2 : players.get(player2).keySet()
                        ) {
                            if (position1.equals(position2)) {
                                hasCommon = true;
                            }
                        }
                    }
                    if (hasCommon) {
                        if (players.get(player1).values().stream().mapToInt(i -> i).sum() >
                                players.get(player2).values().stream().mapToInt(i -> i).sum()) {
                            players.remove(player2);
                        } else if (players.get(player1).values().stream().mapToInt(i -> i).sum() <
                                players.get(player2).values().stream().mapToInt(i -> i).sum()) {
                            players.remove(player1);
                        }
                    }
                }
            }
            command = sc.nextLine();
        }
        players.entrySet().stream().sorted((p1, p2) -> {
            int result = Integer.compare(p2.getValue().values().stream().mapToInt(i -> i).sum(), p1.getValue().values().stream().mapToInt(i -> i).sum());
            if (result == 0) {
                result = p1.getKey().compareTo(p2.getKey());
            }
            return result;
        }).forEach(entry -> {
            System.out.printf("%s: %d skill%n", entry.getKey(), entry.getValue().values().stream().mapToInt(i -> i).sum());
            entry.getValue()
                    .entrySet()
                    .stream()
                    .sorted((e1, e2) -> {
                        int x = Integer.compare(e2.getValue(), e1.getValue());
                        if (x == 0) {
                            x = e1.getKey().compareTo(e2.getKey());
                        }
                        return x;
                    }).forEach(e -> {
                        System.out.printf("- %s <::> %d%n", e.getKey(), e.getValue());
                    });
        });
    }
}

