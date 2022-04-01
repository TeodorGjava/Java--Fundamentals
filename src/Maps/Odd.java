package Maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Scanner;

public class Odd  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split("\\s");
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        for (String word: line
             ) {
            if(map.containsKey(word.toLowerCase(Locale.ROOT))){
                map.put(word.toLowerCase(Locale.ROOT),map.get(word.toLowerCase(Locale.ROOT)+1));
            }else{
                map.put(word.toLowerCase(Locale.ROOT),1);
            }
        }
        ArrayList<String> odds = new ArrayList<>();
        for (var entry:map.entrySet()){
            if(entry.getValue()%2==1){
                odds.add(entry.getKey());
            }
        }
        String end = String.join(", ",odds);
        System.out.println(end);

    }
}
