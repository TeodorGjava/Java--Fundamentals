package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Travel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         List<String> list = Arrays.stream(sc.nextLine().split("\\s+\\p{Punct}+")).collect(Collectors.toList());
         String[] command = sc.nextLine().split("\\p{Punct}");
         while (!command[0].equals("Travel")){
             switch (command[0]){
                 case "Add Stop":
                    if(Integer.parseInt(command[1])>=list.size()) {
                        break;
                    }else {
                        List<String > strings = new ArrayList<>();

                    }
                 case "Remove Stop":

                     break;
                 case "Switch":

                     break;
             }
             command= sc.nextLine().split("\\s+\\p{Punct}+:");
         }
    }
}
