package Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Juddggge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, LinkedHashMap<String, Integer>> contests = new LinkedHashMap<>();
        String[] line = sc.nextLine().split(" -> ");
        while (!line[0].equals("no more time")) {
            String contest = line[1];
            String user = line[0];
            int points = Integer.parseInt(line[2]);
            if(!contests.containsKey(contest)){
                contests.put(contest, new LinkedHashMap<>());
                contests.get(contest).put(user,points);
            }else{
                if(contests.get(contest).containsKey(user)&&contests.get(contest).get(user)<points){
                    contests.get(contest).put(user,points);
                }else{contests.get(contest).put(user,points);}
            }
            line = sc.nextLine().split(" -> ");
        }
        AtomicInteger num = new AtomicInteger(1);

        contests.entrySet().stream().forEach(e -> {
            num.set(1);
            System.out.println(e.getKey() + ": " + e.getValue().size() + " participants");
            e.getValue().entrySet().stream().sorted((k2, k1) -> {
                int sort = Integer.compare(k1.getValue(), k2.getValue());
                if (sort == 0) {
                    sort = k2.getKey().compareTo(k1.getKey());

                }
                return sort;
            }).forEach(element -> {
                System.out.printf("%d. %s <::> %d\n", num.getAndIncrement(), element.getKey(), element.getValue());
            });
        });

        Map<String, Integer> standings = new LinkedHashMap<>();

        for(Map.Entry<String, LinkedHashMap<String, Integer>> wtf : contests.entrySet()) {
            for (Map.Entry<String, Integer> lol : wtf.getValue().entrySet()) {
                standings.putIfAbsent(lol.getKey(), 0);
                standings.put(lol.getKey(), standings.get(lol.getKey()) + lol.getValue());
            }
        }
        System.out.println("Individual standings:");
        num.set(1);

        standings.entrySet().stream().sorted((e2, e1) -> {
            int sort = Integer.compare(e1.getValue(), e2.getValue());
            if (sort == 0) {
                sort = e2.getKey().compareTo(e1.getKey());
            }
            return sort;

        }).forEach(element -> {
            System.out.printf("%d. %s -> %d\n", num.getAndIncrement(), element.getKey(), element.getValue());
        });




    }
}