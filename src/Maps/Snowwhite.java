package Maps;

import java.util.*;

public class Snowwhite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, LinkedHashMap<String, Integer>> map = new LinkedHashMap<>();
        String input = sc.nextLine();
        while (!input.equals("Once upon a time")){
            String[] line = input.split(" <:> ");
            String name = line[0];
            String color = line[1];
            int points = Integer.parseInt(line[2]);
            if(!map.containsKey(name)){
                map.put(name,new LinkedHashMap<>());
                map.get(name).put(color,points);}
                if(map.containsKey(name)&&map.get(name).containsKey(color)){
                    int dwarf1 = map.get(name).get(color);
                    int newdwarf1 = points;
                    if(newdwarf1 > dwarf1){
                        map.remove(map.get(name).get(color));
                        map.put(name,new LinkedHashMap<>());
                        map.get(name).put(color,points);
                    }else{
                    }
                }
                if(map.containsKey(name)&&!map.get(name).containsKey(color)){
                    map.put(name, new LinkedHashMap<>());
                    map.get(name).put(color,points);
                }
            input=sc.nextLine();
            }

            for(Map.Entry<String, LinkedHashMap<String ,Integer>>entry : map.entrySet()){

                entry.getValue().entrySet().stream().sorted((x,y)->y.getValue()-x.getValue()).forEach(x->{
                    System.out.printf("(%s) %s <-> %d",x.getKey(),entry.getKey(),x.getValue());
                });



            }
        }

    }

