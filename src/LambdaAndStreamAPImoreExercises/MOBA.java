package LambdaAndStreamAPImoreExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MOBA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        Map<String, LinkedHashMap<String, Integer>> map = new LinkedHashMap<>();
        while (!line.equals("Season end")) {
            if (line.contains("->")) {
                String[] data = line.split(" -> ");
                String player = data[0];
                String pos = data[1];
                int skill = Integer.parseInt(data[2]);
                if (!map.containsKey(player)) {
                    map.put(player, new LinkedHashMap<>());
                    map.get(player).put(pos, skill);
                    System.out.println(map.get(player).get(pos));
                } else {
                    map.get(player).put(pos,skill);
                    if(map.get(player).containsKey(pos)&& skill > map.get(player).get(pos)){
                        map.get(player).replace(player, map.get(player).get(pos), skill);
                    }

                   //


                }
            } else if (line.contains("vs")) {
                String[] data = line.split(" vs ");
                String player1 = data[0];
                String player2 = data[1];
                if(map.containsKey(player1)&&map.containsKey(player2)){
                    if(map.get(player1).entrySet().equals(map.get(player2).entrySet())){

                    }
                }
            }
            line = sc.nextLine();
        }
    }
}
