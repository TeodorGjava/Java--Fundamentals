package FinalExamPrepar;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pianist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, Map<String, String>> pieces = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split("[|]");
            String piece = line[0];
            String composer = line[1];
            String key = line[2];
            pieces.put(piece, new LinkedHashMap<>());
            pieces.get(piece).put(composer, key);


        }
        String command = sc.nextLine();
        while (!command.equals("Stop")) {
            String line[] = command.split("[|]");
            String action = line[0];
            switch (action) {
                case "Add":
                    add(pieces, line[1], line[2], line[3]);
                    break;
                case "Remove":
                    remove(pieces, line[1]);
                    break;
                case "ChangeKey":
                        changeKey(pieces,line[1],line[2]);
                    break;
            }
            command = sc.nextLine();
        }
        pieces.forEach((x,y)->{
            y.entrySet().stream().forEach(z->{
                System.out.printf("%s -> Composer: %s, Key: %s%n",x,z.getKey(),z.getValue());
            });
        });
    }

    private static void changeKey(Map<String, Map<String, String>> pieces, String piece, String key) {
        if(pieces.containsKey(piece)){
           pieces.get(piece).forEach((y, value) -> pieces.get(piece).replace(y, key));
            System.out.printf("Changed the key of %s to %s!%n",piece,key);
        }else{
            System.out.printf("Invalid operation! %s does not exist in the collection.%n",piece);
        }
    }

    private static void remove(Map<String, Map<String, String>> pieces, String piece) {
        if (pieces.containsKey(piece)) {
            pieces.remove(piece);
            System.out.println("Successfully removed " + piece+"!");
        } else {
            System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
        }
    }

    private static void add(Map<String, Map<String, String>> pieces, String piece, String comp, String key) {
        if (!pieces.containsKey(piece)) {
            pieces.put(piece, new LinkedHashMap<>());
            pieces.get(piece).put(comp, key);
            System.out.printf("%s by %s in %s added to the collection!%n",piece,comp,key);
        } else {
            System.out.println(piece + " is already in the collection!");
        }
    }
}
