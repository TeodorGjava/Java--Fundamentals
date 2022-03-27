package LambdaAndStreamAPImoreExercises;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ranking {

    public static void main(String[] args) {
        //You will receive some lines of input in the format "{contest}:{password for contest}"
        // until you receive "end of contests". Save that data because you will need it later.
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(":");
        Map<String, String> contestsAndPasswords = new HashMap<>();
        while (!line[0].equals("end of contests")) {
            String contest = line[0];
            String password = line[1];
            contestsAndPasswords.put(contest, password);
            line = sc.nextLine().split(":");
        }
        String[] line2 = sc.nextLine().split("=>");
        Map<String, LinkedHashMap<String, Integer>> score = new LinkedHashMap<>();
        while (!line2[0].equals("end of submissions")) {
            if (line2.length > 1) {
                String course = line2[0];
                String pass = line2[1];
                String name = line2[2];
                int points = Integer.parseInt(line2[3]);
                if (contestsAndPasswords.containsKey(course) && contestsAndPasswords.containsValue(pass)) {
                    score.putIfAbsent(name, new LinkedHashMap<>());

                        score.get(name).put(course, points);

                }
                score.get(name).put(course, points);

            }
            line2 = sc.nextLine().split("=>");
        }
        //After that, you will receive another type of inputs in the format "{contest}=>{password}=>{username}=>{points}"
        // until you receive "end of submissions".

        //•	Check if the contest is valid (if you received it in the first type of input);
        //•	Check if the password is correct for the given contest;
        //•	Save the user with the contest they take part in (a user can take part in many contests)
        // and the points the user has in the given contest.
        // If you receive the same contest and the same user,
        // update the points only if the new ones are more than the older ones.
        int sum = 0;
        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : score.entrySet()) {
            int x = entry.getValue().values().stream().mapToInt(i -> i).sum();
            if (x > sum) {
                sum = x;
            }
        }
        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : score.entrySet()) {
            if (entry.getValue().values().stream().mapToInt(i -> i).sum() == sum) {
                System.out.printf("Best candidate is %s with total %d points.%n", entry.getKey(), sum);
            }
        }
        score.forEach((k, v) -> {
            System.out.printf("%s%n", k);
            v.entrySet().stream().sorted((x, y) -> y.getValue() - x.getValue()).forEach(i -> System.out.printf("#  %s -> %d%n", i.getKey(), i.getValue()));
        });
    }

}
