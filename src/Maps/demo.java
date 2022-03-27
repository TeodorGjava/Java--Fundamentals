package Maps;

import java.util.*;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        int count = 1;
        int count1 = 2;
        List<String> list = new ArrayList<>();
        List<Integer> intlist = new ArrayList<>();
        Map<String,Integer> stock = new LinkedHashMap<>();

        while (!command.equals("stop")) {
            if (count % 2 == 1) {
                list.add(command);
            }
            if(count%2==0){
                intlist.add(Integer.parseInt(command));
            }
            count++;
            command = sc.nextLine();
        }
        for (int i = 0; i < intlist.size() ; i++) {
            if(!stock.containsKey(list.get(i))){
                stock.put(list.get(i),intlist.get(i));
            }else{
                stock.replace(list.get(i),stock.get(list.get(i)),stock.get(list.get(i))+intlist.get(i));
            }
        }
        for (Map.Entry<String, Integer> entry:stock.entrySet()
        ) {
            System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue());
        }


    }
}
