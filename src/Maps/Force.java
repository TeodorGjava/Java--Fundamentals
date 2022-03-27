package Maps;

import java.util.*;
import java.util.stream.Collectors;

public class Force {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> command = Arrays.stream(sc.nextLine().split("\\s")).collect(Collectors.toList());
        List<String> list = new ArrayList<>();
        Map<String, List<String>> all = new LinkedHashMap<>();
        while (!command.get(0).equals("Lumpawaroo")) {
            String team = command.get(0);
            String user = command.get(2);
            if(command.contains("|")){
                    if (!all.containsKey(team) && !list.contains(user)) {
                        list.add(user);
                        all.put(team, new ArrayList<>());
                        all.get(team).add(user);
                    } else {
                        break;
                    }}
            if(command.contains("->"))
                switch (command.size()){
                    case 3:
                        String user1=command.get(0);
                        String team1=command.get(2);
                        if(list.contains(user1)&&all.containsKey(team1)){
                            list.remove(user1);

                            for (Map.Entry<String,List<String>>entry: all.entrySet()
                            ) {

                                if(entry.getValue().contains(user1)){
                                    String thing = String.valueOf(entry.getValue());
                                    all.replace(entry.getKey(),entry.getValue(),null);
                                }}
                            all.get(team1).add(user1);
                            System.out.printf("%s joins the %s side!%n",user1,team1);
                        }
                        break;
                    case 4:
                        String fname=command.get(0);
                        String lname = command.get(1);
                        String name = fname+" "+ lname;
                        String teaml=command.get(3);
                        if(!list.contains(name)&&all.containsKey(teaml)) {
                            for (Map.Entry<String,List<String>>entry: all.entrySet()
                                 ) {

                                if(entry.getValue().contains(name)){
                                    String thing = String.valueOf(entry.getValue());
                                    all.replace(entry.getKey(),entry.getValue(),null);
                                }
                            }

                            all.get(teaml).add(name);
                            System.out.printf("%s joins the %s side!%n",name,teaml);
                        }
            }
            command = Arrays.stream(sc.nextLine().split("\\s")).collect(Collectors.toList());
        }
        for (Map.Entry<String,List<String>>entry: all.entrySet()
             ) {
            try{
            if(!entry.getValue().isEmpty()&&!all.get(entry.getKey()).isEmpty()){
                System.out.printf("Side: %s, Members: %d%n",entry.getKey(),entry.getValue().size());
                entry.getValue().forEach(s -> System.out.printf("! %s%n",s));
            }}catch(NullPointerException e){
                break;
            }
        }
    }
}
