package Maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, ArrayList<String>> words = new LinkedHashMap<>();
        for (int i = 0; i <n ; i++) {
            String thing = sc.nextLine();
            String synonym = sc.nextLine();
           words.putIfAbsent(thing,new ArrayList<>());
           words.get(thing).add(synonym);
        }



    }
}
