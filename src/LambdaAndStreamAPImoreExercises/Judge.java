package LambdaAndStreamAPImoreExercises;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Judge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, LinkedHashMap<String, Integer>> contests = new LinkedHashMap<>();
        String[] line = sc.nextLine().split(" -> ");
        Map<String, Integer> individualPoints = new LinkedHashMap<>();
        while (!line[0].equals("no more time")) {
            String contest = line[1];
            String user = line[0];
            int points = Integer.parseInt(line[2]);
            if (!contests.containsKey(contest)) {
                contests.put(contest, new LinkedHashMap<>());
                contests.get(contest).put(user, points);
                if (!individualPoints.containsKey(user)) {
                    individualPoints.put(user, points);
                } else {
                    if (contests.get(contest).get(user) < points) {
                        individualPoints.replace(user, points);
                    } else {
                        individualPoints.replace(user, individualPoints.get(user) + points);
                    }
                }
            } else {
                contests.get(contest).put(user, points);
                if (!individualPoints.containsKey(user)) {
                    individualPoints.put(user, points);
                } else {
                    if (individualPoints.get(user) < points) {
                        individualPoints.replace(user, points);
                    } else {
                        individualPoints.replace(user, individualPoints.get(user) + points);
                    }
                }
            }
            line = sc.nextLine().split(" -> ");
        }
        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : contests.entrySet()) {
            System.out.printf("%s: %d participants%n", entry.getKey(), entry.getValue().size());
            int[] num = new int[1];
            entry.getValue().entrySet().stream().sorted((x, y) -> x.getKey().compareTo(y.getKey()))
                    .sorted((x, y) -> y.getValue() - x.getValue()).forEach(x -> System.out.printf("%d. %s <::> %d%n", ++num[0], x.getKey(), x.getValue()));
        }
        individualPoints.forEach((key, value) -> {
        });
        int[] num = new int[1];
        System.out.println("Individual standings:");
        individualPoints.entrySet().stream().sorted((x, y) -> x.getKey().compareTo(y.getKey())).sorted((x, y) -> Integer.compare(y.getValue(), x.getValue())).forEach(i -> System.out.printf("%d. %s -> %d%n", ++num[0], i.getKey(), i.getValue()));

//Peter -> OOP -> 350
//George -> OOP -> 250
//Sam -> Advanced -> 600
//George -> OOP -> 300
//Pitter -> OOP -> 300
//Pitter -> Advanced -> 250
//Anna -> JSCore -> 400
//no more time
// Peter -> OOP -> 250
//George -> OOP -> 250
//Pitter -> OOP -> 250
//no more time

    }
}

