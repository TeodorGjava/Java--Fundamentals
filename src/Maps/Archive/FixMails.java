package Maps.Archive;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixMails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Map<String,String> map = new LinkedHashMap<>();
        while (!input.equals("stop")){
            String email = sc.nextLine();
            if(!email.contains(".us")&&!email.contains(".uk")){
                map.put(input,email);
            }
            input=sc.nextLine();
        }
        map.forEach((key,value)->{
            System.out.printf("%s -> %s%n", key,value);
        });
    }
}
